// Generated from C:\Users\Thor\Dropbox\DUT\3.Sem\Compiler_Teknik\Compiler_Netbeans\MiniJavaCompiler\Compiler Netbeans\MiniJava_Frontend\src\compiler\Frontend\MiniJava.g4 by ANTLR 4.1
package compiler.Frontend;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssign(@NotNull MiniJavaParser.StatementAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssign(@NotNull MiniJavaParser.StatementAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementReturn}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(@NotNull MiniJavaParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementReturn}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(@NotNull MiniJavaParser.StatementReturnContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionConstantString}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantString(@NotNull MiniJavaParser.ExpressionConstantStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionConstantString}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantString(@NotNull MiniJavaParser.ExpressionConstantStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MiniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MiniJavaParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJavaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantInteger(@NotNull MiniJavaParser.ExpressionConstantIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantInteger(@NotNull MiniJavaParser.ExpressionConstantIntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#idThis}.
	 * @param ctx the parse tree
	 */
	void enterIdThis(@NotNull MiniJavaParser.IdThisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#idThis}.
	 * @param ctx the parse tree
	 */
	void exitIdThis(@NotNull MiniJavaParser.IdThisContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementAssignArray}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignArray(@NotNull MiniJavaParser.StatementAssignArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementAssignArray}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignArray(@NotNull MiniJavaParser.StatementAssignArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementDecrement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDecrement(@NotNull MiniJavaParser.StatementDecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementDecrement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDecrement(@NotNull MiniJavaParser.StatementDecrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeChar}.
	 * @param ctx the parse tree
	 */
	void enterTypeChar(@NotNull MiniJavaParser.TypeCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeChar}.
	 * @param ctx the parse tree
	 */
	void exitTypeChar(@NotNull MiniJavaParser.TypeCharContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MiniJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MiniJavaParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementPrint}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrint(@NotNull MiniJavaParser.StatementPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementPrint}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrint(@NotNull MiniJavaParser.StatementPrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level5}.
	 * @param ctx the parse tree
	 */
	void enterLevel5(@NotNull MiniJavaParser.Level5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level5}.
	 * @param ctx the parse tree
	 */
	void exitLevel5(@NotNull MiniJavaParser.Level5Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level4}.
	 * @param ctx the parse tree
	 */
	void enterLevel4(@NotNull MiniJavaParser.Level4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level4}.
	 * @param ctx the parse tree
	 */
	void exitLevel4(@NotNull MiniJavaParser.Level4Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull MiniJavaParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#idIDENT}.
	 * @param ctx the parse tree
	 */
	void enterIdIDENT(@NotNull MiniJavaParser.IdIDENTContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#idIDENT}.
	 * @param ctx the parse tree
	 */
	void exitIdIDENT(@NotNull MiniJavaParser.IdIDENTContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull MiniJavaParser.VarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionPreIncrement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPreIncrement(@NotNull MiniJavaParser.ExpressionPreIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionPreIncrement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPreIncrement(@NotNull MiniJavaParser.ExpressionPreIncrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIdentifier(@NotNull MiniJavaParser.ExpressionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIdentifier(@NotNull MiniJavaParser.ExpressionIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementPrintln}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrintln(@NotNull MiniJavaParser.StatementPrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementPrintln}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrintln(@NotNull MiniJavaParser.StatementPrintlnContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionNegation}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNegation(@NotNull MiniJavaParser.ExpressionNegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionNegation}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNegation(@NotNull MiniJavaParser.ExpressionNegationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclarationStaticArray}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStaticArray(@NotNull MiniJavaParser.VarDeclarationStaticArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclarationStaticArray}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStaticArray(@NotNull MiniJavaParser.VarDeclarationStaticArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#identifierId}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierId(@NotNull MiniJavaParser.IdentifierIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#identifierId}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierId(@NotNull MiniJavaParser.IdentifierIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeClass}.
	 * @param ctx the parse tree
	 */
	void enterTypeClass(@NotNull MiniJavaParser.TypeClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeClass}.
	 * @param ctx the parse tree
	 */
	void exitTypeClass(@NotNull MiniJavaParser.TypeClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionArrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArrayAccess(@NotNull MiniJavaParser.ExpressionArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionArrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArrayAccess(@NotNull MiniJavaParser.ExpressionArrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionUnaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterExpressionUnaryMinus(@NotNull MiniJavaParser.ExpressionUnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionUnaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitExpressionUnaryMinus(@NotNull MiniJavaParser.ExpressionUnaryMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeBoolean}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoolean(@NotNull MiniJavaParser.TypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeBoolean}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoolean(@NotNull MiniJavaParser.TypeBooleanContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level1}.
	 * @param ctx the parse tree
	 */
	void enterLevel1(@NotNull MiniJavaParser.Level1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level1}.
	 * @param ctx the parse tree
	 */
	void exitLevel1(@NotNull MiniJavaParser.Level1Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementWhile}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(@NotNull MiniJavaParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementWhile}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(@NotNull MiniJavaParser.StatementWhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level3}.
	 * @param ctx the parse tree
	 */
	void enterLevel3(@NotNull MiniJavaParser.Level3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level3}.
	 * @param ctx the parse tree
	 */
	void exitLevel3(@NotNull MiniJavaParser.Level3Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMethodCall(@NotNull MiniJavaParser.ExpressionMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMethodCall(@NotNull MiniJavaParser.ExpressionMethodCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#procType}.
	 * @param ctx the parse tree
	 */
	void enterProcType(@NotNull MiniJavaParser.ProcTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#procType}.
	 * @param ctx the parse tree
	 */
	void exitProcType(@NotNull MiniJavaParser.ProcTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#level2}.
	 * @param ctx the parse tree
	 */
	void enterLevel2(@NotNull MiniJavaParser.Level2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#level2}.
	 * @param ctx the parse tree
	 */
	void exitLevel2(@NotNull MiniJavaParser.Level2Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionPreDecrement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPreDecrement(@NotNull MiniJavaParser.ExpressionPreDecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionPreDecrement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPreDecrement(@NotNull MiniJavaParser.ExpressionPreDecrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull MiniJavaParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementMethod}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethod(@NotNull MiniJavaParser.StatementMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementMethod}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethod(@NotNull MiniJavaParser.StatementMethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull MiniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull MiniJavaParser.MainClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#identifierIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierIdentifier(@NotNull MiniJavaParser.IdentifierIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#identifierIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierIdentifier(@NotNull MiniJavaParser.IdentifierIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionConstantFalse}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantFalse(@NotNull MiniJavaParser.ExpressionConstantFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionConstantFalse}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantFalse(@NotNull MiniJavaParser.ExpressionConstantFalseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void enterTypeBasic(@NotNull MiniJavaParser.TypeBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void exitTypeBasic(@NotNull MiniJavaParser.TypeBasicContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MiniJavaParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionPostIncrement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPostIncrement(@NotNull MiniJavaParser.ExpressionPostIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionPostIncrement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPostIncrement(@NotNull MiniJavaParser.ExpressionPostIncrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MiniJavaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionNewObject}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNewObject(@NotNull MiniJavaParser.ExpressionNewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionNewObject}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNewObject(@NotNull MiniJavaParser.ExpressionNewObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclarationAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationAssign(@NotNull MiniJavaParser.VarDeclarationAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclarationAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationAssign(@NotNull MiniJavaParser.VarDeclarationAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeVoid(@NotNull MiniJavaParser.TypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeVoid(@NotNull MiniJavaParser.TypeVoidContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MiniJavaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementFor}.
	 * @param ctx the parse tree
	 */
	void enterStatementFor(@NotNull MiniJavaParser.StatementForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementFor}.
	 * @param ctx the parse tree
	 */
	void exitStatementFor(@NotNull MiniJavaParser.StatementForContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionNewArray}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNewArray(@NotNull MiniJavaParser.ExpressionNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionNewArray}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNewArray(@NotNull MiniJavaParser.ExpressionNewArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(@NotNull MiniJavaParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(@NotNull MiniJavaParser.TypeArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#typeInt}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(@NotNull MiniJavaParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#typeInt}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(@NotNull MiniJavaParser.TypeIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementPlusEqual}.
	 * @param ctx the parse tree
	 */
	void enterStatementPlusEqual(@NotNull MiniJavaParser.StatementPlusEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementPlusEqual}.
	 * @param ctx the parse tree
	 */
	void exitStatementPlusEqual(@NotNull MiniJavaParser.StatementPlusEqualContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementTernary}.
	 * @param ctx the parse tree
	 */
	void enterStatementTernary(@NotNull MiniJavaParser.StatementTernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementTernary}.
	 * @param ctx the parse tree
	 */
	void exitStatementTernary(@NotNull MiniJavaParser.StatementTernaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionParentheses}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParentheses(@NotNull MiniJavaParser.ExpressionParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionParentheses}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParentheses(@NotNull MiniJavaParser.ExpressionParenthesesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementIncrement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIncrement(@NotNull MiniJavaParser.StatementIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementIncrement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIncrement(@NotNull MiniJavaParser.StatementIncrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull MiniJavaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull MiniJavaParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(@NotNull MiniJavaParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(@NotNull MiniJavaParser.StatementIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionPostDecrement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPostDecrement(@NotNull MiniJavaParser.ExpressionPostDecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionPostDecrement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPostDecrement(@NotNull MiniJavaParser.ExpressionPostDecrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expressionConstantTrue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantTrue(@NotNull MiniJavaParser.ExpressionConstantTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expressionConstantTrue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantTrue(@NotNull MiniJavaParser.ExpressionConstantTrueContext ctx);
}