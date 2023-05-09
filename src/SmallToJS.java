import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
public class SmallToJS extends SmallBaseListener{
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
        declareObject += "= {}";
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

    @Override
    public void enterVa_op_dim(SmallParser.Va_op_dimContext ctx){
        ParseTree firstChild = ctx.getChild(0);
        if (firstChild != null){
            System.out.print('[');
        }
    }

    @Override
    public void enterId(SmallParser.IdContext ctx){
        ParseTree va_op_dim = ctx.getChild(1).getChild(0).getChild(0);
        if (va_op_dim != null && va_op_dim.getChild(0) != null){
            checkObjectDeclaration((SmallParser.Va_op_dimContext) va_op_dim);
        }
        System.out.print(ctx.getChild(0).getText());
    }

    @Override
    public void enterEx(SmallParser.ExContext ctx){
        if (ctx.getParent().getRuleIndex() == 7)
            System.out.print(ctx.getText()+"]");
    }


}
