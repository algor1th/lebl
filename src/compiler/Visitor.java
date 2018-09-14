package compiler;

import antlr.GrammarBaseVisitor;
import antlr.GrammarParser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Visitor extends GrammarBaseVisitor {

    private final Map<String, GrammarParser.BlockContext> blocks = new HashMap<>();
    private LabelScope scope = new LabelScope();

    @Override
    public String visitBrain(GrammarParser.BrainContext ctx) {
        var name = ctx.IDENTIFIER().getSymbol().getText();
        List<GrammarParser.StatementContext> code;
        ctx.block().forEach(block -> blocks.put(block.IDENTIFIER().getSymbol().getText(), block));
//        for (GrammarParser.BlockContext block :
//                ctx.block()) {
////            System.out.println(block.IDENTIFIER());
//            code.addAll(visitBlock(block));
//        }
        code = visitBlock(blocks.get("main"));
        for (int i = 0; i < code.size(); i++) {
            var statement = code.get(i);
            if (statement.label() != null) {
                scope.setLabel(statement.label().getText(), i);
                code.remove(statement);
                i = 0;
            }
        }
        StringBuilder ret = new StringBuilder("brain " + name + " {\n");
        for (GrammarParser.StatementContext statementContext : visitBlock(blocks.get("main"))) {
            if (statementContext.label() != null)
                continue;
            ret.append(visitChildren(statementContext)).append("\n");
        }
        ret.append("}");
        return ret.toString();
    }

    @Override
    public List<GrammarParser.StatementContext> visitBlock(GrammarParser.BlockContext ctx) {
        List<GrammarParser.StatementContext> block = new LinkedList();
        for (GrammarParser.StatementContext statement :
                ctx.statement()) {
            if (statement.inline() != null) {
                block.addAll(visitInline(statement.inline()));
            } else block.add(statement);
        }
        return block;
    }

    @Override
    public Object visitInstruction(GrammarParser.InstructionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitMark(GrammarParser.MarkContext ctx) {
        return "mark " + ctx.NUMBER().getSymbol().getText();
    }

    @Override
    public String visitUnmark(GrammarParser.UnmarkContext ctx) {
        return "unmark " + ctx.NUMBER().getSymbol().getText();
    }

    @Override
    public String visitSet(GrammarParser.SetContext ctx) {
        return "set " + ctx.NUMBER().getSymbol().getText();
    }

    @Override
    public String visitUnset(GrammarParser.UnsetContext ctx) {
        return "unset " + ctx.NUMBER().getSymbol();
    }

    @Override
    public String visitTest(GrammarParser.TestContext ctx) {
        return "test " + ctx.reg.getText() + " else " + getLabelIndex(ctx.alt.getText());
    }

    private int getLabelIndex(String label) {
        return scope.lookupLabel(label);
    }

    @Override
    public String visitSense(GrammarParser.SenseContext ctx) {
        return "sense " + ctx.SENSE_TARGET().getText() + " else " + ctx.alt.getText();
    }

    @Override
    public Object visitMove(GrammarParser.MoveContext ctx) {
        return null;
    }

    @Override
    public Object visitPickup(GrammarParser.PickupContext ctx) {
        return null;
    }

    @Override
    public Object visitDrop(GrammarParser.DropContext ctx) {
        return null;
    }

    @Override
    public Object visitFlip(GrammarParser.FlipContext ctx) {
        return null;
    }

    @Override
    public Object visitBreed(GrammarParser.BreedContext ctx) {
        return null;
    }

    @Override
    public Object visitJump(GrammarParser.JumpContext ctx) {
        return "jump " + getLabelIndex(ctx.label().getText());
    }

    @Override
    public Object visitDirection(GrammarParser.DirectionContext ctx) {
        return null;
    }

    @Override
    public Object visitTurn(GrammarParser.TurnContext ctx) {
        return null;
    }

    @Override
    public List<GrammarParser.StatementContext> visitInline(GrammarParser.InlineContext ctx) {
        GrammarParser.BlockContext block = blocks.get(ctx.IDENTIFIER().getText());
        return visitBlock(block);
    }

    @Override
    public Object visitLabel(GrammarParser.LabelContext ctx) {
        return "label " + ctx.getText();
    }
}
