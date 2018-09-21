package compiler;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;
import compiler.statements.ChangeblockStatement;
import compiler.statements.InlineStatement;
import compiler.statements.InstructionStatement;
import compiler.statements.JumpInstructionStatement;
import compiler.statements.LabelStatement;
import compiler.statements.Statement;

public class StatementVisitor extends GrammarBaseVisitor<Statement> {
    @Override
    public Statement visitMark(GrammarParser.MarkContext ctx) {
        return new InstructionStatement("mark " + ctx.NUMBER().getSymbol().getText());
    }

    @Override
    public Statement visitUnmark(GrammarParser.UnmarkContext ctx) {
        return new InstructionStatement("unmark " + ctx.NUMBER().getSymbol().getText());
    }

    @Override
    public Statement visitSet(GrammarParser.SetContext ctx) {
        return new InstructionStatement("set " + ctx.NUMBER().getSymbol().getText());
    }

    @Override
    public Statement visitUnset(GrammarParser.UnsetContext ctx) {
        return new InstructionStatement("unset " + ctx.NUMBER().getSymbol());
    }

    @Override
    public Statement visitTurn(GrammarParser.TurnContext ctx) {
        return new InstructionStatement("turn " + ctx.SENSE_DIR());
    }

    @Override
    public Statement visitTest(GrammarParser.TestContext ctx) {
        return new JumpInstructionStatement("test " + ctx.reg.getText() + " else ", ctx.alt.getText());
    }

    @Override
    public Statement visitSense(GrammarParser.SenseContext ctx) {
        return new JumpInstructionStatement("sense " + ctx.SENSE_DIR() + " " + ctx.SENSE_TARGET().getText() + " else ", ctx.alt.getText());
    }

    @Override
    public Statement visitMove(GrammarParser.MoveContext ctx) {
        return new JumpInstructionStatement("move else ", ctx.label().getText());
    }

    @Override
    public Statement visitPickup(GrammarParser.PickupContext ctx) {
        return new JumpInstructionStatement("pickup else ", ctx.label().getText());
    }

    @Override
    public Statement visitDrop(GrammarParser.DropContext ctx) {
        return new JumpInstructionStatement("drop else ", ctx.label().getText());
    }

    @Override
    public Statement visitFlip(GrammarParser.FlipContext ctx) {
        return new JumpInstructionStatement("flip " + Integer.parseInt(ctx.max.getText()) + " else ", ctx.alt.getText());
    }

    @Override
    public Statement visitBreed(GrammarParser.BreedContext ctx) {
        return new JumpInstructionStatement("breed else ", ctx.label().getText());
    }

    @Override
    public Statement visitJump(GrammarParser.JumpContext ctx) {
        return new JumpInstructionStatement("jump ", ctx.label().getText());
    }

    @Override
    public Statement visitDirection(GrammarParser.DirectionContext ctx) {
        return new JumpInstructionStatement("direction " + ctx.DIR_DIR() + " else ", ctx.label().getText());
    }

    @Override
    public Statement visitInline(GrammarParser.InlineContext ctx) {
        return new InlineStatement(ctx.IDENTIFIER().getText());
    }

    @Override
    public Statement visitChangeblock(GrammarParser.ChangeblockContext ctx) {
        return new ChangeblockStatement(ctx.IDENTIFIER().getText());
    }

    @Override
    public Statement visitLabel(GrammarParser.LabelContext ctx) {
        return new LabelStatement(ctx.getText());
    }
}
