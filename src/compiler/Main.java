package compiler;

import antlr.GrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        try {
            CharStream input = CharStreams.fromFileName(args[0]);
            var lexer = new antlr.GrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammarParser parser = new GrammarParser(tokens);
            Visitor visitor = new Visitor();
            System.out.println(visitor.visitBrain(parser.brain()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
