package javaProgramingExercises;

public class FindLargestInArray {

	public static void main(String[] args) {
		int[] a= {88,33,55,566,23,64,123};
		int max= a[0];
		for (int i = 0; i<a.length; i++){
			if (max<a[i]){
				 max= a[i];
				 
			}
			 
		}
System.out.println("maximum no. in given array is " +max);
	}

}
