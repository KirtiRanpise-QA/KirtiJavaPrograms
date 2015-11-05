package javaProgramingExercises;

public class ReverseString {

	public static void main(String[] args) {
		String s= "Abhi";
		
		
		for( int i = s.length()-1;i>=0;i--){
			
			System.out.print(s.charAt( i));
		}

	}

}
