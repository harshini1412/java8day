package io.java8.examples;



interface Myfunction1 {
	//A method with single parameter    
	public int incrementByFive(int number);
}
@FunctionalInterface
interface addition{


// A METHOD WITH MULTIPLE PARAMETER      
	public int addition(int num,int numb);}


interface subtraction{


// A METHOD WITH MULTIPLE PARAMETER          
	 public int subtraction(int num,int numb);
	 }
interface multiplication{


// A METHOD WITH MULTIPLE PARAMETER          
 public int multiplication(int num,int numb);
 }
interface divide{


 // A METHOD WITH MULTIPLE PARAMETER          
	 public int divide(int num,int numb);
	 }


public class Myfunction1 {

public static void main(String[] args) { //lambda expression with single parameter number        
	Myfunction1 f=(number)->number+5;
	System.out.println(f.incrementByFive(23));
	addition addition=(num, numb)-> num+numb;
	System.out.println(addition.addition(2,2));
	subtraction subtraction=(num, numb)-> num-numb;
	System.out.println(subtraction.subtraction(2,2));
     multiplication multiplication=(num, numb)-> num*numb;
     System.out.println(multiplication.multiplication(2,2));  
     divide divide=(num, numb)-> num/numb;
     System.out.println(divide.divide(2,2));


}


}


//public class Myfunction {

	//public static void main(String[] args) {
		
//	}

//}
