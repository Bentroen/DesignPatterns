package interpreter;

public class Term extends AbstractExpression {

	private AbstractExpression term;
	private AbstractExpression constant;
	
	public Term(AbstractExpression constant) {
		super();
		this.constant = constant;
	}
	
	public Term(AbstractExpression term, AbstractExpression constant) {
		super();
		this.term = term;
		this.constant = constant;
	}
	
	@Override
	public int interpret() {
		if (term == null) {
			return constant.interpret();
		}
		return term.interpret() * constant.interpret();
	}

}
