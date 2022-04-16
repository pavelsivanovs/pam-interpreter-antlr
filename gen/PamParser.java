// Generated from C:/Users/pauli/Documents/uni/6_sem/pvsus/md02/pam-interpreter-antlr\Pam.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BOOL=15, CONJ=16, DISJ=17, 
		NEG=18, NEWLINE=19, WEAKOP=20, STRONGOP=21, RELATION=22, NUMBER=23, VARNAME=24, 
		WS=25;
	public static final int
		RULE_progr = 0, RULE_series = 1, RULE_stmt = 2, RULE_input_stmt = 3, RULE_output_stmt = 4, 
		RULE_assign_stmt = 5, RULE_cond_stmt = 6, RULE_loop = 7, RULE_logical_expr = 8, 
		RULE_logical_term = 9, RULE_logical_neg_elem = 10, RULE_logical_elem = 11, 
		RULE_compar = 12, RULE_varlist = 13, RULE_expr = 14, RULE_term = 15, RULE_elem = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"progr", "series", "stmt", "input_stmt", "output_stmt", "assign_stmt", 
			"cond_stmt", "loop", "logical_expr", "logical_term", "logical_neg_elem", 
			"logical_elem", "compar", "varlist", "expr", "term", "elem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'read'", "'write'", "':='", "'if'", "'then'", "'else'", 
			"'fi'", "'while'", "'do'", "'end'", "'('", "')'", "','", null, "'and'", 
			"'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BOOL", "CONJ", "DISJ", "NEG", "NEWLINE", "WEAKOP", 
			"STRONGOP", "RELATION", "NUMBER", "VARNAME", "WS"
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
	public String getGrammarFileName() { return "Pam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PamParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrContext extends ParserRuleContext {
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PamParser.NEWLINE, 0); }
		public ProgrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterProgr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitProgr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitProgr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrContext progr() throws RecognitionException {
		ProgrContext _localctx = new ProgrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			series();
			setState(35);
			match(NEWLINE);
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

	public static class SeriesContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitSeries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitSeries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeriesContext series() throws RecognitionException {
		SeriesContext _localctx = new SeriesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_series);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			stmt();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(38);
				match(T__0);
				setState(39);
				stmt();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StmtContext extends ParserRuleContext {
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Output_stmtContext output_stmt() {
			return getRuleContext(Output_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				input_stmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				output_stmt();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				assign_stmt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				cond_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				loop();
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

	public static class Input_stmtContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitInput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitInput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__1);
			setState(53);
			varlist();
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

	public static class Output_stmtContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Output_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterOutput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitOutput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitOutput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_stmtContext output_stmt() throws RecognitionException {
		Output_stmtContext _localctx = new Output_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(56);
			varlist();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(PamParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(VARNAME);
			setState(59);
			match(T__3);
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(60);
				expr();
				}
				break;
			case 2:
				{
				setState(61);
				logical_expr(0);
				}
				break;
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

	public static class Cond_stmtContext extends ParserRuleContext {
		public List<SeriesContext> series() {
			return getRuleContexts(SeriesContext.class);
		}
		public SeriesContext series(int i) {
			return getRuleContext(SeriesContext.class,i);
		}
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public Cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterCond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitCond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitCond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stmtContext cond_stmt() throws RecognitionException {
		Cond_stmtContext _localctx = new Cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__4);
			{
			setState(65);
			logical_expr(0);
			}
			setState(66);
			match(T__5);
			setState(67);
			series();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(68);
				match(T__6);
				setState(69);
				series();
				}
			}

			setState(72);
			match(T__7);
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

	public static class LoopContext extends ParserRuleContext {
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__8);
			{
			setState(75);
			logical_expr(0);
			}
			setState(76);
			match(T__9);
			setState(77);
			series();
			setState(78);
			match(T__10);
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

	public static class Logical_exprContext extends ParserRuleContext {
		public Logical_termContext logical_term() {
			return getRuleContext(Logical_termContext.class,0);
		}
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode DISJ() { return getToken(PamParser.DISJ, 0); }
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterLogical_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitLogical_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitLogical_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_logical_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(81);
			logical_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(83);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84);
					match(DISJ);
					setState(85);
					logical_term(0);
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_termContext extends ParserRuleContext {
		public Logical_neg_elemContext logical_neg_elem() {
			return getRuleContext(Logical_neg_elemContext.class,0);
		}
		public Logical_termContext logical_term() {
			return getRuleContext(Logical_termContext.class,0);
		}
		public TerminalNode CONJ() { return getToken(PamParser.CONJ, 0); }
		public Logical_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterLogical_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitLogical_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitLogical_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_termContext logical_term() throws RecognitionException {
		return logical_term(0);
	}

	private Logical_termContext logical_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_termContext _localctx = new Logical_termContext(_ctx, _parentState);
		Logical_termContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_logical_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(92);
			logical_neg_elem();
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_termContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_term);
					setState(94);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(95);
					match(CONJ);
					setState(96);
					logical_neg_elem();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_neg_elemContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(PamParser.NEG, 0); }
		public Logical_elemContext logical_elem() {
			return getRuleContext(Logical_elemContext.class,0);
		}
		public Logical_neg_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_neg_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterLogical_neg_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitLogical_neg_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitLogical_neg_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_neg_elemContext logical_neg_elem() throws RecognitionException {
		Logical_neg_elemContext _localctx = new Logical_neg_elemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logical_neg_elem);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(NEG);
				setState(103);
				logical_elem();
				}
				break;
			case T__11:
			case BOOL:
			case NUMBER:
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				logical_elem();
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

	public static class Logical_elemContext extends ParserRuleContext {
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(PamParser.BOOL, 0); }
		public ComparContext compar() {
			return getRuleContext(ComparContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(PamParser.VARNAME, 0); }
		public Logical_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterLogical_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitLogical_elem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitLogical_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_elemContext logical_elem() throws RecognitionException {
		Logical_elemContext _localctx = new Logical_elemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logical_elem);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__11);
				setState(108);
				logical_expr(0);
				setState(109);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				compar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(VARNAME);
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

	public static class ComparContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RELATION() { return getToken(PamParser.RELATION, 0); }
		public ComparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterCompar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitCompar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitCompar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparContext compar() throws RecognitionException {
		ComparContext _localctx = new ComparContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			expr();
			setState(117);
			match(RELATION);
			setState(118);
			expr();
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

	public static class VarlistContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(PamParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PamParser.VARNAME, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(VARNAME);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(121);
				match(T__13);
				setState(122);
				match(VARNAME);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> WEAKOP() { return getTokens(PamParser.WEAKOP); }
		public TerminalNode WEAKOP(int i) {
			return getToken(PamParser.WEAKOP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			term();
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					match(WEAKOP);
					setState(130);
					term();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public List<ElemContext> elem() {
			return getRuleContexts(ElemContext.class);
		}
		public ElemContext elem(int i) {
			return getRuleContext(ElemContext.class,i);
		}
		public List<TerminalNode> STRONGOP() { return getTokens(PamParser.STRONGOP); }
		public TerminalNode STRONGOP(int i) {
			return getToken(PamParser.STRONGOP, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			elem();
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					match(STRONGOP);
					setState(138);
					elem();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ElemContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PamParser.NUMBER, 0); }
		public TerminalNode VARNAME() { return getToken(PamParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elem);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(NUMBER);
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(VARNAME);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__11);
				setState(147);
				expr();
				setState(148);
				match(T__12);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		case 9:
			return logical_term_sempred((Logical_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logical_term_sempred(Logical_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\65\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bI\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\nY\n\n\f\n\16\n\\\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13d"+
		"\n\13\f\13\16\13g\13\13\3\f\3\f\3\f\5\fl\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\ru\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17~\n\17\f\17\16\17\u0081"+
		"\13\17\3\20\3\20\3\20\7\20\u0086\n\20\f\20\16\20\u0089\13\20\3\21\3\21"+
		"\3\21\7\21\u008e\n\21\f\21\16\21\u0091\13\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0099\n\22\3\22\2\4\22\24\23\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"\2\2\2\u009b\2$\3\2\2\2\4\'\3\2\2\2\6\64\3\2\2\2\b\66\3\2"+
		"\2\2\n9\3\2\2\2\f<\3\2\2\2\16B\3\2\2\2\20L\3\2\2\2\22R\3\2\2\2\24]\3\2"+
		"\2\2\26k\3\2\2\2\30t\3\2\2\2\32v\3\2\2\2\34z\3\2\2\2\36\u0082\3\2\2\2"+
		" \u008a\3\2\2\2\"\u0098\3\2\2\2$%\5\4\3\2%&\7\25\2\2&\3\3\2\2\2\',\5\6"+
		"\4\2()\7\3\2\2)+\5\6\4\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\5\3"+
		"\2\2\2.,\3\2\2\2/\65\5\b\5\2\60\65\5\n\6\2\61\65\5\f\7\2\62\65\5\16\b"+
		"\2\63\65\5\20\t\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2"+
		"\2\64\63\3\2\2\2\65\7\3\2\2\2\66\67\7\4\2\2\678\5\34\17\28\t\3\2\2\29"+
		":\7\5\2\2:;\5\34\17\2;\13\3\2\2\2<=\7\32\2\2=@\7\6\2\2>A\5\36\20\2?A\5"+
		"\22\n\2@>\3\2\2\2@?\3\2\2\2A\r\3\2\2\2BC\7\7\2\2CD\5\22\n\2DE\7\b\2\2"+
		"EH\5\4\3\2FG\7\t\2\2GI\5\4\3\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\n\2\2"+
		"K\17\3\2\2\2LM\7\13\2\2MN\5\22\n\2NO\7\f\2\2OP\5\4\3\2PQ\7\r\2\2Q\21\3"+
		"\2\2\2RS\b\n\1\2ST\5\24\13\2TZ\3\2\2\2UV\f\4\2\2VW\7\23\2\2WY\5\24\13"+
		"\2XU\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\23\3\2\2\2\\Z\3\2\2\2]^\b"+
		"\13\1\2^_\5\26\f\2_e\3\2\2\2`a\f\4\2\2ab\7\22\2\2bd\5\26\f\2c`\3\2\2\2"+
		"dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\25\3\2\2\2ge\3\2\2\2hi\7\24\2\2il\5\30"+
		"\r\2jl\5\30\r\2kh\3\2\2\2kj\3\2\2\2l\27\3\2\2\2mn\7\16\2\2no\5\22\n\2"+
		"op\7\17\2\2pu\3\2\2\2qu\7\21\2\2ru\5\32\16\2su\7\32\2\2tm\3\2\2\2tq\3"+
		"\2\2\2tr\3\2\2\2ts\3\2\2\2u\31\3\2\2\2vw\5\36\20\2wx\7\30\2\2xy\5\36\20"+
		"\2y\33\3\2\2\2z\177\7\32\2\2{|\7\20\2\2|~\7\32\2\2}{\3\2\2\2~\u0081\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\35\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\u0087\5 \21\2\u0083\u0084\7\26\2\2\u0084\u0086\5 \21\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\37\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008f\5\"\22\2\u008b\u008c"+
		"\7\27\2\2\u008c\u008e\5\"\22\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090!\3\2\2\2\u0091\u008f\3"+
		"\2\2\2\u0092\u0099\7\31\2\2\u0093\u0099\7\32\2\2\u0094\u0095\7\16\2\2"+
		"\u0095\u0096\5\36\20\2\u0096\u0097\7\17\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0099#\3\2\2\2"+
		"\16,\64@HZekt\177\u0087\u008f\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}