// Generated from Grammar.g4 by ANTLR 4.7.1
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link GrammarParser#brain}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBrain(GrammarParser.BrainContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(GrammarParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(GrammarParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#instruction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInstruction(GrammarParser.InstructionContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#mark}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMark(GrammarParser.MarkContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#unmark}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnmark(GrammarParser.UnmarkContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#set}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSet(GrammarParser.SetContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#unset}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnset(GrammarParser.UnsetContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#test}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTest(GrammarParser.TestContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#sense}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSense(GrammarParser.SenseContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#move}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMove(GrammarParser.MoveContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#pickup}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPickup(GrammarParser.PickupContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#drop}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDrop(GrammarParser.DropContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#flip}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFlip(GrammarParser.FlipContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#breed}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBreed(GrammarParser.BreedContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#jump}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitJump(GrammarParser.JumpContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#direction}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDirection(GrammarParser.DirectionContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#turn}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTurn(GrammarParser.TurnContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#inline}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInline(GrammarParser.InlineContext ctx);

    /**
     * Visit a parse tree produced by {@link GrammarParser#label}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLabel(GrammarParser.LabelContext ctx);
}