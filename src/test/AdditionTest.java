package test;

import model.Addition;
import model.Operation;

public class AdditionTest {
	public static void main(String[] args) {
		Addition ad = new Addition();
		ad.setFirstOperand(3);
		ad.setSecondOperand(5);
		System.out.println(ad.calculate());
	}
}
