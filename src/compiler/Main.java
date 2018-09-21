package compiler;

import antlr.GrammarParser;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

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

    private static class FailFastErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            throw new IllegalArgumentException(String.format("syntax error at %d:%d (%s)", line, charPositionInLine, offendingSymbol), e);
        }
    }
}
