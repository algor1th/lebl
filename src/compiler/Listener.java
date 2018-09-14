package compiler;

import antlr.GrammarParser;

public class Listener extends antlr.GrammarBaseListener {
    private BrainBuilder brain = new BrainBuilder();
    private BlockBuilder block;

    @Override
    public void enterBrain(antlr.GrammarParser.BrainContext ctx) {
        brain.setName(ctx.IDENTIFIER().getSymbol().getText());
    }

    @Override
    public void enterBlock(GrammarParser.BlockContext ctx) {
        block = new BlockBuilder();
        block.setName(ctx.IDENTIFIER().getSymbol().getText());
    }

    @Override
    public void exitBlock(GrammarParser.BlockContext ctx) {
        brain.addBlock(block);
        block = null;
    }

    @Override
    public void enterJump(GrammarParser.JumpContext ctx) {
        System.out.print("jump " + ctx.label().IDENTIFIER().getSymbol().getText());
    }

    @Override
    public void enterStatement(GrammarParser.StatementContext ctx) {
        if (ctx.label() != null) {

        }
    }
}
