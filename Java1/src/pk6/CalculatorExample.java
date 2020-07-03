package pk6;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		int a=27,b=12;
		myCalc.powerOn();
		System.out.println(a + " + " + b +"= " + myCalc.plus(a, b));
		System.out.println(a + " / " + b +"= " + myCalc.divide(a, b));
		myCalc.powerOff();
		
		
	}
}
