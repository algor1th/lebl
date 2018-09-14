package compiler;

import antlr.GrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String args[]) {
        CharStream input = CharStreams.fromString("name lolo; block main {$start jump $start; jump $start;}");
        var lexer = new antlr.GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        Listener listener = new Listener();
        var walker = new ParseTreeWalker();
        walker.walk(listener, parser.brain());
    }
}
