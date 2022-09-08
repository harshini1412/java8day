package io.java8.features.methodreferences;

import java.util.function.BiFunction;

@FunctionalInterface
interface MyInterface{
	//A Method --abstract method
	public void display();
}


//--> make reference to the abstract method and instance method-->
//method reference to an instance method of an object- object::instanceMethod


/*
 * method reference to static method of the classs
 */
class Addition{
	static int add(int numberOne, int numberTwo) {
		return numberOne+numberTwo;
	}
}


public class Student {
	
	public void myMethod() {
		System.out.println("Instance Method");
		System.out.println("--------I have been referenced by the abstact-----");
	}

	public static void main(String[] args) {
		//create an object to class-Student
		Student object=new Student();
		
		//method reference using the object of the class
		MyInterface ref=object::myMethod;
		
		//calling the method of functional interface
		ref.display();
		
		//create an object to class
		BiFunction<Integer,Integer,Integer> addition = Addition::add;
		int sum=addition.apply(11, 5);
		System.out.println("Addition of given number is:" +sum);
		

	}

}
