// Generated from C:/Users/danie/Downloads/Traductor Small To JS/grammar\Small.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SmallParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SmallVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SmallParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(SmallParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#su}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSu(SmallParser.SuContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#susl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSusl(SmallParser.SuslContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SmallParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SmallParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#id1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId1(SmallParser.Id1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#va}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVa(SmallParser.VaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#va_op_dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVa_op_dim(SmallParser.Va_op_dimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(SmallParser.CContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#c1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC1(SmallParser.C1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#csl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsl(SmallParser.CslContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(SmallParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSt(SmallParser.StContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#st1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSt1(SmallParser.St1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#fsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFsl(SmallParser.FslContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#w}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitW(SmallParser.WContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#wsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWsl(SmallParser.WslContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#bf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBf(SmallParser.BfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#pam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPam(SmallParser.PamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#pal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPal(SmallParser.PalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#pal1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPal1(SmallParser.Pal1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#pa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPa(SmallParser.PaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#rw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRw(SmallParser.RwContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx(SmallParser.ExContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#ex1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx1(SmallParser.Ex1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#eb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEb(SmallParser.EbContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#eb1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEb1(SmallParser.Eb1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#er}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEr(SmallParser.ErContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#er1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEr1(SmallParser.Er1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#ro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRo(SmallParser.RoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#es}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEs(SmallParser.EsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#es1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEs1(SmallParser.Es1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#so}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSo(SmallParser.SoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#em}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEm(SmallParser.EmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#em1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEm1(SmallParser.Em1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#mo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMo(SmallParser.MoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(SmallParser.DContext ctx);
	/**
	 * Visit a parse tree produced by {@link SmallParser#id_op_dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_op_dim(SmallParser.Id_op_dimContext ctx);
}