package io.java8.features.methodreferences;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		//create a collection
		String[] stringArray= {
				"Sachin","Anil","Java","programming","Java8","Method","reference"
		};
		
		/*
		 * method references to an instance method of an arbitray 
		 */
		Arrays.sort(stringArray,String::compareToIgnoreCase);
		for(String data:stringArray) {
			System.out.println(data);
		}

	}

}
