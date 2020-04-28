package model;

public class Addition extends AbstractOperation{

	@Override
	public int calculate() {
		return getFirstOperand() + getSecondOperand();
	}

}
