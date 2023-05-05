// Generated from C:/Users/danie/Downloads/Traductor Small To JS/grammar\Small.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SmallParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LINE_COMMENT=2, ELSEIF=3, ENDIF=4, ENDWHILE=5, ENDFOR=6, ENDSUB=7, 
		GOTO=8, IF=9, THEN=10, ELSE=11, WHILE=12, FOR=13, SUB=14, TO=15, STEP=16, 
		TRUE=17, FALSE=18, TEXT_WINDOW=19, STACK=20, PROGRAM=21, ARRAY=22, OR=23, 
		AND=24, COLON=25, MINUS=26, PLUS=27, TIMES=28, DIV=29, COMMA=30, PERIOD=31, 
		LESS=32, GREATER=33, EQUALS=34, LEQ=35, GEQ=36, DIFF=37, LEFT_BRAC=38, 
		RIGHT_BRAC=39, LEFT_PAREN=40, RIGHT_PAREN=41, STR=42, NUM=43, ID=44;
	public static final int
		RULE_p = 0, RULE_su = 1, RULE_susl = 2, RULE_s = 3, RULE_id = 4, RULE_id1 = 5, 
		RULE_va = 6, RULE_va_op_dim = 7, RULE_c = 8, RULE_c1 = 9, RULE_csl = 10, 
		RULE_f = 11, RULE_st = 12, RULE_st1 = 13, RULE_fsl = 14, RULE_w = 15, 
		RULE_wsl = 16, RULE_bf = 17, RULE_pam = 18, RULE_pal = 19, RULE_pal1 = 20, 
		RULE_pa = 21, RULE_rw = 22, RULE_ex = 23, RULE_ex1 = 24, RULE_eb = 25, 
		RULE_eb1 = 26, RULE_er = 27, RULE_er1 = 28, RULE_ro = 29, RULE_es = 30, 
		RULE_es1 = 31, RULE_so = 32, RULE_em = 33, RULE_em1 = 34, RULE_mo = 35, 
		RULE_d = 36, RULE_id_op_dim = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"p", "su", "susl", "s", "id", "id1", "va", "va_op_dim", "c", "c1", "csl", 
			"f", "st", "st1", "fsl", "w", "wsl", "bf", "pam", "pal", "pal1", "pa", 
			"rw", "ex", "ex1", "eb", "eb1", "er", "er1", "ro", "es", "es1", "so", 
			"em", "em1", "mo", "d", "id_op_dim"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'ElseIf'", "'EndIf'", "'EndWhile'", "'EndFor'", "'EndSub'", 
			"'Goto'", "'If'", "'Then'", "'Else'", "'While'", "'For'", "'Sub'", "'To'", 
			"'Step'", "'True'", "'False'", "'TextWindow'", "'Stack'", "'Program'", 
			"'Array'", "'Or'", "'And'", "':'", "'-'", "'+'", "'*'", "'/'", "','", 
			"'.'", "'<'", "'>'", "'='", "'<='", "'>='", "'<>'", "'['", "']'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "ELSEIF", "ENDIF", "ENDWHILE", "ENDFOR", 
			"ENDSUB", "GOTO", "IF", "THEN", "ELSE", "WHILE", "FOR", "SUB", "TO", 
			"STEP", "TRUE", "FALSE", "TEXT_WINDOW", "STACK", "PROGRAM", "ARRAY", 
			"OR", "AND", "COLON", "MINUS", "PLUS", "TIMES", "DIV", "COMMA", "PERIOD", 
			"LESS", "GREATER", "EQUALS", "LEQ", "GEQ", "DIFF", "LEFT_BRAC", "RIGHT_BRAC", 
			"LEFT_PAREN", "RIGHT_PAREN", "STR", "NUM", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Small.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmallParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PContext extends ParserRuleContext {
		public SuContext su() {
			return getRuleContext(SuContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SmallParser.EOF, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				su();
				setState(77);
				p();
				setState(78);
				match(EOF);
				}
				break;
			case GOTO:
			case IF:
			case WHILE:
			case FOR:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				s();
				setState(81);
				p();
				setState(82);
				match(EOF);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(SmallParser.SUB, 0); }
		public TerminalNode ID() { return getToken(SmallParser.ID, 0); }
		public SuslContext susl() {
			return getRuleContext(SuslContext.class,0);
		}
		public TerminalNode ENDSUB() { return getToken(SmallParser.ENDSUB, 0); }
		public SuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_su; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterSu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitSu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitSu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuContext su() throws RecognitionException {
		SuContext _localctx = new SuContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_su);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SUB);
			setState(88);
			match(ID);
			setState(89);
			susl();
			setState(90);
			match(ENDSUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuslContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public SuslContext susl() {
			return getRuleContext(SuslContext.class,0);
		}
		public SuslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_susl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterSusl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitSusl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitSusl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuslContext susl() throws RecognitionException {
		SuslContext _localctx = new SuslContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_susl);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
			case IF:
			case WHILE:
			case FOR:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				s();
				setState(93);
				susl();
				}
				break;
			case ENDSUB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public WContext w() {
			return getRuleContext(WContext.class,0);
		}
		public BfContext bf() {
			return getRuleContext(BfContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode GOTO() { return getToken(SmallParser.GOTO, 0); }
		public TerminalNode ID() { return getToken(SmallParser.ID, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_s);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				c();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				f();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				w();
				}
				break;
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				bf();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				id();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				match(GOTO);
				setState(104);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmallParser.ID, 0); }
		public Id1Context id1() {
			return getRuleContext(Id1Context.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			id1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id1Context extends ParserRuleContext {
		public VaContext va() {
			return getRuleContext(VaContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SmallParser.COLON, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SmallParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SmallParser.RIGHT_PAREN, 0); }
		public Id1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterId1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitId1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitId1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id1Context id1() throws RecognitionException {
		Id1Context _localctx = new Id1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_id1);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALS:
			case LEFT_BRAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				va();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(COLON);
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(LEFT_PAREN);
				setState(113);
				match(RIGHT_PAREN);
				}
				break;
			case EOF:
			case ELSEIF:
			case ENDIF:
			case ENDWHILE:
			case ENDFOR:
			case ENDSUB:
			case GOTO:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case SUB:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VaContext extends ParserRuleContext {
		public Va_op_dimContext va_op_dim() {
			return getRuleContext(Va_op_dimContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(SmallParser.EQUALS, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public VaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_va; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterVa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitVa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitVa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaContext va() throws RecognitionException {
		VaContext _localctx = new VaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_va);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			va_op_dim();
			setState(118);
			match(EQUALS);
			setState(119);
			ex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Va_op_dimContext extends ParserRuleContext {
		public TerminalNode LEFT_BRAC() { return getToken(SmallParser.LEFT_BRAC, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public TerminalNode RIGHT_BRAC() { return getToken(SmallParser.RIGHT_BRAC, 0); }
		public Va_op_dimContext va_op_dim() {
			return getRuleContext(Va_op_dimContext.class,0);
		}
		public Va_op_dimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_va_op_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterVa_op_dim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitVa_op_dim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitVa_op_dim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Va_op_dimContext va_op_dim() throws RecognitionException {
		Va_op_dimContext _localctx = new Va_op_dimContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_va_op_dim);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(LEFT_BRAC);
				setState(122);
				ex();
				setState(123);
				match(RIGHT_BRAC);
				setState(124);
				va_op_dim();
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SmallParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SmallParser.LEFT_PAREN, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SmallParser.RIGHT_PAREN, 0); }
		public TerminalNode THEN() { return getToken(SmallParser.THEN, 0); }
		public CslContext csl() {
			return getRuleContext(CslContext.class,0);
		}
		public C1Context c1() {
			return getRuleContext(C1Context.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IF);
			setState(130);
			match(LEFT_PAREN);
			setState(131);
			ex();
			setState(132);
			match(RIGHT_PAREN);
			setState(133);
			match(THEN);
			setState(134);
			csl();
			setState(135);
			c1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class C1Context extends ParserRuleContext {
		public TerminalNode ENDIF() { return getToken(SmallParser.ENDIF, 0); }
		public TerminalNode ELSEIF() { return getToken(SmallParser.ELSEIF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SmallParser.LEFT_PAREN, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SmallParser.RIGHT_PAREN, 0); }
		public TerminalNode THEN() { return getToken(SmallParser.THEN, 0); }
		public CslContext csl() {
			return getRuleContext(CslContext.class,0);
		}
		public C1Context c1() {
			return getRuleContext(C1Context.class,0);
		}
		public TerminalNode ELSE() { return getToken(SmallParser.ELSE, 0); }
		public C1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterC1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitC1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitC1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C1Context c1() throws RecognitionException {
		C1Context _localctx = new C1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_c1);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ENDIF);
				}
				break;
			case ELSEIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(ELSEIF);
				setState(139);
				match(LEFT_PAREN);
				setState(140);
				ex();
				setState(141);
				match(RIGHT_PAREN);
				setState(142);
				match(THEN);
				setState(143);
				csl();
				setState(144);
				c1();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(ELSE);
				setState(147);
				csl();
				setState(148);
				match(ENDIF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CslContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public CslContext csl() {
			return getRuleContext(CslContext.class,0);
		}
		public CslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterCsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitCsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitCsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CslContext csl() throws RecognitionException {
		CslContext _localctx = new CslContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_csl);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
			case IF:
			case WHILE:
			case FOR:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				s();
				setState(153);
				csl();
				}
				break;
			case ELSEIF:
			case ENDIF:
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SmallParser.FOR, 0); }
		public TerminalNode ID() { return getToken(SmallParser.ID, 0); }
		public VaContext va() {
			return getRuleContext(VaContext.class,0);
		}
		public TerminalNode TO() { return getToken(SmallParser.TO, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public FslContext fsl() {
			return getRuleContext(FslContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(SmallParser.ENDFOR, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_f);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FOR);
			setState(159);
			match(ID);
			setState(160);
			va();
			setState(161);
			match(TO);
			setState(162);
			ex();
			setState(163);
			st();
			setState(164);
			fsl();
			setState(165);
			match(ENDFOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StContext extends ParserRuleContext {
		public TerminalNode STEP() { return getToken(SmallParser.STEP, 0); }
		public St1Context st1() {
			return getRuleContext(St1Context.class,0);
		}
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_st);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(STEP);
				setState(168);
				st1();
				}
				break;
			case ENDFOR:
			case GOTO:
			case IF:
			case WHILE:
			case FOR:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class St1Context extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SmallParser.MINUS, 0); }
		public EsContext es() {
			return getRuleContext(EsContext.class,0);
		}
		public St1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterSt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitSt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitSt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final St1Context st1() throws RecognitionException {
		St1Context _localctx = new St1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_st1);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(MINUS);
				setState(173);
				es();
				}
				break;
			case TRUE:
			case FALSE:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case LEFT_PAREN:
			case STR:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				es();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FslContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public FslContext fsl() {
			return getRuleContext(FslContext.class,0);
		}
		public FslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterFsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitFsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitFsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FslContext fsl() throws RecognitionException {
		FslContext _localctx = new FslContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fsl);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
			case IF:
			case WHILE:
			case FOR:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				s();
				setState(178);
				fsl();
				}
				break;
			case ENDFOR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SmallParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SmallParser.LEFT_PAREN, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SmallParser.RIGHT_PAREN, 0); }
		public WslContext wsl() {
			return getRuleContext(WslContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(SmallParser.ENDWHILE, 0); }
		public WContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitW(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitW(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WContext w() throws RecognitionException {
		WContext _localctx = new WContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_w);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(WHILE);
			setState(184);
			match(LEFT_PAREN);
			setState(185);
			ex();
			setState(186);
			match(RIGHT_PAREN);
			setState(187);
			wsl();
			setState(188);
			match(ENDWHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WslContext extends ParserRuleContext {
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public WslContext wsl() {
			return getRuleContext(WslContext.class,0);
		}
		public WslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterWsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitWsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitWsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WslContext wsl() throws RecognitionException {
		WslContext _localctx = new WslContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_wsl);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
			case IF:
			case WHILE:
			case FOR:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				s();
				setState(191);
				wsl();
				}
				break;
			case ENDWHILE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BfContext extends ParserRuleContext {
		public RwContext rw() {
			return getRuleContext(RwContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SmallParser.PERIOD, 0); }
		public TerminalNode ID() { return getToken(SmallParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SmallParser.LEFT_PAREN, 0); }
		public PamContext pam() {
			return getRuleContext(PamContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SmallParser.RIGHT_PAREN, 0); }
		public BfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterBf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitBf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitBf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfContext bf() throws RecognitionException {
		BfContext _localctx = new BfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			rw();
			setState(197);
			match(PERIOD);
			setState(198);
			match(ID);
			setState(199);
			match(LEFT_PAREN);
			setState(200);
			pam();
			setState(201);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PamContext extends ParserRuleContext {
		public PalContext pal() {
			return getRuleContext(PalContext.class,0);
		}
		public PamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterPam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitPam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitPam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PamContext pam() throws RecognitionException {
		PamContext _localctx = new PamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pam);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				pal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PalContext extends ParserRuleContext {
		public PaContext pa() {
			return getRuleContext(PaContext.class,0);
		}
		public Pal1Context pal1() {
			return getRuleContext(Pal1Context.class,0);
		}
		public PalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterPal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitPal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitPal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalContext pal() throws RecognitionException {
		PalContext _localctx = new PalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			pa();
			setState(208);
			pal1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pal1Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SmallParser.COMMA, 0); }
		public PaContext pa() {
			return getRuleContext(PaContext.class,0);
		}
		public Pal1Context pal1() {
			return getRuleContext(Pal1Context.class,0);
		}
		public Pal1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pal1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterPal1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitPal1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitPal1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pal1Context pal1() throws RecognitionException {
		Pal1Context _localctx = new Pal1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_pal1);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(COMMA);
				setState(211);
				pa();
				setState(212);
				pal1();
				}
				break;
			case RIGHT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PaContext extends ParserRuleContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public PaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterPa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitPa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitPa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaContext pa() throws RecognitionException {
		PaContext _localctx = new PaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pa);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case MINUS:
			case LEFT_PAREN:
			case STR:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				ex();
				}
				break;
			case COMMA:
			case RIGHT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RwContext extends ParserRuleContext {
		public TerminalNode TEXT_WINDOW() { return getToken(SmallParser.TEXT_WINDOW, 0); }
		public TerminalNode STACK() { return getToken(SmallParser.STACK, 0); }
		public TerminalNode PROGRAM() { return getToken(SmallParser.PROGRAM, 0); }
		public TerminalNode ARRAY() { return getToken(SmallParser.ARRAY, 0); }
		public RwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterRw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitRw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitRw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RwContext rw() throws RecognitionException {
		RwContext _localctx = new RwContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SmallParser.MINUS, 0); }
		public EbContext eb() {
			return getRuleContext(EbContext.class,0);
		}
		public Ex1Context ex1() {
			return getRuleContext(Ex1Context.class,0);
		}
		public ExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		ExContext _localctx = new ExContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ex);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(MINUS);
				setState(224);
				eb();
				setState(225);
				ex1();
				}
				break;
			case TRUE:
			case FALSE:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case LEFT_PAREN:
			case STR:
			case NUM:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				eb();
				setState(228);
				ex1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ex1Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SmallParser.OR, 0); }
		public EbContext eb() {
			return getRuleContext(EbContext.class,0);
		}
		public Ex1Context ex1() {
			return getRuleContext(Ex1Context.class,0);
		}
		public Ex1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEx1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEx1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEx1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ex1Context ex1() throws RecognitionException {
		Ex1Context _localctx = new Ex1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_ex1);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(OR);
				setState(233);
				eb();
				setState(234);
				ex1();
				}
				break;
			case EOF:
			case ELSEIF:
			case ENDIF:
			case ENDWHILE:
			case ENDFOR:
			case ENDSUB:
			case GOTO:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case SUB:
			case TO:
			case STEP:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case COMMA:
			case RIGHT_BRAC:
			case RIGHT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EbContext extends ParserRuleContext {
		public ErContext er() {
			return getRuleContext(ErContext.class,0);
		}
		public Eb1Context eb1() {
			return getRuleContext(Eb1Context.class,0);
		}
		public EbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EbContext eb() throws RecognitionException {
		EbContext _localctx = new EbContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			er();
			setState(240);
			eb1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Eb1Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SmallParser.AND, 0); }
		public ErContext er() {
			return getRuleContext(ErContext.class,0);
		}
		public Eb1Context eb1() {
			return getRuleContext(Eb1Context.class,0);
		}
		public Eb1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eb1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEb1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEb1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEb1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eb1Context eb1() throws RecognitionException {
		Eb1Context _localctx = new Eb1Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_eb1);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(AND);
				setState(243);
				er();
				setState(244);
				eb1();
				}
				break;
			case EOF:
			case ELSEIF:
			case ENDIF:
			case ENDWHILE:
			case ENDFOR:
			case ENDSUB:
			case GOTO:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case SUB:
			case TO:
			case STEP:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case OR:
			case COMMA:
			case RIGHT_BRAC:
			case RIGHT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ErContext extends ParserRuleContext {
		public EsContext es() {
			return getRuleContext(EsContext.class,0);
		}
		public Er1Context er1() {
			return getRuleContext(Er1Context.class,0);
		}
		public ErContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_er; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErContext er() throws RecognitionException {
		ErContext _localctx = new ErContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_er);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			es();
			setState(250);
			er1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Er1Context extends ParserRuleContext {
		public RoContext ro() {
			return getRuleContext(RoContext.class,0);
		}
		public EsContext es() {
			return getRuleContext(EsContext.class,0);
		}
		public Er1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_er1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Er1Context er1() throws RecognitionException {
		Er1Context _localctx = new Er1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_er1);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS:
			case GREATER:
			case EQUALS:
			case LEQ:
			case GEQ:
			case DIFF:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				ro();
				setState(253);
				es();
				}
				break;
			case EOF:
			case ELSEIF:
			case ENDIF:
			case ENDWHILE:
			case ENDFOR:
			case ENDSUB:
			case GOTO:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case SUB:
			case TO:
			case STEP:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case OR:
			case AND:
			case COMMA:
			case RIGHT_BRAC:
			case RIGHT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RoContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(SmallParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(SmallParser.GREATER, 0); }
		public TerminalNode EQUALS() { return getToken(SmallParser.EQUALS, 0); }
		public TerminalNode LEQ() { return getToken(SmallParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(SmallParser.GEQ, 0); }
		public TerminalNode DIFF() { return getToken(SmallParser.DIFF, 0); }
		public RoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterRo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitRo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitRo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoContext ro() throws RecognitionException {
		RoContext _localctx = new RoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EsContext extends ParserRuleContext {
		public EmContext em() {
			return getRuleContext(EmContext.class,0);
		}
		public Es1Context es1() {
			return getRuleContext(Es1Context.class,0);
		}
		public EsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_es; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsContext es() throws RecognitionException {
		EsContext _localctx = new EsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_es);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			em();
			setState(261);
			es1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Es1Context extends ParserRuleContext {
		public SoContext so() {
			return getRuleContext(SoContext.class,0);
		}
		public EmContext em() {
			return getRuleContext(EmContext.class,0);
		}
		public Es1Context es1() {
			return getRuleContext(Es1Context.class,0);
		}
		public Es1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_es1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEs1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEs1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEs1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Es1Context es1() throws RecognitionException {
		Es1Context _localctx = new Es1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_es1);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				so();
				setState(264);
				em();
				setState(265);
				es1();
				}
				break;
			case EOF:
			case ELSEIF:
			case ENDIF:
			case ENDWHILE:
			case ENDFOR:
			case ENDSUB:
			case GOTO:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case SUB:
			case TO:
			case STEP:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case OR:
			case AND:
			case COMMA:
			case LESS:
			case GREATER:
			case EQUALS:
			case LEQ:
			case GEQ:
			case DIFF:
			case RIGHT_BRAC:
			case RIGHT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SoContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SmallParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SmallParser.MINUS, 0); }
		public SoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_so; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterSo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitSo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitSo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoContext so() throws RecognitionException {
		SoContext _localctx = new SoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_so);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmContext extends ParserRuleContext {
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public Em1Context em1() {
			return getRuleContext(Em1Context.class,0);
		}
		public EmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_em; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmContext em() throws RecognitionException {
		EmContext _localctx = new EmContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_em);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			d();
			setState(273);
			em1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Em1Context extends ParserRuleContext {
		public MoContext mo() {
			return getRuleContext(MoContext.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public Em1Context em1() {
			return getRuleContext(Em1Context.class,0);
		}
		public Em1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_em1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterEm1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitEm1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitEm1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Em1Context em1() throws RecognitionException {
		Em1Context _localctx = new Em1Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_em1);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMES:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				mo();
				setState(276);
				d();
				setState(277);
				em1();
				}
				break;
			case EOF:
			case ELSEIF:
			case ENDIF:
			case ENDWHILE:
			case ENDFOR:
			case ENDSUB:
			case GOTO:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case SUB:
			case TO:
			case STEP:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case OR:
			case AND:
			case MINUS:
			case PLUS:
			case COMMA:
			case LESS:
			case GREATER:
			case EQUALS:
			case LEQ:
			case GEQ:
			case DIFF:
			case RIGHT_BRAC:
			case RIGHT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(SmallParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(SmallParser.DIV, 0); }
		public MoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterMo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitMo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitMo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoContext mo() throws RecognitionException {
		MoContext _localctx = new MoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(SmallParser.STR, 0); }
		public TerminalNode TRUE() { return getToken(SmallParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SmallParser.FALSE, 0); }
		public TerminalNode NUM() { return getToken(SmallParser.NUM, 0); }
		public TerminalNode ID() { return getToken(SmallParser.ID, 0); }
		public Id_op_dimContext id_op_dim() {
			return getRuleContext(Id_op_dimContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SmallParser.LEFT_PAREN, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SmallParser.RIGHT_PAREN, 0); }
		public BfContext bf() {
			return getRuleContext(BfContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_d);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(STR);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(FALSE);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				match(ID);
				setState(289);
				id_op_dim();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(290);
				match(LEFT_PAREN);
				setState(291);
				ex();
				setState(292);
				match(RIGHT_PAREN);
				}
				break;
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				bf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Id_op_dimContext extends ParserRuleContext {
		public TerminalNode LEFT_BRAC() { return getToken(SmallParser.LEFT_BRAC, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public TerminalNode RIGHT_BRAC() { return getToken(SmallParser.RIGHT_BRAC, 0); }
		public Id_op_dimContext id_op_dim() {
			return getRuleContext(Id_op_dimContext.class,0);
		}
		public Id_op_dimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_op_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).enterId_op_dim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallListener ) ((SmallListener)listener).exitId_op_dim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SmallVisitor ) return ((SmallVisitor<? extends T>)visitor).visitId_op_dim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_op_dimContext id_op_dim() throws RecognitionException {
		Id_op_dimContext _localctx = new Id_op_dimContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_id_op_dim);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRAC:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(LEFT_BRAC);
				setState(298);
				ex();
				setState(299);
				match(RIGHT_BRAC);
				setState(300);
				id_op_dim();
				}
				break;
			case EOF:
			case ELSEIF:
			case ENDIF:
			case ENDWHILE:
			case ENDFOR:
			case ENDSUB:
			case GOTO:
			case IF:
			case ELSE:
			case WHILE:
			case FOR:
			case SUB:
			case TO:
			case STEP:
			case TEXT_WINDOW:
			case STACK:
			case PROGRAM:
			case ARRAY:
			case OR:
			case AND:
			case MINUS:
			case PLUS:
			case TIMES:
			case DIV:
			case COMMA:
			case LESS:
			case GREATER:
			case EQUALS:
			case LEQ:
			case GEQ:
			case DIFF:
			case RIGHT_BRAC:
			case RIGHT_PAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u0132\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000V\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"a\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003j\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005t\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0080\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0097\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u009d\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00ab\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00b0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00b6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00c3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ce\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d8\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00dc\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00e7\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u00ee\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u00f8\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0101\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u010d\b\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u0119\b\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u0128\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u0130\b%\u0001%\u0000\u0000&\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJ\u0000\u0004\u0001\u0000\u0013\u0016\u0001\u0000 "+
		"%\u0001\u0000\u001a\u001b\u0001\u0000\u001c\u001d\u012e\u0000U\u0001\u0000"+
		"\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000"+
		"\u0006i\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000\u0000\ns\u0001\u0000"+
		"\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000"+
		"\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0096\u0001\u0000\u0000"+
		"\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016\u009e\u0001\u0000\u0000"+
		"\u0000\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00af\u0001\u0000\u0000"+
		"\u0000\u001c\u00b5\u0001\u0000\u0000\u0000\u001e\u00b7\u0001\u0000\u0000"+
		"\u0000 \u00c2\u0001\u0000\u0000\u0000\"\u00c4\u0001\u0000\u0000\u0000"+
		"$\u00cd\u0001\u0000\u0000\u0000&\u00cf\u0001\u0000\u0000\u0000(\u00d7"+
		"\u0001\u0000\u0000\u0000*\u00db\u0001\u0000\u0000\u0000,\u00dd\u0001\u0000"+
		"\u0000\u0000.\u00e6\u0001\u0000\u0000\u00000\u00ed\u0001\u0000\u0000\u0000"+
		"2\u00ef\u0001\u0000\u0000\u00004\u00f7\u0001\u0000\u0000\u00006\u00f9"+
		"\u0001\u0000\u0000\u00008\u0100\u0001\u0000\u0000\u0000:\u0102\u0001\u0000"+
		"\u0000\u0000<\u0104\u0001\u0000\u0000\u0000>\u010c\u0001\u0000\u0000\u0000"+
		"@\u010e\u0001\u0000\u0000\u0000B\u0110\u0001\u0000\u0000\u0000D\u0118"+
		"\u0001\u0000\u0000\u0000F\u011a\u0001\u0000\u0000\u0000H\u0127\u0001\u0000"+
		"\u0000\u0000J\u012f\u0001\u0000\u0000\u0000LM\u0003\u0002\u0001\u0000"+
		"MN\u0003\u0000\u0000\u0000NO\u0005\u0000\u0000\u0001OV\u0001\u0000\u0000"+
		"\u0000PQ\u0003\u0006\u0003\u0000QR\u0003\u0000\u0000\u0000RS\u0005\u0000"+
		"\u0000\u0001SV\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UL\u0001"+
		"\u0000\u0000\u0000UP\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"V\u0001\u0001\u0000\u0000\u0000WX\u0005\u000e\u0000\u0000XY\u0005,\u0000"+
		"\u0000YZ\u0003\u0004\u0002\u0000Z[\u0005\u0007\u0000\u0000[\u0003\u0001"+
		"\u0000\u0000\u0000\\]\u0003\u0006\u0003\u0000]^\u0003\u0004\u0002\u0000"+
		"^a\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000a\u0005\u0001\u0000\u0000\u0000bj\u0003"+
		"\u0010\b\u0000cj\u0003\u0016\u000b\u0000dj\u0003\u001e\u000f\u0000ej\u0003"+
		"\"\u0011\u0000fj\u0003\b\u0004\u0000gh\u0005\b\u0000\u0000hj\u0005,\u0000"+
		"\u0000ib\u0001\u0000\u0000\u0000ic\u0001\u0000\u0000\u0000id\u0001\u0000"+
		"\u0000\u0000ie\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000j\u0007\u0001\u0000\u0000\u0000kl\u0005,\u0000\u0000"+
		"lm\u0003\n\u0005\u0000m\t\u0001\u0000\u0000\u0000nt\u0003\f\u0006\u0000"+
		"ot\u0005\u0019\u0000\u0000pq\u0005(\u0000\u0000qt\u0005)\u0000\u0000r"+
		"t\u0001\u0000\u0000\u0000sn\u0001\u0000\u0000\u0000so\u0001\u0000\u0000"+
		"\u0000sp\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u000b\u0001"+
		"\u0000\u0000\u0000uv\u0003\u000e\u0007\u0000vw\u0005\"\u0000\u0000wx\u0003"+
		".\u0017\u0000x\r\u0001\u0000\u0000\u0000yz\u0005&\u0000\u0000z{\u0003"+
		".\u0017\u0000{|\u0005\'\u0000\u0000|}\u0003\u000e\u0007\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007fy\u0001\u0000\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u000f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\t\u0000\u0000\u0082\u0083\u0005(\u0000\u0000\u0083"+
		"\u0084\u0003.\u0017\u0000\u0084\u0085\u0005)\u0000\u0000\u0085\u0086\u0005"+
		"\n\u0000\u0000\u0086\u0087\u0003\u0014\n\u0000\u0087\u0088\u0003\u0012"+
		"\t\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u0097\u0005\u0004\u0000"+
		"\u0000\u008a\u008b\u0005\u0003\u0000\u0000\u008b\u008c\u0005(\u0000\u0000"+
		"\u008c\u008d\u0003.\u0017\u0000\u008d\u008e\u0005)\u0000\u0000\u008e\u008f"+
		"\u0005\n\u0000\u0000\u008f\u0090\u0003\u0014\n\u0000\u0090\u0091\u0003"+
		"\u0012\t\u0000\u0091\u0097\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u000b"+
		"\u0000\u0000\u0093\u0094\u0003\u0014\n\u0000\u0094\u0095\u0005\u0004\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0089\u0001\u0000\u0000"+
		"\u0000\u0096\u008a\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000"+
		"\u0000\u0097\u0013\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0006\u0003"+
		"\u0000\u0099\u009a\u0003\u0014\n\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000"+
		"\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u0015\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005\r\u0000\u0000\u009f\u00a0\u0005,\u0000\u0000\u00a0"+
		"\u00a1\u0003\f\u0006\u0000\u00a1\u00a2\u0005\u000f\u0000\u0000\u00a2\u00a3"+
		"\u0003.\u0017\u0000\u00a3\u00a4\u0003\u0018\f\u0000\u00a4\u00a5\u0003"+
		"\u001c\u000e\u0000\u00a5\u00a6\u0005\u0006\u0000\u0000\u00a6\u0017\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0010\u0000\u0000\u00a8\u00ab\u0003"+
		"\u001a\r\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u0019\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u001a\u0000\u0000\u00ad\u00b0\u0003<\u001e"+
		"\u0000\u00ae\u00b0\u0003<\u001e\u0000\u00af\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u001b\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0003\u0006\u0003\u0000\u00b2\u00b3\u0003\u001c\u000e\u0000"+
		"\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u001d\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\f\u0000\u0000\u00b8"+
		"\u00b9\u0005(\u0000\u0000\u00b9\u00ba\u0003.\u0017\u0000\u00ba\u00bb\u0005"+
		")\u0000\u0000\u00bb\u00bc\u0003 \u0010\u0000\u00bc\u00bd\u0005\u0005\u0000"+
		"\u0000\u00bd\u001f\u0001\u0000\u0000\u0000\u00be\u00bf\u0003\u0006\u0003"+
		"\u0000\u00bf\u00c0\u0003 \u0010\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3!\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0003,\u0016\u0000\u00c5\u00c6\u0005\u001f\u0000\u0000\u00c6\u00c7"+
		"\u0005,\u0000\u0000\u00c7\u00c8\u0005(\u0000\u0000\u00c8\u00c9\u0003$"+
		"\u0012\u0000\u00c9\u00ca\u0005)\u0000\u0000\u00ca#\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0003&\u0013\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"%\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003*\u0015\u0000\u00d0\u00d1\u0003"+
		"(\u0014\u0000\u00d1\'\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001e"+
		"\u0000\u0000\u00d3\u00d4\u0003*\u0015\u0000\u00d4\u00d5\u0003(\u0014\u0000"+
		"\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8)\u0001\u0000\u0000\u0000\u00d9\u00dc\u0003.\u0017\u0000\u00da\u00dc"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc+\u0001\u0000\u0000\u0000\u00dd\u00de\u0007"+
		"\u0000\u0000\u0000\u00de-\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u001a"+
		"\u0000\u0000\u00e0\u00e1\u00032\u0019\u0000\u00e1\u00e2\u00030\u0018\u0000"+
		"\u00e2\u00e7\u0001\u0000\u0000\u0000\u00e3\u00e4\u00032\u0019\u0000\u00e4"+
		"\u00e5\u00030\u0018\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00df"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e7/\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005\u0017\u0000\u0000\u00e9\u00ea\u0003"+
		"2\u0019\u0000\u00ea\u00eb\u00030\u0018\u0000\u00eb\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u00036\u001b\u0000\u00f0\u00f1\u00034\u001a\u0000\u00f13"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0018\u0000\u0000\u00f3\u00f4"+
		"\u00036\u001b\u0000\u00f4\u00f5\u00034\u001a\u0000\u00f5\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f85\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0003<\u001e\u0000\u00fa\u00fb\u00038\u001c\u0000\u00fb"+
		"7\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003:\u001d\u0000\u00fd\u00fe\u0003"+
		"<\u001e\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000"+
		"\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000"+
		"\u0000\u0000\u01019\u0001\u0000\u0000\u0000\u0102\u0103\u0007\u0001\u0000"+
		"\u0000\u0103;\u0001\u0000\u0000\u0000\u0104\u0105\u0003B!\u0000\u0105"+
		"\u0106\u0003>\u001f\u0000\u0106=\u0001\u0000\u0000\u0000\u0107\u0108\u0003"+
		"@ \u0000\u0108\u0109\u0003B!\u0000\u0109\u010a\u0003>\u001f\u0000\u010a"+
		"\u010d\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c"+
		"\u0107\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d"+
		"?\u0001\u0000\u0000\u0000\u010e\u010f\u0007\u0002\u0000\u0000\u010fA\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0003H$\u0000\u0111\u0112\u0003D\"\u0000"+
		"\u0112C\u0001\u0000\u0000\u0000\u0113\u0114\u0003F#\u0000\u0114\u0115"+
		"\u0003H$\u0000\u0115\u0116\u0003D\"\u0000\u0116\u0119\u0001\u0000\u0000"+
		"\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0113\u0001\u0000\u0000"+
		"\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119E\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0007\u0003\u0000\u0000\u011bG\u0001\u0000\u0000\u0000\u011c"+
		"\u0128\u0005*\u0000\u0000\u011d\u0128\u0005\u0011\u0000\u0000\u011e\u0128"+
		"\u0005\u0012\u0000\u0000\u011f\u0128\u0005+\u0000\u0000\u0120\u0121\u0005"+
		",\u0000\u0000\u0121\u0128\u0003J%\u0000\u0122\u0123\u0005(\u0000\u0000"+
		"\u0123\u0124\u0003.\u0017\u0000\u0124\u0125\u0005)\u0000\u0000\u0125\u0128"+
		"\u0001\u0000\u0000\u0000\u0126\u0128\u0003\"\u0011\u0000\u0127\u011c\u0001"+
		"\u0000\u0000\u0000\u0127\u011d\u0001\u0000\u0000\u0000\u0127\u011e\u0001"+
		"\u0000\u0000\u0000\u0127\u011f\u0001\u0000\u0000\u0000\u0127\u0120\u0001"+
		"\u0000\u0000\u0000\u0127\u0122\u0001\u0000\u0000\u0000\u0127\u0126\u0001"+
		"\u0000\u0000\u0000\u0128I\u0001\u0000\u0000\u0000\u0129\u012a\u0005&\u0000"+
		"\u0000\u012a\u012b\u0003.\u0017\u0000\u012b\u012c\u0005\'\u0000\u0000"+
		"\u012c\u012d\u0003J%\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u0130"+
		"\u0001\u0000\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f\u012e"+
		"\u0001\u0000\u0000\u0000\u0130K\u0001\u0000\u0000\u0000\u0016U`is\u007f"+
		"\u0096\u009c\u00aa\u00af\u00b5\u00c2\u00cd\u00d7\u00db\u00e6\u00ed\u00f7"+
		"\u0100\u010c\u0118\u0127\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}