package javaProgramingExercises;

public class ConvertIntToString {

	public static void main(String[] args) {
		int i = 200;
		//compiler does it implicitly 
		//Integer l = Integer.valueOf(i); OR u can do it by directly assigning the value
		Integer a = i;// this is autoboxing
		String value = a.toString()+ "$";
		
		System.out.println(value);
			
		
	}	

	}

