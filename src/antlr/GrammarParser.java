// Generated from Grammar.g4 by ANTLR 4.7.1
package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
			T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, SENSE_DIR = 24,
			SENSE_TARGET = 25, DIR_DIR = 26, NUMBER = 27, IDENTIFIER = 28, WS = 29;
	public static final int
			RULE_brain = 0, RULE_block = 1, RULE_statement = 2, RULE_instruction = 3,
			RULE_changeblock = 4, RULE_mark = 5, RULE_unmark = 6, RULE_set = 7, RULE_unset = 8,
			RULE_test = 9, RULE_sense = 10, RULE_move = 11, RULE_pickup = 12, RULE_drop = 13,
			RULE_flip = 14, RULE_breed = 15, RULE_jump = 16, RULE_direction = 17,
			RULE_turn = 18, RULE_inline = 19, RULE_label = 20;
	public static final String[] ruleNames = {
			"brain", "block", "statement", "instruction", "changeblock", "mark", "unmark",
			"set", "unset", "test", "sense", "move", "pickup", "drop", "flip", "breed",
			"jump", "direction", "turn", "inline", "label"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u009e\4\2\t\2" +
					"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
					"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\6\2\61\n\2\r" +
					"\2\16\2\62\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\6\3=\n\3\r\3\16\3>\3\3\3\3" +
					"\3\4\3\4\3\4\3\4\5\4G\n\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t" +
					"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\fs\n\f" +
					"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3" +
					"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3" +
					"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\2\2\27" +
					"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u009b\2,\3\2\2\2" +
					"\4\66\3\2\2\2\6H\3\2\2\2\bX\3\2\2\2\nZ\3\2\2\2\f]\3\2\2\2\16`\3\2\2\2" +
					"\20c\3\2\2\2\22f\3\2\2\2\24i\3\2\2\2\26n\3\2\2\2\30w\3\2\2\2\32{\3\2\2" +
					"\2\34\177\3\2\2\2\36\u0083\3\2\2\2 \u0088\3\2\2\2\"\u008c\3\2\2\2$\u008f" +
					"\3\2\2\2&\u0094\3\2\2\2(\u0097\3\2\2\2*\u009a\3\2\2\2,-\7\3\2\2-.\7\36" +
					"\2\2.\60\7\4\2\2/\61\5\4\3\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62" +
					"\63\3\2\2\2\63\64\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7\5\2\2\67" +
					"8\7\36\2\28<\7\6\2\29:\5\6\4\2:;\7\4\2\2;=\3\2\2\2<9\3\2\2\2=>\3\2\2\2" +
					"><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\7\2\2A\5\3\2\2\2BI\5*\26\2CG\5\b\5" +
					"\2DG\5(\25\2EG\5\n\6\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2GI\3\2\2\2HB\3\2\2" +
					"\2HF\3\2\2\2I\7\3\2\2\2JY\5\f\7\2KY\5\16\b\2LY\5\20\t\2MY\5\22\n\2NY\5" +
					"\24\13\2OY\5\26\f\2PY\5\30\r\2QY\5\32\16\2RY\5\34\17\2SY\5\36\20\2TY\5" +
					" \21\2UY\5\"\22\2VY\5$\23\2WY\5&\24\2XJ\3\2\2\2XK\3\2\2\2XL\3\2\2\2XM" +
					"\3\2\2\2XN\3\2\2\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2X" +
					"T\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\t\3\2\2\2Z[\7\b\2\2[\\\7\36\2" +
					"\2\\\13\3\2\2\2]^\7\t\2\2^_\7\35\2\2_\r\3\2\2\2`a\7\n\2\2ab\7\35\2\2b" +
					"\17\3\2\2\2cd\7\13\2\2de\7\35\2\2e\21\3\2\2\2fg\7\f\2\2gh\7\35\2\2h\23" +
					"\3\2\2\2ij\7\r\2\2jk\7\35\2\2kl\7\16\2\2lm\5*\26\2m\25\3\2\2\2no\7\17" +
					"\2\2op\7\32\2\2pr\7\33\2\2qs\7\35\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu" +
					"\7\16\2\2uv\5*\26\2v\27\3\2\2\2wx\7\20\2\2xy\7\16\2\2yz\5*\26\2z\31\3" +
					"\2\2\2{|\7\21\2\2|}\7\16\2\2}~\5*\26\2~\33\3\2\2\2\177\u0080\7\22\2\2" +
					"\u0080\u0081\7\16\2\2\u0081\u0082\5*\26\2\u0082\35\3\2\2\2\u0083\u0084" +
					"\7\23\2\2\u0084\u0085\7\35\2\2\u0085\u0086\7\16\2\2\u0086\u0087\5*\26" +
					"\2\u0087\37\3\2\2\2\u0088\u0089\7\24\2\2\u0089\u008a\7\16\2\2\u008a\u008b" +
					"\5*\26\2\u008b!\3\2\2\2\u008c\u008d\7\25\2\2\u008d\u008e\5*\26\2\u008e" +
					"#\3\2\2\2\u008f\u0090\7\26\2\2\u0090\u0091\7\34\2\2\u0091\u0092\7\16\2" +
					"\2\u0092\u0093\5*\26\2\u0093%\3\2\2\2\u0094\u0095\7\27\2\2\u0095\u0096" +
					"\7\32\2\2\u0096\'\3\2\2\2\u0097\u0098\7\30\2\2\u0098\u0099\7\36\2\2\u0099" +
					")\3\2\2\2\u009a\u009b\7\31\2\2\u009b\u009c\7\36\2\2\u009c+\3\2\2\2\b\62" +
					">FHXr";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
			null, "'name'", "';'", "'block'", "'{'", "'}'", "'changeblock'", "'mark'",
			"'unmark'", "'set'", "'unset'", "'test'", "'else'", "'sense'", "'move'",
			"'pickup'", "'drop'", "'flip'", "'breed'", "'jump'", "'direction'", "'turn'",
			"'inline'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null,
			"SENSE_DIR", "SENSE_TARGET", "DIR_DIR", "NUMBER", "IDENTIFIER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	static {
		RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION);
	}

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

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
	public String getGrammarFileName() {
		return "Grammar.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public final BrainContext brain() throws RecognitionException {
		BrainContext _localctx = new BrainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_brain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(42);
				match(T__0);
				setState(43);
				match(IDENTIFIER);
				setState(44);
				match(T__1);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(45);
							block();
						}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == T__2);
				setState(50);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(52);
				match(T__2);
				setState(53);
				match(IDENTIFIER);
				setState(54);
				match(T__3);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(55);
							statement();
							setState(56);
							match(T__1);
						}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0));
				setState(62);
				match(T__4);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__22:
					enterOuterAlt(_localctx, 1);
				{
					{
						setState(64);
						label();
					}
				}
				break;
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
					enterOuterAlt(_localctx, 2);
				{
					setState(68);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
						case T__6:
						case T__7:
						case T__8:
						case T__9:
						case T__10:
						case T__12:
						case T__13:
						case T__14:
						case T__15:
						case T__16:
						case T__17:
						case T__18:
						case T__19:
						case T__20: {
							setState(65);
							instruction();
						}
						break;
						case T__21: {
							setState(66);
							inline();
						}
						break;
						case T__5: {
							setState(67);
							changeblock();
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__6:
					enterOuterAlt(_localctx, 1);
				{
					setState(72);
					mark();
				}
				break;
				case T__7:
					enterOuterAlt(_localctx, 2);
				{
					setState(73);
					unmark();
				}
				break;
				case T__8:
					enterOuterAlt(_localctx, 3);
				{
					setState(74);
					set();
				}
				break;
				case T__9:
					enterOuterAlt(_localctx, 4);
				{
					setState(75);
					unset();
				}
				break;
				case T__10:
					enterOuterAlt(_localctx, 5);
				{
					setState(76);
					test();
				}
				break;
				case T__12:
					enterOuterAlt(_localctx, 6);
				{
					setState(77);
					sense();
				}
				break;
				case T__13:
					enterOuterAlt(_localctx, 7);
				{
					setState(78);
					move();
				}
				break;
				case T__14:
					enterOuterAlt(_localctx, 8);
				{
					setState(79);
					pickup();
				}
				break;
				case T__15:
					enterOuterAlt(_localctx, 9);
				{
					setState(80);
					drop();
				}
				break;
				case T__16:
					enterOuterAlt(_localctx, 10);
				{
					setState(81);
					flip();
				}
				break;
				case T__17:
					enterOuterAlt(_localctx, 11);
				{
					setState(82);
					breed();
				}
				break;
				case T__18:
					enterOuterAlt(_localctx, 12);
				{
					setState(83);
					jump();
				}
				break;
				case T__19:
					enterOuterAlt(_localctx, 13);
				{
					setState(84);
					direction();
				}
				break;
				case T__20:
					enterOuterAlt(_localctx, 14);
				{
					setState(85);
					turn();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ChangeblockContext changeblock() throws RecognitionException {
		ChangeblockContext _localctx = new ChangeblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_changeblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(88);
				match(T__5);
				setState(89);
				match(IDENTIFIER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MarkContext mark() throws RecognitionException {
		MarkContext _localctx = new MarkContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mark);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(91);
				match(T__6);
				setState(92);
				match(NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnmarkContext unmark() throws RecognitionException {
		UnmarkContext _localctx = new UnmarkContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unmark);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(94);
				match(T__7);
				setState(95);
				match(NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(97);
				match(T__8);
				setState(98);
				match(NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final UnsetContext unset() throws RecognitionException {
		UnsetContext _localctx = new UnsetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unset);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(100);
				match(T__9);
				setState(101);
				match(NUMBER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(103);
				match(T__10);
				setState(104);
				((TestContext) _localctx).reg = match(NUMBER);
				setState(105);
				match(T__11);
				setState(106);
				((TestContext) _localctx).alt = label();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final SenseContext sense() throws RecognitionException {
		SenseContext _localctx = new SenseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sense);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(108);
				match(T__12);
				setState(109);
				match(SENSE_DIR);
				setState(110);
				match(SENSE_TARGET);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == NUMBER) {
					{
						setState(111);
						((SenseContext) _localctx).mbm = match(NUMBER);
					}
				}

				setState(114);
				match(T__11);
				setState(115);
				((SenseContext) _localctx).alt = label();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(117);
				match(T__13);
				setState(118);
				match(T__11);
				setState(119);
				label();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final PickupContext pickup() throws RecognitionException {
		PickupContext _localctx = new PickupContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pickup);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(121);
				match(T__14);
				setState(122);
				match(T__11);
				setState(123);
				label();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(125);
				match(T__15);
				setState(126);
				match(T__11);
				setState(127);
				label();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FlipContext flip() throws RecognitionException {
		FlipContext _localctx = new FlipContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_flip);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(129);
				match(T__16);
				setState(130);
				((FlipContext) _localctx).max = match(NUMBER);
				setState(131);
				match(T__11);
				setState(132);
				((FlipContext) _localctx).alt = label();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final BreedContext breed() throws RecognitionException {
		BreedContext _localctx = new BreedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_breed);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(134);
				match(T__17);
				setState(135);
				match(T__11);
				setState(136);
				label();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final JumpContext jump() throws RecognitionException {
		JumpContext _localctx = new JumpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jump);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(138);
				match(T__18);
				setState(139);
				label();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_direction);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(141);
				match(T__19);
				setState(142);
				match(DIR_DIR);
				setState(143);
				match(T__11);
				setState(144);
				label();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_turn);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(146);
				match(T__20);
				setState(147);
				match(SENSE_DIR);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final InlineContext inline() throws RecognitionException {
		InlineContext _localctx = new InlineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(149);
				match(T__21);
				setState(150);
				match(IDENTIFIER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(152);
				match(T__22);
				setState(153);
				match(IDENTIFIER);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrainContext extends ParserRuleContext {
		public BrainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(GrammarParser.IDENTIFIER, 0);
		}

		public TerminalNode EOF() {
			return getToken(GrammarParser.EOF, 0);
		}

		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}

		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_brain;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitBrain(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(GrammarParser.IDENTIFIER, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_block;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class, 0);
		}

		public InlineContext inline() {
			return getRuleContext(InlineContext.class, 0);
		}

		public ChangeblockContext changeblock() {
			return getRuleContext(ChangeblockContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public MarkContext mark() {
			return getRuleContext(MarkContext.class, 0);
		}

		public UnmarkContext unmark() {
			return getRuleContext(UnmarkContext.class, 0);
		}

		public SetContext set() {
			return getRuleContext(SetContext.class, 0);
		}

		public UnsetContext unset() {
			return getRuleContext(UnsetContext.class, 0);
		}

		public TestContext test() {
			return getRuleContext(TestContext.class, 0);
		}

		public SenseContext sense() {
			return getRuleContext(SenseContext.class, 0);
		}

		public MoveContext move() {
			return getRuleContext(MoveContext.class, 0);
		}

		public PickupContext pickup() {
			return getRuleContext(PickupContext.class, 0);
		}

		public DropContext drop() {
			return getRuleContext(DropContext.class, 0);
		}

		public FlipContext flip() {
			return getRuleContext(FlipContext.class, 0);
		}

		public BreedContext breed() {
			return getRuleContext(BreedContext.class, 0);
		}

		public JumpContext jump() {
			return getRuleContext(JumpContext.class, 0);
		}

		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class, 0);
		}

		public TurnContext turn() {
			return getRuleContext(TurnContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_instruction;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ChangeblockContext extends ParserRuleContext {
		public ChangeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(GrammarParser.IDENTIFIER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_changeblock;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor)
				return ((GrammarVisitor<? extends T>) visitor).visitChangeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MarkContext extends ParserRuleContext {
		public MarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NUMBER() {
			return getToken(GrammarParser.NUMBER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_mark;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class UnmarkContext extends ParserRuleContext {
		public UnmarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NUMBER() {
			return getToken(GrammarParser.NUMBER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unmark;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitUnmark(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SetContext extends ParserRuleContext {
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NUMBER() {
			return getToken(GrammarParser.NUMBER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_set;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class UnsetContext extends ParserRuleContext {
		public UnsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NUMBER() {
			return getToken(GrammarParser.NUMBER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unset;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitUnset(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TestContext extends ParserRuleContext {
		public Token reg;
		public LabelContext alt;

		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NUMBER() {
			return getToken(GrammarParser.NUMBER, 0);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_test;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SenseContext extends ParserRuleContext {
		public Token mbm;
		public LabelContext alt;

		public SenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode SENSE_DIR() {
			return getToken(GrammarParser.SENSE_DIR, 0);
		}

		public TerminalNode SENSE_TARGET() {
			return getToken(GrammarParser.SENSE_TARGET, 0);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		public TerminalNode NUMBER() {
			return getToken(GrammarParser.NUMBER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sense;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitSense(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MoveContext extends ParserRuleContext {
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_move;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class PickupContext extends ParserRuleContext {
		public PickupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pickup;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitPickup(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class DropContext extends ParserRuleContext {
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_drop;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FlipContext extends ParserRuleContext {
		public Token max;
		public LabelContext alt;

		public FlipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NUMBER() {
			return getToken(GrammarParser.NUMBER, 0);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_flip;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitFlip(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BreedContext extends ParserRuleContext {
		public BreedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_breed;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitBreed(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class JumpContext extends ParserRuleContext {
		public JumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_jump;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class DirectionContext extends ParserRuleContext {
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode DIR_DIR() {
			return getToken(GrammarParser.DIR_DIR, 0);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_direction;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TurnContext extends ParserRuleContext {
		public TurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode SENSE_DIR() {
			return getToken(GrammarParser.SENSE_DIR, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_turn;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitTurn(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InlineContext extends ParserRuleContext {
		public InlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(GrammarParser.IDENTIFIER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_inline;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitInline(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LabelContext extends ParserRuleContext {
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(GrammarParser.IDENTIFIER, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_label;
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
}