package model;

public abstract class AbstractOperation implements Operation{
	private int firstOperand;
	private int secondOperand;
	private OperationConstant operationType;
	
	public int getFirstOperand() {
		return firstOperand;
	}
	
	public void setFirstOperand(int firstOperand) {
		if (firstOperand >= 0) {
			this.firstOperand = firstOperand;
		}
	}
	
	public int getSecondOperand() {
		return secondOperand;
	}
	
	public void setSecondOperand(int secondOperand) {
		if (secondOperand >= 0) {
			this.secondOperand = secondOperand;
		}
	}
	
	public OperationConstant getOperationType() {
		return operationType;
	}
	
	public boolean isSameTypeOperation (AbstractOperation operation){
		return operation.getOperationType() == operationType;
	}
	
	public void setOperationType(OperationConstant operationType) {
		this.operationType = operationType;
	}
	
	
}
