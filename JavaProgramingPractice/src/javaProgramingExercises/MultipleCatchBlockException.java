package javaProgramingExercises;

public class MultipleCatchBlockException {

	public static void main(String[] args) {
		try{
			int[] a= new int [7];
			a[4]= 30/0;
			System.out.println("this is my try block");
		}
		catch(ArithmeticException e){
			System.out.println("Warning: Arithmetic exception ocuured");
			
		}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Warning: ArrayIndexOutOfBoundsException occured");
	
}

	
	catch(Exception e){
		
		System.out.println(" Some other exception occured");
		}
		
		System.out.println("Out of try and catch");
	}

}
