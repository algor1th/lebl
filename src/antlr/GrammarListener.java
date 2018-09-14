// Generated from Grammar.g4 by ANTLR 4.7.1
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link GrammarParser#brain}.
     *
     * @param ctx the parse tree
     */
    void enterBrain(GrammarParser.BrainContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#brain}.
     *
     * @param ctx the parse tree
     */
    void exitBrain(GrammarParser.BrainContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(GrammarParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(GrammarParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(GrammarParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(GrammarParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void enterInstruction(GrammarParser.InstructionContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#instruction}.
     *
     * @param ctx the parse tree
     */
    void exitInstruction(GrammarParser.InstructionContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#mark}.
     *
     * @param ctx the parse tree
     */
    void enterMark(GrammarParser.MarkContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#mark}.
     *
     * @param ctx the parse tree
     */
    void exitMark(GrammarParser.MarkContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#unmark}.
     *
     * @param ctx the parse tree
     */
    void enterUnmark(GrammarParser.UnmarkContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#unmark}.
     *
     * @param ctx the parse tree
     */
    void exitUnmark(GrammarParser.UnmarkContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#set}.
     *
     * @param ctx the parse tree
     */
    void enterSet(GrammarParser.SetContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#set}.
     *
     * @param ctx the parse tree
     */
    void exitSet(GrammarParser.SetContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#unset}.
     *
     * @param ctx the parse tree
     */
    void enterUnset(GrammarParser.UnsetContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#unset}.
     *
     * @param ctx the parse tree
     */
    void exitUnset(GrammarParser.UnsetContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#test}.
     *
     * @param ctx the parse tree
     */
    void enterTest(GrammarParser.TestContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#test}.
     *
     * @param ctx the parse tree
     */
    void exitTest(GrammarParser.TestContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#sense}.
     *
     * @param ctx the parse tree
     */
    void enterSense(GrammarParser.SenseContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#sense}.
     *
     * @param ctx the parse tree
     */
    void exitSense(GrammarParser.SenseContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#move}.
     *
     * @param ctx the parse tree
     */
    void enterMove(GrammarParser.MoveContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#move}.
     *
     * @param ctx the parse tree
     */
    void exitMove(GrammarParser.MoveContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#pickup}.
     *
     * @param ctx the parse tree
     */
    void enterPickup(GrammarParser.PickupContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#pickup}.
     *
     * @param ctx the parse tree
     */
    void exitPickup(GrammarParser.PickupContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#drop}.
     *
     * @param ctx the parse tree
     */
    void enterDrop(GrammarParser.DropContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#drop}.
     *
     * @param ctx the parse tree
     */
    void exitDrop(GrammarParser.DropContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#flip}.
     *
     * @param ctx the parse tree
     */
    void enterFlip(GrammarParser.FlipContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#flip}.
     *
     * @param ctx the parse tree
     */
    void exitFlip(GrammarParser.FlipContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#breed}.
     *
     * @param ctx the parse tree
     */
    void enterBreed(GrammarParser.BreedContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#breed}.
     *
     * @param ctx the parse tree
     */
    void exitBreed(GrammarParser.BreedContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#jump}.
     *
     * @param ctx the parse tree
     */
    void enterJump(GrammarParser.JumpContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#jump}.
     *
     * @param ctx the parse tree
     */
    void exitJump(GrammarParser.JumpContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#direction}.
     *
     * @param ctx the parse tree
     */
    void enterDirection(GrammarParser.DirectionContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#direction}.
     *
     * @param ctx the parse tree
     */
    void exitDirection(GrammarParser.DirectionContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#turn}.
     *
     * @param ctx the parse tree
     */
    void enterTurn(GrammarParser.TurnContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#turn}.
     *
     * @param ctx the parse tree
     */
    void exitTurn(GrammarParser.TurnContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#inline}.
     *
     * @param ctx the parse tree
     */
    void enterInline(GrammarParser.InlineContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#inline}.
     *
     * @param ctx the parse tree
     */
    void exitInline(GrammarParser.InlineContext ctx);

    /**
     * Enter a parse tree produced by {@link GrammarParser#label}.
     *
     * @param ctx the parse tree
     */
    void enterLabel(GrammarParser.LabelContext ctx);

    /**
     * Exit a parse tree produced by {@link GrammarParser#label}.
     *
     * @param ctx the parse tree
     */
    void exitLabel(GrammarParser.LabelContext ctx);
}