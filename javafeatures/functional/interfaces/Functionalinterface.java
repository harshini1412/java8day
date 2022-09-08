package com.bct.javafeatures.functional.interfaces;

import java.util.function.IntBinaryOperator;

//creating our own functional interface
interface MyfunctionInterface{
	
	//single abstract method
	public int addMethod(int a, int b);
}

public class Functionalinterface {

	public static void main(String[] args) {
		
		//Lambda Operation
		MyfunctionInterface sum=(a,b) -> a+b;
		System.out.println("Result = "+ sum.addMethod(12,100));
		
		//predefined function interface
		//lambda expression
		System.out.println("----Printed by the predefined interface----");
		IntBinaryOperator add=(a,b) -> a+b;
		System.out.println("Result = "+ add.applyAsInt(12,100));
		

	}

}
