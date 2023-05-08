import org.antlr.v4.runtime.tree.TerminalNode;

public class SmallToJS extends SmallBaseListener{
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
}
