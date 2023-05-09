import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SmallToJS extends SmallBaseListener {
    String traduccion_for = "";
    String traduccion_while = "";
    String traduccion_funcion = "";
    /*
     * FOR LOOPS
     * */
    @Override
    public void enterF(SmallParser.FContext ctx){
        //  For (let ID VA; ID <= EX; ID+=STEP){
        System.out.print("for(let ");

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
            traduccion_while += "var " + id + ";\n";
        }
        System.out.print("while(");

        String ex = ctx.ex().getText();

        System.out.print(ex);

        System.out.println("){");

        traduccion_while += "while(" + ex + "){\n";
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
        String id = ctx.ID().getText();
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
        System.out.println("if (" + ctx.ex().getText() + ") {");
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
        if (ctx.id1().COLON() != null && !funciones_etiquetas.contains(ctx.ID().getText())) {
            funciones_etiquetas.add(ctx.ID().getText());
            funciones_etiquetas.add("");
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
