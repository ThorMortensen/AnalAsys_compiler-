// Generated from C:\Users\Thor\Dropbox\DUT\3.Sem\Compiler_Teknik\Compiler_Netbeans\MiniJavaCompiler\Compiler Netbeans\MiniJava_Frontend\src\compiler\Frontend\MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssign(@NotNull MiniJavaParser.StatementAssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(@NotNull MiniJavaParser.StatementReturnContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionConstantString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantString(@NotNull MiniJavaParser.ExpressionConstantStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull MiniJavaParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull MiniJavaParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantInteger(@NotNull MiniJavaParser.ExpressionConstantIntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#idThis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdThis(@NotNull MiniJavaParser.IdThisContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementAssignArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignArray(@NotNull MiniJavaParser.StatementAssignArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementDecrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDecrement(@NotNull MiniJavaParser.StatementDecrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeChar(@NotNull MiniJavaParser.TypeCharContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull MiniJavaParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPrint(@NotNull MiniJavaParser.StatementPrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel5(@NotNull MiniJavaParser.Level5Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel4(@NotNull MiniJavaParser.Level4Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#idIDENT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdIDENT(@NotNull MiniJavaParser.IdIDENTContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionPreIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPreIncrement(@NotNull MiniJavaParser.ExpressionPreIncrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIdentifier(@NotNull MiniJavaParser.ExpressionIdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementPrintln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPrintln(@NotNull MiniJavaParser.StatementPrintlnContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionNegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNegation(@NotNull MiniJavaParser.ExpressionNegationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclarationStaticArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationStaticArray(@NotNull MiniJavaParser.VarDeclarationStaticArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#identifierId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierId(@NotNull MiniJavaParser.IdentifierIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeClass(@NotNull MiniJavaParser.TypeClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionArrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArrayAccess(@NotNull MiniJavaParser.ExpressionArrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionUnaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionUnaryMinus(@NotNull MiniJavaParser.ExpressionUnaryMinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBoolean(@NotNull MiniJavaParser.TypeBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel1(@NotNull MiniJavaParser.Level1Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(@NotNull MiniJavaParser.StatementWhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel3(@NotNull MiniJavaParser.Level3Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMethodCall(@NotNull MiniJavaParser.ExpressionMethodCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#procType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcType(@NotNull MiniJavaParser.ProcTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel2(@NotNull MiniJavaParser.Level2Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionPreDecrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPreDecrement(@NotNull MiniJavaParser.ExpressionPreDecrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementMethod(@NotNull MiniJavaParser.StatementMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull MiniJavaParser.MainClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#identifierIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierIdentifier(@NotNull MiniJavaParser.IdentifierIdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionConstantFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantFalse(@NotNull MiniJavaParser.ExpressionConstantFalseContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBasic(@NotNull MiniJavaParser.TypeBasicContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionPostIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPostIncrement(@NotNull MiniJavaParser.ExpressionPostIncrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MiniJavaParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionNewObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNewObject(@NotNull MiniJavaParser.ExpressionNewObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#varDeclarationAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationAssign(@NotNull MiniJavaParser.VarDeclarationAssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVoid(@NotNull MiniJavaParser.TypeVoidContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull MiniJavaParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(@NotNull MiniJavaParser.StatementForContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNewArray(@NotNull MiniJavaParser.ExpressionNewArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(@NotNull MiniJavaParser.TypeArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#typeInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(@NotNull MiniJavaParser.TypeIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementPlusEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPlusEqual(@NotNull MiniJavaParser.StatementPlusEqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementTernary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementTernary(@NotNull MiniJavaParser.StatementTernaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionParentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParentheses(@NotNull MiniJavaParser.ExpressionParenthesesContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIncrement(@NotNull MiniJavaParser.StatementIncrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull MiniJavaParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#statementIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(@NotNull MiniJavaParser.StatementIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionPostDecrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPostDecrement(@NotNull MiniJavaParser.ExpressionPostDecrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJavaParser#expressionConstantTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantTrue(@NotNull MiniJavaParser.ExpressionConstantTrueContext ctx);
}