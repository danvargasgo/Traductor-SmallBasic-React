import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class SmallToJS extends SmallBaseListener {
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
        declareObject += " = {}";
        System.out.println(declareObject);
    }
    private void checkObjectDeclaration(SmallParser.Va_op_dimContext ctx){
        // Check if the dictionaries(arrays) have already been declared, if not, create the necessary arrays and nestings
        ParserRuleContext parent = ctx.getParent();
        ParseTree firstChild = ctx.getChild(0);
        if(firstChild != null ){
            if (parent.getRuleIndex() == 6){
                ParserRuleContext idContext = parent.getParent().getParent();
                ParseTree ID = idContext.getChild(0);
                String variable = ID.getText();
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
                //System.out.println(declaredDictionaries);
                //System.out.println(ctx.getText());
                //System.out.println(ID.getText());
            }
        }
    }




    /*
     * FOR LOOPS
     * */
    @Override
    public void enterF(SmallParser.FContext ctx){
        //  For (let ID VA; ID <= EX; ID+=STEP){
        System.out.print("For(let ");

        String id = ctx.ID().getText();
        System.out.print(id);
        String va = ctx.va().getText();
        System.out.print(va);
        System.out.print(";");

        System.out.print(id);
        System.out.print("<=");
        String ex = ctx.ex().getText();
        System.out.print(ex);
        System.out.print(";");

        SmallParser.St1Context st1 = ctx.st().st1();
        if(st1 != null){
            System.out.print(id);
            System.out.print("+=");
            System.out.print(st1.getText());
        }else{
            System.out.print(id);
            System.out.print("++");
        }

        System.out.println("){");
    }
    @Override
    public void exitF(SmallParser.FContext ctx){
        // }
        System.out.println("}");
    }

    /*
     * WHILE LOOPS
     * */
    @Override
    public void enterW(SmallParser.WContext ctx){
        //    While ( EX ) {
        TerminalNode id = ctx.ex().eb().er().es().em().d().ID();
        if(id != null){
            System.out.print("var ");
            System.out.print(id);
            System.out.println(";");
        }
        System.out.print("While (");

        String ex = ctx.ex().getText();

        System.out.print(ex);

        System.out.println("){");
    }
    @Override
    public void exitW(SmallParser.WContext ctx){
        // }
        System.out.println("}");
    };

    /*
     * Functions
     * */
    @Override
    public void enterSu(SmallParser.SuContext ctx){
        System.out.print("function ");
        String id = ctx.ID().getText();
        System.out.print(id);
        System.out.println("(){");
    };
    @Override
    public void exitSu(SmallParser.SuContext ctx){
        System.out.println("} ");
    };

    /////////////////////////////////////////////////// Condicional ////////////////////////////////////////////////////
    // private boolean dentroDeC = false;
    // private boolean dentroDeCsl = false;
    String traduccion_if = "";
    @Override
    public void enterC(SmallParser.CContext ctx) {
        traduccion_if += "if (" + ctx.ex().getText() + ") {" + "\n";
        System.out.println("if (" + ctx.ex().getText() + ") {");
        // dentroDeC = true;
    }

    @Override
    public void exitC(SmallParser.CContext ctx) {
        System.out.println("}");
        traduccion_if += "}";
        if (funciones_etiquetas.size() != 0) {
            funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                    1) + traduccion_if + "\n");
        }
        traduccion_if = "";
    }

    /*@Override
    public void exitEx(SmallParser.ExContext ctx) {
        if (//dentroDeC) {
            System.out.println(ctx.getText() + ") {");
            //System.out.println("     // Cuerpo");
            //dentroDeC = false;
        }
    }*/

    /*@Override
    public void enterCsl(SmallParser.CslContext ctx) {
        System.out.println(ctx.getText());
        if (dentroDeCsl) {
            dentroDeCsl = false;
        }
    }*/

    @Override
    public void enterC1(SmallParser.C1Context ctx) {
        if (ctx.ELSEIF() != null) {
            System.out.println("} else if (" + ctx.ex().getText() + ") {");
            traduccion_if += "} else if (" + ctx.ex().getText() + ") {" + "\n";
            // dentroDeC = true;
        } else if (ctx.ELSE() != null) {
            System.out.println("} else {");
            traduccion_if += "} else {" + "\n";
            // dentroDeCsl = true;
        }
    }

    ///////////////////////////////////////////// Etiquetas y saltos //////////////////////////////////////////////////
    ArrayList<String> etiquetas = new ArrayList<String>();
    ArrayList<String> funciones_etiquetas = new ArrayList<String>();
    ArrayList<String> etiquetas_creadas = new ArrayList<String>();
    @Override
    public void enterId(SmallParser.IdContext ctx) {
        if (ctx.id1().COLON() != null && !funciones_etiquetas.contains(ctx.ID().getText())) {
            // "function " + ctx.ID().getText() + "() {" + "\n"
            funciones_etiquetas.add(ctx.ID().getText());
            funciones_etiquetas.add("");
        }

        // arrays
        if (ctx.id1().va() != null){
            ParseTree va_op_dim = ctx.id1().va().va_op_dim();
            if (va_op_dim != null && va_op_dim.getChild(0) != null){
                checkObjectDeclaration((SmallParser.Va_op_dimContext) va_op_dim);
            }
        }

        // Print variable
        System.out.print(ctx.ID().getText());
    }
    @Override
    public void enterVa_op_dim(SmallParser.Va_op_dimContext ctx){
        if (ctx.LEFT_BRAC() != null){
            System.out.print("[");
        }
    }

    @Override
    public void enterEx(SmallParser.ExContext ctx){
        if (ctx.MINUS() != null){
            System.out.print("-");
        }
    }

    @Override
    public void enterEx1(SmallParser.Ex1Context ctx){
        if (ctx.OR() != null){
            System.out.print(" || ");
        }
    }

    @Override
    public void enterEb1(SmallParser.Eb1Context ctx){
        if (ctx.AND() != null){
            System.out.print(" && ");
        }
    }

    @Override
    public void enterRo(SmallParser.RoContext ctx){
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

    @Override
    public void enterSo(SmallParser.SoContext ctx){
        if (ctx.MINUS() != null){
            System.out.print(" - ");
        } else if (ctx.PLUS() != null) {
            System.out.print(" + ");
        }
    }

    @Override
    public void enterMo(SmallParser.MoContext ctx){
        if (ctx.TIMES() != null){
            System.out.print(" * ");
        } else if (ctx.DIV() != null) {
            System.out.print(" / ");
        }
    }

    @Override
    public void enterD(SmallParser.DContext ctx){
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
            System.out.print(ctx.ID().getText());
        }
    }
    @Override
    public void enterId_op_dim(SmallParser.Id_op_dimContext ctx){
        if (ctx.LEFT_BRAC() != null){
            System.out.print("[");
        }
    }

    @Override
    public void exitEx(SmallParser.ExContext ctx){
        // Check if this expression is an index for an array or dictionary
        if(ctx.getParent().getRuleIndex() == 7){
            System.out.print("]");
        }
        // Check if the right hand side expression is completed
        else if(ctx.getParent().getRuleIndex() == 6){
            System.out.println(";");
        }
        // Check if the expression is being called inside parenthesis
        else if(ctx.getParent().getRuleIndex() == 37){
            System.out.print(")");
        }
        // Check if the expression is being called inside brackets
        else if (ctx.getParent().getRuleIndex() == 38) {
            System.out.print("]");
        }
    }

    @Override
    public void exitVa_op_dim(SmallParser.Va_op_dimContext ctx){
        // Check if the left side of the assignation is already complete, if it is, print the equals symbol
        if(ctx.getParent().getRuleIndex() == 6){
            System.out.print(" = ");
        }
    }


    @Override
    public void enterS(SmallParser.SContext ctx) {
        if (ctx.GOTO() != null && funciones_etiquetas.contains(ctx.ID().getText())) {
            funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                    1) + ctx.ID().getText() + "()" + "\n");
            if (!etiquetas_creadas.contains(ctx.ID().getText())) {
                ArrayList<String> funciones_internas = new ArrayList<String>();
                Integer contador_funciones_internas = 0;
                etiquetas_creadas.add(ctx.ID().getText());
                System.out.println("function " + ctx.ID().getText() + "() {");
                for (int i = funciones_etiquetas.indexOf(ctx.ID().getText()) + 1; i < funciones_etiquetas.size(); i+=1) {
                    if (i % 2 == 0) {
                        if (etiquetas_creadas.contains(funciones_etiquetas.get(i))) {
                            System.out.println(funciones_etiquetas.get(i) + "()");
                            break;
                        } /*else {
                            System.out.println("function " + funciones_etiquetas.get(i) + "() {");
                            funciones_internas.add(funciones_etiquetas.get(i) + "()");
                            contador_funciones_internas += 1;
                        }*/
                    } else {
                        System.out.print(funciones_etiquetas.get(i));
                    }
                }
                /*for (int i = 0; i < contador_funciones_internas; i+=1) {
                    System.out.println("}");
                    System.out.println(funciones_internas.get(i));
                }*/
                System.out.println("}");
            }
            System.out.println(ctx.ID().getText() + "()");
        } else if (ctx.c() == null &&
                (ctx.id() == null || ctx.id().id1() == null || ctx.id().id1().COLON() == null) && funciones_etiquetas.size() != 0) {
            if (ctx.GOTO() == null) {
                System.out.println(ctx.getText());
                funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                        1) + ctx.getText() + "\n");
            } else {
                /*funciones_etiquetas.set(funciones_etiquetas.size() - 1, funciones_etiquetas.get(funciones_etiquetas.size() -
                        1) + ctx.ID().getText());*/
            }
        }
    }
}
