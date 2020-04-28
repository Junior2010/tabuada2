package model;

import java.util.ArrayList;
import java.util.List;

public class Table {
	private List<Operation > operations = new ArrayList<Operation>();
	private OperationConstant tableType;
	private int tableOf;
	
	public Table() {
		super();
	}
	
	public Table(int tableOf)
	{
		if (tableOf >= 0 || tableOf <= 10)
		this.tableOf = tableOf;
	}
	
	public void addOperation(Operation operation) {
		operations.add(operation);
	}
	
	public void generateOperation() {
		
	}
	
	public boolean removeOperation(Operation operation) {
		return operations.remove(operation);
	}

}