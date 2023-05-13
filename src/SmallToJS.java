import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class SmallToJS extends SmallBaseListener {
    String traduccion_for = "";
    String traduccion_while = "";
    String traduccion_funcion = "";
    String traduccion_array = "";
    // Variable that is checked to determine if expressions low in the syntax tree should be translated (In some cases when in need of custom translations)
    Boolean shouldTranslate = true;
    /*
     * Private method for stacks
     */
    private static Set<String> stackNames = new HashSet<String>();

    private void declareStack(String name){
        if (!this.stackNames.contains(name)){
            String nameToAdd = getNewName(name);
            stackNames.add(nameToAdd);
            System.out.printf("var %s=[];\n", nameToAdd);
        }
    }

    /*
    * Check if id name is js reserved word
    */
    String[] jsReservedWords = {"abstract", "arguments", "await", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "debugger", "default", "delete", "do", "double", "else", "enum", "eval", "export", "extends", "false", "final", "finally", "float", "for", "function", "goto", "if", "implements", "import", "in", "instanceof", "int", "interface", "let", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "true", "try", "typeof", "var", "void", "volatile", "while", "with", "yield"};

    private boolean checkIfReservedWord (String name){
        for (String reservedWord : jsReservedWords){
            if (reservedWord.equals(name))
                return true;
        }
        return false;
    }

    private String getNewName(String name){
        String newName = name;
        if (checkIfReservedWord(name)){
            newName += "_var";
        }
        return newName;
    }
    /*
     * Check if variable has already been declared
     */
    private static Set<String> variableNames = new HashSet<String>();
    private void declareVariable(String name){
        if (!this.variableNames.contains(name) && !this.declaredDObjects.contains(name)){
            variableNames.add(name);
            System.out.printf("var ", name);
        }
    }

    /*
     * Private methods for array translation
     */
    private static Set<String> declaredDObjects = new HashSet<String>();
    private boolean updateDeclaredObjectsSet(String arrayName){
        if(!this.declaredDObjects.contains(arrayName)){
            declaredDObjects.add(arrayName);
            return true;
        }
        return false;
    }
    private void printNewObject(String key){
        String declareObject = "";
        String[] keyArray = key.split(" ");
        if (keyArray.length == 1)
            declareObject += "var ";
        declareObject += keyArray[0];
        for(int i=1; i<keyArray.length; i++){
            declareObject += "[" + keyArray[i] + "]";
        }
        declareObject += " = {};";
        System.out.println(declareObject);

        traduccion_array += declareObject + "\n";
        if (funciones_etiquetas.size() != 0) {
            funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                    1) + traduccion_array);
        }
        traduccion_array = "";
    }
    private void checkObjectDeclaration(SmallParser.Va_op_dimContext ctx){
        // Check if the dictionaries(arrays) have already been declared, if not, create the necessary arrays and nestings
        ParserRuleContext parent = ctx.getParent();
        ParseTree firstChild = ctx.getChild(0);
        if(firstChild != null ){
            if (parent.getRuleIndex() == 6){
                ParserRuleContext idContext = parent.getParent().getParent();
                ParseTree ID = idContext.getChild(0);
                String variable = getNewName(ID.getText());
                String indexation = variable + " " + ctx.getText().replace(']',' ').replace("[","").strip();
                String[] indexationArray = indexation.split(" ");
                String key = "";
                for (int i=0; i<indexationArray.length - 1; i++){
                    key += indexationArray[i]+" ";
                    boolean updated = this.updateDeclaredObjectsSet(key.strip());
                    if (updated){
                        printNewObject(key.strip());
                    }
                }
            }
        }
    }

    /*
     * FOR LOOPS
     * */
    @Override
    public void enterF(SmallParser.FContext ctx){
        //  For (let ID VA; ID <= EX; ID+=STEP){
        System.out.print("for(let ");

        String id = getNewName(ctx.ID().getText());
        System.out.print(id);
        String va = ctx.va().getText();
        System.out.print(va);
        System.out.print(";");

        System.out.print(id);
        System.out.print("<=");
        String ex = ctx.ex().getText();
        System.out.print(ex);
        System.out.print(";");
        traduccion_for += "for(let " + id + va + ";" + id + "<=" + ex + ";";

        SmallParser.St1Context st1 = ctx.st().st1();
        if(st1 != null){
            System.out.print(id);
            System.out.print("+=");
            System.out.print(st1.getText());
            traduccion_for += id + "+=" + st1.getText();
        }else{
            System.out.print(id);
            System.out.print("++");
            traduccion_for += id + "++";
        }

        System.out.println("){");
        traduccion_for += "){\n";

        // Don't translate the expressions in the for loop header
        shouldTranslate = false;
    }
    @Override
    public void exitF(SmallParser.FContext ctx){
        // }
        System.out.println("}");
        traduccion_for += "}\n";
        if (funciones_etiquetas.size() != 0) {
            funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                    1) + traduccion_for);
        }
        traduccion_for = "";
    }

    @Override
    public void enterFsl(SmallParser.FslContext ctx){
        shouldTranslate = true;
    }

    /*
     * WHILE LOOPS
     * */
    @Override
    public void enterW(SmallParser.WContext ctx){
        //    While ( EX ) {
        TerminalNode id = ctx.ex().eb().er().es().em().d().ID();
        if(id != null){
            //System.out.print("var ");
            //System.out.print(id);
            //System.out.println(";");
            traduccion_while += "var " + id + ";\n";
        }
        System.out.print("while(");

        //String ex = ctx.ex().getText();

        //System.out.print(ex);

        //System.out.println("){");

        //traduccion_while += "while(" + ex + "){\n";
    }
    @Override
    public void exitW(SmallParser.WContext ctx){
        // }
        System.out.println("}");
        traduccion_while += "}\n";
        if (funciones_etiquetas.size() != 0) {
            funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                    1) + traduccion_while);
        }
        traduccion_while = "";
    };

    /*
     * Functions
     * */
    @Override
    public void enterSu(SmallParser.SuContext ctx){
        System.out.print("function ");
        String id = getNewName(ctx.ID().getText());
        System.out.print(id);
        System.out.print(id);
        System.out.println("(){");
        traduccion_funcion += "function " + id + "(){\n";
    };
    @Override
    public void exitSu(SmallParser.SuContext ctx){
        System.out.println("} ");
        traduccion_funcion += "}\n";
        if (funciones_etiquetas.size() != 0) {
            funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                    1) + traduccion_funcion);
        }
        traduccion_funcion = "";
    };

    /////////////////////////////////////////////////// Condicional ////////////////////////////////////////////////////
    // private boolean dentroDeC = false;
    // private boolean dentroDeCsl = false;
    String traduccion_if = "";
    @Override
    public void enterC(SmallParser.CContext ctx) {
        traduccion_if += "if (" + ctx.ex().getText() + ") {" + "\n";
        //System.out.println("if (" + ctx.ex().getText() + ") {");
        System.out.print("if(");
    }

    @Override
    public void exitC(SmallParser.CContext ctx) {
        System.out.println("}");
        traduccion_if += "}";
        if (funciones_etiquetas.size() > 0) {
            funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                    1) + traduccion_if + "\n");
        }
        traduccion_if = "";
    }

    @Override
    public void enterC1(SmallParser.C1Context ctx) {
        if (ctx.ELSEIF() != null) {
            System.out.println("} else if (" + ctx.ex().getText() + ") {");
            traduccion_if += "} else if (" + ctx.ex().getText() + ") {" + "\n";
        } else if (ctx.ELSE() != null) {
            System.out.println("} else {");
            traduccion_if += "} else {" + "\n";
        }
    }

    ///////////////////////////////////////////// Etiquetas y saltos //////////////////////////////////////////////////
    ArrayList<String> funciones_etiquetas = new ArrayList<String>();
    ArrayList<String> etiquetas_creadas = new ArrayList<String>();
    @Override
    public void enterId(SmallParser.IdContext ctx) {
        if(shouldTranslate){
            if (ctx.id1().COLON() != null && !funciones_etiquetas.contains(ctx.ID().getText())) {
                funciones_etiquetas.add(ctx.ID().getText());
                funciones_etiquetas.add("");
            }

            // arrays
            else if (ctx.id1().va() != null){
                ParseTree va_op_dim = ctx.id1().va().va_op_dim();
                if (va_op_dim != null && va_op_dim.getChild(0) != null){
                    checkObjectDeclaration((SmallParser.Va_op_dimContext) va_op_dim);
                    String idValue = getNewName(ctx.ID().getText());

                    traduccion_array += idValue;
                    if (funciones_etiquetas.size() != 0) {
                        funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                                1) + traduccion_array);
                    }
                    traduccion_array = "";
                }
                declareVariable(getNewName(ctx.ID().getText()));
                System.out.print(getNewName(ctx.ID().getText()));
            }

            else{
                System.out.print(getNewName(ctx.ID().getText()));
            }

        }
    }

    @Override
    public void enterId1(SmallParser.Id1Context ctx){
        if(shouldTranslate){
            if(ctx.LEFT_PAREN()!=null){
                System.out.println("();");
            }
        }
    }

    @Override
    public void enterVa_op_dim(SmallParser.Va_op_dimContext ctx){
        if (shouldTranslate){
            if (ctx.LEFT_BRAC() != null ){
                System.out.print("[");
            }
        }
    }

    @Override
    public void enterEx(SmallParser.ExContext ctx){
        if(shouldTranslate){
            if (ctx.MINUS() != null){
                System.out.print("-");
            }
        }
    }

    @Override
    public void enterEx1(SmallParser.Ex1Context ctx){
        if(shouldTranslate){
            if (ctx.OR() != null){
                System.out.print(" || ");
            }
        }
    }

    @Override
    public void enterEb1(SmallParser.Eb1Context ctx){
        if(shouldTranslate){
            if (ctx.AND() != null){
                System.out.print(" && ");
            }
        }
    }

    @Override
    public void enterRo(SmallParser.RoContext ctx){
        if(shouldTranslate){
            if (ctx.LESS() != null){
                System.out.print(" < ");
            } else if (ctx.GREATER() != null) {
                System.out.print(" > ");
            } else if (ctx.EQUALS() != null) {
                System.out.print(" == ");
            } else if (ctx.LEQ() != null) {
                System.out.print(" <= ");
            } else if (ctx.GEQ() != null){
                System.out.print(" >= ");
            } else if (ctx.DIFF() != null) {
                System.out.print(" != ");
            }
        }
    }

    @Override
    public void enterSo(SmallParser.SoContext ctx){
        if(shouldTranslate){
            if (ctx.MINUS() != null){
                System.out.print(" - ");
            } else if (ctx.PLUS() != null) {
                System.out.print(" + ");
            }
        }
    }

    @Override
    public void enterMo(SmallParser.MoContext ctx){
        if(shouldTranslate){
            if (ctx.TIMES() != null){
                System.out.print(" * ");
            } else if (ctx.DIV() != null) {
                System.out.print(" / ");
            }
        }
    }

    @Override
    public void enterD(SmallParser.DContext ctx){
        if(shouldTranslate){
            if (ctx.STR() != null){
                System.out.print(ctx.getText());
            } else if ( ctx.TRUE() != null) {
                System.out.print(" true ");
            } else if ( ctx.FALSE() != null) {
                System.out.print(" false ");
            } else if ( ctx.NUM() != null) {
                System.out.print(ctx.NUM().getText());
            } else if ( ctx.LEFT_PAREN() != null) {
                System.out.print("(");
            } else if ( ctx.ID() != null) {
                System.out.print(getNewName(ctx.ID().getText()));
            }
        }
    }
    @Override
    public void enterId_op_dim(SmallParser.Id_op_dimContext ctx){
        if(shouldTranslate){
            if (ctx.LEFT_BRAC() != null){
                System.out.print("[");
            }
        }
    }

    @Override
    public void enterBf(SmallParser.BfContext ctx){
        // Translate built-in functions
        if(shouldTranslate){
            if(ctx.rw() != null){
                // TextWindow methods translation
                if(ctx.rw().getText().equals("TextWindow")){
                    if(ctx.ID().getText().equals("Write") || ctx.ID().getText().equals("WriteLine")){
                        System.out.print("console.log(");
                    }
                    else if (ctx.ID().getText().equals("Read")) {
                        System.out.print("prompt();\n");
                        shouldTranslate = false;
                    } else{
                        System.out.println(ctx.getText());
                        shouldTranslate = false;
                    }
                }
                // Array methods translation
                else if (ctx.rw().getText().equals("Array")) {
                    if(ctx.ID().getText().equals("ContainsIndex")){
                        String array = ctx.pam().pal().pa().getText();
                        String index = ctx.pam().pal().pal1().pa().getText();
                        System.out.printf("%s in %s;\n" , index , array);
                        shouldTranslate = false;
                    } else if (ctx.ID().getText().equals("ContainsValue")) {
                        String array = ctx.pam().pal().pa().getText();
                        String value = ctx.pam().pal().pal1().pa().getText();
                        System.out.printf("%s in Object.values(%s);\n" , value , array);
                        shouldTranslate = false;
                    } else if (ctx.ID().getText().equals("GetAllIndexes") || ctx.ID().getText().equals("GetItemCount")) {
                        System.out.print("Object.keys(");
                    } else if (ctx.ID().getText().equals("IsArray")){
                        String array = ctx.pam().pal().pa().getText();
                        System.out.printf("typeof %s === 'object';\n", array);
                        shouldTranslate = false;
                    } else{
                        System.out.println(ctx.getText());
                        shouldTranslate = false;
                    }
                }
                // Stack methods
                else if (ctx.rw().getText().equals("Stack")) {
                    String stack = ctx.pam().pal().pa().getText();
                    declareStack(stack);
                    if(ctx.ID().getText().equals("PushValue")){
                        String element = ctx.pam().pal().pal1().pa().getText();
                        System.out.printf("%s.push(%s);\n",stack,element);
                    }
                    else if(ctx.ID().getText().equals("PopValue")){
                        System.out.printf("%s.pop();\n",stack);
                    } else if(ctx.ID().getText().equals("GetCount")) {
                        System.out.printf("%s.length;\n",stack);
                    }else{
                        System.out.println(ctx.getText());
                    }
                    shouldTranslate = false;
                }
                // Program methods
                else if (ctx.rw().getText().equals("Program")){
                    if(ctx.ID().getText().equals("Delay")){
                        System.out.print("setTimeout(()=>{},");
                    } else if (ctx.ID().getText().equals("End")) {
                        System.out.println("throw new error('Program was ended!');");
                        shouldTranslate = false;
                    } else{
                        System.out.println(ctx.getText());
                        shouldTranslate = false;
                    }
                }
            }
        }
    }

    public void exitBf(SmallParser.BfContext ctx){
        shouldTranslate = true;
    }

    @Override
    public void exitEx(SmallParser.ExContext ctx){
        if(shouldTranslate){
            // Check if this expression is an index for an array or dictionary
            if(ctx.getParent().getRuleIndex() == 7){
                System.out.print("]");
            }
            // Check if the right hand side expression is completed
            else if(ctx.getParent().getRuleIndex() == 6){
                System.out.println(";");
            }
            // Check if the expression is being called inside parenthesis
            else if(ctx.getParent().getRuleIndex() == 36){
                System.out.print(")");
            }
            // Check if the expression is being called inside brackets
            else if (ctx.getParent().getRuleIndex() == 37) {
                System.out.print("]");
            }
            // Check if it's a built-in function
            else if (ctx.getParent().getRuleIndex() == 21){
                SmallParser.BfContext bf;
                try{
                    bf = (SmallParser.BfContext)ctx.getParent().getParent().getParent().getParent();
                } catch (Exception e){
                    return;
                }
                // Check for textWindow.write function, array.GetAllIndexes , array.getItemCount Function
                if(bf.rw().getText().equals("TextWindow") || bf.rw().getText().equals("Program")){
                    System.out.println(");");
                } else if (bf.rw().getText().equals("Array")) {
                    System.out.print(")");
                    if(bf.ID().getText().equals("GetItemCount")){
                        System.out.print(".length");
                    }
                    System.out.println(";");
                }
            }
            // Check if expression is being called in a while or in an if
            else if (ctx.getParent().getRuleIndex() == 15 || ctx.getParent().getRuleIndex() == 8 ) {
                System.out.println("){");
            }
        }
    }

    @Override
    public void exitVa_op_dim(SmallParser.Va_op_dimContext ctx){
        if (shouldTranslate){
            // Check if the left side of the assignation is already complete, if it is, print the equals symbol
            if(ctx.getParent().getRuleIndex() == 6){
                System.out.print(" = ");
            }
        }
    }


    @Override
    public void enterS(SmallParser.SContext ctx) {
        if (ctx.GOTO() != null && funciones_etiquetas.contains(ctx.ID().getText())) {
            funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                    1) + ctx.ID().getText() + "()" + "\n");
            if (!etiquetas_creadas.contains(ctx.ID().getText())) {
                etiquetas_creadas.add(ctx.ID().getText());
                System.out.println("function " + ctx.ID().getText() + "() {");
                for (int i = funciones_etiquetas.indexOf(ctx.ID().getText()) + 1; i < funciones_etiquetas.size(); i+=1) {
                    if (i % 2 == 0) {
                        if (etiquetas_creadas.contains(funciones_etiquetas.get(i))) {
                            System.out.println(funciones_etiquetas.get(i) + "()");
                            break;
                        }
                    } else {
                        System.out.print(funciones_etiquetas.get(i));
                    }
                }
                System.out.println("}");
            }
            System.out.println(ctx.ID().getText() + "()");
        }
    }
}
