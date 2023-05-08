import java.util.ArrayList;
import java.util.HashMap;

public class SmallToJS extends SmallBaseListener {
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
