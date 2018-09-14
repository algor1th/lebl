// Generated from Grammar.g4 by ANTLR 4.7.1
package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, SENSE_DIR = 23, SENSE_TARGET = 24,
            DIR_DIR = 25, NUMBER = 26, IDENTIFIER = 27, WS = 28;
    public static final int
            RULE_brain = 0, RULE_block = 1, RULE_statement = 2, RULE_instruction = 3,
            RULE_mark = 4, RULE_unmark = 5, RULE_set = 6, RULE_unset = 7, RULE_test = 8,
            RULE_sense = 9, RULE_move = 10, RULE_pickup = 11, RULE_drop = 12, RULE_flip = 13,
            RULE_breed = 14, RULE_jump = 15, RULE_direction = 16, RULE_turn = 17,
            RULE_inline = 18, RULE_label = 19;
    public static final String[] ruleNames = {
            "brain", "block", "statement", "instruction", "mark", "unmark", "set",
            "unset", "test", "sense", "move", "pickup", "drop", "flip", "breed", "jump",
            "direction", "turn", "inline", "label"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0098\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\6\2/\n\2\r\2\16\2\60\3" +
                    "\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\6\3;\n\3\r\3\16\3<\3\3\3\3\3\4\3\4\3\4" +
                    "\5\4D\n\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
                    "\3\5\5\5V\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n" +
                    "\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13m\n\13\3\13\3\13\3\13\3\f\3\f\3\f" +
                    "\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20" +
                    "\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23" +
                    "\3\24\3\24\3\24\3\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26" +
                    "\30\32\34\36 \"$&(\2\2\2\u0095\2*\3\2\2\2\4\64\3\2\2\2\6E\3\2\2\2\bU\3" +
                    "\2\2\2\nW\3\2\2\2\fZ\3\2\2\2\16]\3\2\2\2\20`\3\2\2\2\22c\3\2\2\2\24h\3" +
                    "\2\2\2\26q\3\2\2\2\30u\3\2\2\2\32y\3\2\2\2\34}\3\2\2\2\36\u0082\3\2\2" +
                    "\2 \u0086\3\2\2\2\"\u0089\3\2\2\2$\u008e\3\2\2\2&\u0091\3\2\2\2(\u0094" +
                    "\3\2\2\2*+\7\3\2\2+,\7\35\2\2,.\7\4\2\2-/\5\4\3\2.-\3\2\2\2/\60\3\2\2" +
                    "\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2" +
                    "\64\65\7\5\2\2\65\66\7\35\2\2\66:\7\6\2\2\678\5\6\4\289\7\4\2\29;\3\2" +
                    "\2\2:\67\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\7\2\2?\5" +
                    "\3\2\2\2@F\5(\25\2AD\5\b\5\2BD\5&\24\2CA\3\2\2\2CB\3\2\2\2DF\3\2\2\2E" +
                    "@\3\2\2\2EC\3\2\2\2F\7\3\2\2\2GV\5\n\6\2HV\5\f\7\2IV\5\16\b\2JV\5\20\t" +
                    "\2KV\5\22\n\2LV\5\24\13\2MV\5\26\f\2NV\5\30\r\2OV\5\32\16\2PV\5\34\17" +
                    "\2QV\5\36\20\2RV\5 \21\2SV\5\"\22\2TV\5$\23\2UG\3\2\2\2UH\3\2\2\2UI\3" +
                    "\2\2\2UJ\3\2\2\2UK\3\2\2\2UL\3\2\2\2UM\3\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3" +
                    "\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\t\3\2\2\2WX\7\b\2\2XY" +
                    "\7\34\2\2Y\13\3\2\2\2Z[\7\t\2\2[\\\7\34\2\2\\\r\3\2\2\2]^\7\n\2\2^_\7" +
                    "\34\2\2_\17\3\2\2\2`a\7\13\2\2ab\7\34\2\2b\21\3\2\2\2cd\7\f\2\2de\7\34" +
                    "\2\2ef\7\r\2\2fg\5(\25\2g\23\3\2\2\2hi\7\16\2\2ij\7\31\2\2jl\7\32\2\2" +
                    "km\7\34\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\r\2\2op\5(\25\2p\25\3\2" +
                    "\2\2qr\7\17\2\2rs\7\r\2\2st\5(\25\2t\27\3\2\2\2uv\7\20\2\2vw\7\r\2\2w" +
                    "x\5(\25\2x\31\3\2\2\2yz\7\21\2\2z{\7\r\2\2{|\5(\25\2|\33\3\2\2\2}~\7\22" +
                    "\2\2~\177\7\34\2\2\177\u0080\7\r\2\2\u0080\u0081\5(\25\2\u0081\35\3\2" +
                    "\2\2\u0082\u0083\7\23\2\2\u0083\u0084\7\r\2\2\u0084\u0085\5(\25\2\u0085" +
                    "\37\3\2\2\2\u0086\u0087\7\24\2\2\u0087\u0088\5(\25\2\u0088!\3\2\2\2\u0089" +
                    "\u008a\7\25\2\2\u008a\u008b\7\33\2\2\u008b\u008c\7\r\2\2\u008c\u008d\5" +
                    "(\25\2\u008d#\3\2\2\2\u008e\u008f\7\26\2\2\u008f\u0090\7\31\2\2\u0090" +
                    "%\3\2\2\2\u0091\u0092\7\27\2\2\u0092\u0093\7\35\2\2\u0093\'\3\2\2\2\u0094" +
                    "\u0095\7\30\2\2\u0095\u0096\7\35\2\2\u0096)\3\2\2\2\b\60<CEUl";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'name'", "';'", "'block'", "'{'", "'}'", "'mark'", "'unmark'",
            "'set'", "'unset'", "'test'", "'else'", "'sense'", "'move'", "'pickup'",
            "'drop'", "'flip'", "'breed'", "'jump'", "'direction'", "'turn'", "'inline'",
            "'$'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, "SENSE_DIR",
            "SENSE_TARGET", "DIR_DIR", "NUMBER", "IDENTIFIER", "WS"
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
                setState(40);
                match(T__0);
                setState(41);
                match(IDENTIFIER);
                setState(42);
                match(T__1);
                setState(44);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(43);
                            block();
                        }
                    }
                    setState(46);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == T__2);
                setState(48);
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
                setState(50);
                match(T__2);
                setState(51);
                match(IDENTIFIER);
                setState(52);
                match(T__3);
                setState(56);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(53);
                            statement();
                            setState(54);
                            match(T__1);
                        }
                    }
                    setState(58);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0));
                setState(60);
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
            setState(67);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__21:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        setState(62);
                        label();
                    }
                }
                break;
                case T__5:
                case T__6:
                case T__7:
                case T__8:
                case T__9:
                case T__11:
                case T__12:
                case T__13:
                case T__14:
                case T__15:
                case T__16:
                case T__17:
                case T__18:
                case T__19:
                case T__20:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(65);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case T__5:
                        case T__6:
                        case T__7:
                        case T__8:
                        case T__9:
                        case T__11:
                        case T__12:
                        case T__13:
                        case T__14:
                        case T__15:
                        case T__16:
                        case T__17:
                        case T__18:
                        case T__19: {
                            setState(63);
                            instruction();
                        }
                        break;
                        case T__20: {
                            setState(64);
                            inline();
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
            setState(83);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__5:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(69);
                    mark();
                }
                break;
                case T__6:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(70);
                    unmark();
                }
                break;
                case T__7:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(71);
                    set();
                }
                break;
                case T__8:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(72);
                    unset();
                }
                break;
                case T__9:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(73);
                    test();
                }
                break;
                case T__11:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(74);
                    sense();
                }
                break;
                case T__12:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(75);
                    move();
                }
                break;
                case T__13:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(76);
                    pickup();
                }
                break;
                case T__14:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(77);
                    drop();
                }
                break;
                case T__15:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(78);
                    flip();
                }
                break;
                case T__16:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(79);
                    breed();
                }
                break;
                case T__17:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(80);
                    jump();
                }
                break;
                case T__18:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(81);
                    direction();
                }
                break;
                case T__19:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(82);
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

    public final MarkContext mark() throws RecognitionException {
        MarkContext _localctx = new MarkContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_mark);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(85);
                match(T__5);
                setState(86);
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
        enterRule(_localctx, 10, RULE_unmark);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(88);
                match(T__6);
                setState(89);
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
        enterRule(_localctx, 12, RULE_set);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(91);
                match(T__7);
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

    public final UnsetContext unset() throws RecognitionException {
        UnsetContext _localctx = new UnsetContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_unset);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(94);
                match(T__8);
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

    public final TestContext test() throws RecognitionException {
        TestContext _localctx = new TestContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_test);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(97);
                match(T__9);
                setState(98);
                ((TestContext) _localctx).reg = match(NUMBER);
                setState(99);
                match(T__10);
                setState(100);
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
        enterRule(_localctx, 18, RULE_sense);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(102);
                match(T__11);
                setState(103);
                match(SENSE_DIR);
                setState(104);
                match(SENSE_TARGET);
                setState(106);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == NUMBER) {
                    {
                        setState(105);
                        ((SenseContext) _localctx).mbm = match(NUMBER);
                    }
                }

                setState(108);
                match(T__10);
                setState(109);
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
        enterRule(_localctx, 20, RULE_move);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(111);
                match(T__12);
                setState(112);
                match(T__10);
                setState(113);
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
        enterRule(_localctx, 22, RULE_pickup);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(115);
                match(T__13);
                setState(116);
                match(T__10);
                setState(117);
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
        enterRule(_localctx, 24, RULE_drop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(119);
                match(T__14);
                setState(120);
                match(T__10);
                setState(121);
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
        enterRule(_localctx, 26, RULE_flip);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(123);
                match(T__15);
                setState(124);
                ((FlipContext) _localctx).max = match(NUMBER);
                setState(125);
                match(T__10);
                setState(126);
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
        enterRule(_localctx, 28, RULE_breed);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(128);
                match(T__16);
                setState(129);
                match(T__10);
                setState(130);
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
        enterRule(_localctx, 30, RULE_jump);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(132);
                match(T__17);
                setState(133);
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
        enterRule(_localctx, 32, RULE_direction);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                match(T__18);
                setState(136);
                match(DIR_DIR);
                setState(137);
                match(T__10);
                setState(138);
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
        enterRule(_localctx, 34, RULE_turn);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(140);
                match(T__19);
                setState(141);
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
        enterRule(_localctx, 36, RULE_inline);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(143);
                match(T__20);
                setState(144);
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
        enterRule(_localctx, 38, RULE_label);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                match(T__21);
                setState(147);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterBrain(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitBrain(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitBlock(this);
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

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitStatement(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterInstruction(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitInstruction(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor)
                return ((GrammarVisitor<? extends T>) visitor).visitInstruction(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterMark(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitMark(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterUnmark(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitUnmark(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterSet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitSet(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterUnset(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitUnset(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterTest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitTest(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterSense(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitSense(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterMove(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitMove(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterPickup(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitPickup(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterDrop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitDrop(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterFlip(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitFlip(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterBreed(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitBreed(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterJump(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitJump(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterDirection(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitDirection(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterTurn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitTurn(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterInline(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitInline(this);
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
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).enterLabel(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof GrammarListener) ((GrammarListener) listener).exitLabel(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof GrammarVisitor) return ((GrammarVisitor<? extends T>) visitor).visitLabel(this);
            else return visitor.visitChildren(this);
        }
    }
}