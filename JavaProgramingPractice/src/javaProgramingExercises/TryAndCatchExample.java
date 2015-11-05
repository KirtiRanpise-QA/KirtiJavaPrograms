package javaProgramingExercises;

public class TryAndCatchExample {

	public static void main(String[] args) {
		int num1, num2;
		try{
			//try block to handle code that may cause exception
			num1=0;
			num2= 13/num1;
			System.out.println(num2);
		}
		catch(ArithmeticException e){
			System.out.println("error: do not divide the num by zero");
			
		}
		
System.out.println(" I am out of try and catch block in java");
	}


}
