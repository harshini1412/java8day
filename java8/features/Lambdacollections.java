package io.java8.features;

import java.util.ArrayList;

public class Lambdacollections {

	public static void main(String[] args) {
		//CREATE THE COLLECTION LIST
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("violet");
		l1.add("Indigo");
		l1.add("Blue");
		l1.add("Green");
		l1.add("Yellow");
		l1.add("Red");
		l1.forEach((colors) -> System.out.println(colors));
		
		

	}

}
