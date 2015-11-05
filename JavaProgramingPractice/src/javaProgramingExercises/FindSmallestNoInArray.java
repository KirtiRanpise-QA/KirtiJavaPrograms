package javaProgramingExercises;

public class FindSmallestNoInArray {

	public static void main(String[] args) {
		int[] arr= {123,25,57,89,12,1000};
		int min= arr[0];
		for(int i= 0; i<arr.length; i++){
			if(min>arr[i]){
				min= arr[i];
				
			}
		}
System.out.println("minimum no. in given array is " + min);
	}

}
