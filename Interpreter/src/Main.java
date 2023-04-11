import interpreter.AbstractExpression;
import interpreter.Const;
import interpreter.Expression;
import interpreter.Term;

public class Main {

	public static void main(String[] args) {
	
	/*
	 * Assuming there is a parser to build the language's AST
	 *
	 * Example:
	 * 10 + 20 * 30
	 *
	 * <expr> + <term>
	 * <term>   <term> * const
	 * const     const     30
	 *   10        20
	 */
	
	Const c10 = new Const(10);
	Const c20 = new Const(20);
	Const c30 = new Const(30);
	
	Term t10 = new Term(c10);
	Term t20 = new Term(c20);
	
	Term tt20c30 = new Term(t20, c30);
	Expression e10 = new Expression(t10);
	
	AbstractExpression e = new Expression(e10, tt20c30);
	System.out.println(e.interpret());
	
	}
	
}
