// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
// create a CharStream that reads from standard input / file
// create a lexer that feeds off of input CharStream
        SmallLexer lexer;

        if (args.length>0)
            lexer = new SmallLexer(CharStreams.fromFileName("input/input20.txt"));
        else
            lexer = new SmallLexer(CharStreams.fromStream(System.in));
// create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
        SmallParser parser = new SmallParser(tokens);
        ParseTree tree = parser.p(); // begin parsing at init rule
 
// Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
// Walk the tree created during the parse, trigger callbacks
        walker.walk(new SmallToJS(), tree);
        System.out.println(); // print a \n after translation
    }
}