// Generated from Grammar.g4 by ANTLR 4.7.1
package antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, SENSE_DIR = 24,
            SENSE_TARGET = 25, DIR_DIR = 26, NUMBER = 27, IDENTIFIER = 28, WS = 29;
    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
            "T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "SENSE_DIR", "SENSE_TARGET",
            "DIR_DIR", "NUMBER", "IDENTIFIER", "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u014f\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3" +
                    "\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3" +
                    "\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3" +
                    "\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17" +
                    "\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21" +
                    "\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24" +
                    "\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26" +
                    "\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\5\31\u00cc\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\5\32\u0111\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
                    "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
                    "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" +
                    "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u013f\n\33\3\34\6\34\u0142\n" +
                    "\34\r\34\16\34\u0143\3\35\3\35\6\35\u0148\n\35\r\35\16\35\u0149\3\36\3" +
                    "\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27" +
                    "\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33" +
                    "\65\34\67\359\36;\37\3\2\6\3\2\62;\6\2/\60C\\aac|\7\2/\60\62;C\\aac|\5" +
                    "\2\13\f\17\17\"\"\2\u0162\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2" +
                    "\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2" +
                    "\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3" +
                    "\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2" +
                    "\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67" +
                    "\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5B\3\2\2\2\7D\3\2\2\2\tJ\3\2" +
                    "\2\2\13L\3\2\2\2\rN\3\2\2\2\17Z\3\2\2\2\21_\3\2\2\2\23f\3\2\2\2\25j\3" +
                    "\2\2\2\27p\3\2\2\2\31u\3\2\2\2\33z\3\2\2\2\35\u0080\3\2\2\2\37\u0085\3" +
                    "\2\2\2!\u008c\3\2\2\2#\u0091\3\2\2\2%\u0096\3\2\2\2\'\u009c\3\2\2\2)\u00a1" +
                    "\3\2\2\2+\u00ab\3\2\2\2-\u00b0\3\2\2\2/\u00b7\3\2\2\2\61\u00cb\3\2\2\2" +
                    "\63\u0110\3\2\2\2\65\u013e\3\2\2\2\67\u0141\3\2\2\29\u0145\3\2\2\2;\u014b" +
                    "\3\2\2\2=>\7p\2\2>?\7c\2\2?@\7o\2\2@A\7g\2\2A\4\3\2\2\2BC\7=\2\2C\6\3" +
                    "\2\2\2DE\7d\2\2EF\7n\2\2FG\7q\2\2GH\7e\2\2HI\7m\2\2I\b\3\2\2\2JK\7}\2" +
                    "\2K\n\3\2\2\2LM\7\177\2\2M\f\3\2\2\2NO\7e\2\2OP\7j\2\2PQ\7c\2\2QR\7p\2" +
                    "\2RS\7i\2\2ST\7g\2\2TU\7d\2\2UV\7n\2\2VW\7q\2\2WX\7e\2\2XY\7m\2\2Y\16" +
                    "\3\2\2\2Z[\7o\2\2[\\\7c\2\2\\]\7t\2\2]^\7m\2\2^\20\3\2\2\2_`\7w\2\2`a" +
                    "\7p\2\2ab\7o\2\2bc\7c\2\2cd\7t\2\2de\7m\2\2e\22\3\2\2\2fg\7u\2\2gh\7g" +
                    "\2\2hi\7v\2\2i\24\3\2\2\2jk\7w\2\2kl\7p\2\2lm\7u\2\2mn\7g\2\2no\7v\2\2" +
                    "o\26\3\2\2\2pq\7v\2\2qr\7g\2\2rs\7u\2\2st\7v\2\2t\30\3\2\2\2uv\7g\2\2" +
                    "vw\7n\2\2wx\7u\2\2xy\7g\2\2y\32\3\2\2\2z{\7u\2\2{|\7g\2\2|}\7p\2\2}~\7" +
                    "u\2\2~\177\7g\2\2\177\34\3\2\2\2\u0080\u0081\7o\2\2\u0081\u0082\7q\2\2" +
                    "\u0082\u0083\7x\2\2\u0083\u0084\7g\2\2\u0084\36\3\2\2\2\u0085\u0086\7" +
                    "r\2\2\u0086\u0087\7k\2\2\u0087\u0088\7e\2\2\u0088\u0089\7m\2\2\u0089\u008a" +
                    "\7w\2\2\u008a\u008b\7r\2\2\u008b \3\2\2\2\u008c\u008d\7f\2\2\u008d\u008e" +
                    "\7t\2\2\u008e\u008f\7q\2\2\u008f\u0090\7r\2\2\u0090\"\3\2\2\2\u0091\u0092" +
                    "\7h\2\2\u0092\u0093\7n\2\2\u0093\u0094\7k\2\2\u0094\u0095\7r\2\2\u0095" +
                    "$\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098\7t\2\2\u0098\u0099\7g\2\2\u0099" +
                    "\u009a\7g\2\2\u009a\u009b\7f\2\2\u009b&\3\2\2\2\u009c\u009d\7l\2\2\u009d" +
                    "\u009e\7w\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7r\2\2\u00a0(\3\2\2\2\u00a1" +
                    "\u00a2\7f\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2" +
                    "\u00a5\u00a6\7e\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9" +
                    "\7q\2\2\u00a9\u00aa\7p\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad" +
                    "\7w\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7p\2\2\u00af,\3\2\2\2\u00b0\u00b1" +
                    "\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7k\2\2\u00b4" +
                    "\u00b5\7p\2\2\u00b5\u00b6\7g\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7&\2\2\u00b8" +
                    "\60\3\2\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7h\2\2\u00bc" +
                    "\u00cc\7v\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7i\2\2" +
                    "\u00c0\u00c1\7j\2\2\u00c1\u00cc\7v\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4" +
                    "\7j\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7c\2\2\u00c6\u00cc\7f\2\2\u00c7" +
                    "\u00c8\7j\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cc\7g\2\2" +
                    "\u00cb\u00b9\3\2\2\2\u00cb\u00bd\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c7" +
                    "\3\2\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\7o\2\2\u00ce\u00cf\7c\2\2\u00cf" +
                    "\u00d0\7t\2\2\u00d0\u00d1\7m\2\2\u00d1\u00d2\7g\2\2\u00d2\u0111\7t\2\2" +
                    "\u00d3\u00d4\7h\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7" +
                    "\7g\2\2\u00d7\u00d8\7p\2\2\u00d8\u0111\7f\2\2\u00d9\u00da\7h\2\2\u00da" +
                    "\u00db\7q\2\2\u00db\u0111\7g\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7q\2\2" +
                    "\u00de\u00df\7q\2\2\u00df\u0111\7f\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2" +
                    "\7q\2\2\u00e2\u00e3\7e\2\2\u00e3\u0111\7m\2\2\u00e4\u00e5\7j\2\2\u00e5" +
                    "\u00e6\7q\2\2\u00e6\u00e7\7o\2\2\u00e7\u0111\7g\2\2\u00e8\u00e9\7h\2\2" +
                    "\u00e9\u00ea\7q\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed" +
                    "\7q\2\2\u00ed\u00ee\7o\2\2\u00ee\u0111\7g\2\2\u00ef\u00f0\7c\2\2\u00f0" +
                    "\u00f1\7p\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7k\2\2" +
                    "\u00f4\u00f5\7q\2\2\u00f5\u0111\7p\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8" +
                    "\7q\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7c\2\2\u00fb" +
                    "\u00fc\7t\2\2\u00fc\u00fd\7m\2\2\u00fd\u00fe\7g\2\2\u00fe\u0111\7t\2\2" +
                    "\u00ff\u0100\7h\2\2\u0100\u0101\7t\2\2\u0101\u0102\7k\2\2\u0102\u0103" +
                    "\7g\2\2\u0103\u0104\7p\2\2\u0104\u0105\7f\2\2\u0105\u0106\7h\2\2\u0106" +
                    "\u0107\7q\2\2\u0107\u0108\7q\2\2\u0108\u0111\7f\2\2\u0109\u010a\7h\2\2" +
                    "\u010a\u010b\7q\2\2\u010b\u010c\7g\2\2\u010c\u010d\7h\2\2\u010d\u010e" +
                    "\7q\2\2\u010e\u010f\7q\2\2\u010f\u0111\7f\2\2\u0110\u00cd\3\2\2\2\u0110" +
                    "\u00d3\3\2\2\2\u0110\u00d9\3\2\2\2\u0110\u00dc\3\2\2\2\u0110\u00e0\3\2" +
                    "\2\2\u0110\u00e4\3\2\2\2\u0110\u00e8\3\2\2\2\u0110\u00ef\3\2\2\2\u0110" +
                    "\u00f6\3\2\2\2\u0110\u00ff\3\2\2\2\u0110\u0109\3\2\2\2\u0111\64\3\2\2" +
                    "\2\u0112\u0113\7p\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115\u0116" +
                    "\7v\2\2\u0116\u0117\7j\2\2\u0117\u0118\7g\2\2\u0118\u0119\7c\2\2\u0119" +
                    "\u011a\7u\2\2\u011a\u013f\7v\2\2\u011b\u011c\7p\2\2\u011c\u011d\7q\2\2" +
                    "\u011d\u011e\7t\2\2\u011e\u011f\7v\2\2\u011f\u0120\7j\2\2\u0120\u0121" +
                    "\7y\2\2\u0121\u0122\7g\2\2\u0122\u0123\7u\2\2\u0123\u013f\7v\2\2\u0124" +
                    "\u0125\7y\2\2\u0125\u0126\7g\2\2\u0126\u0127\7u\2\2\u0127\u013f\7v\2\2" +
                    "\u0128\u0129\7u\2\2\u0129\u012a\7q\2\2\u012a\u012b\7w\2\2\u012b\u012c" +
                    "\7v\2\2\u012c\u012d\7j\2\2\u012d\u012e\7y\2\2\u012e\u012f\7g\2\2\u012f" +
                    "\u0130\7u\2\2\u0130\u013f\7v\2\2\u0131\u0132\7u\2\2\u0132\u0133\7q\2\2" +
                    "\u0133\u0134\7w\2\2\u0134\u0135\7v\2\2\u0135\u0136\7j\2\2\u0136\u0137" +
                    "\7g\2\2\u0137\u0138\7c\2\2\u0138\u0139\7u\2\2\u0139\u013f\7v\2\2\u013a" +
                    "\u013b\7g\2\2\u013b\u013c\7c\2\2\u013c\u013d\7u\2\2\u013d\u013f\7v\2\2" +
                    "\u013e\u0112\3\2\2\2\u013e\u011b\3\2\2\2\u013e\u0124\3\2\2\2\u013e\u0128" +
                    "\3\2\2\2\u013e\u0131\3\2\2\2\u013e\u013a\3\2\2\2\u013f\66\3\2\2\2\u0140" +
                    "\u0142\t\2\2\2\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2" +
                    "\2\2\u0143\u0144\3\2\2\2\u01448\3\2\2\2\u0145\u0147\t\3\2\2\u0146\u0148" +
                    "\t\4\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149" +
                    "\u014a\3\2\2\2\u014a:\3\2\2\2\u014b\u014c\t\5\2\2\u014c\u014d\3\2\2\2" +
                    "\u014d\u014e\b\36\2\2\u014e<\3\2\2\2\b\2\u00cb\u0110\u013e\u0143\u0149" +
                    "\3\b\2\2";
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
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

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

    public GrammarLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}