package javaProgramingExercises;

import java.util.Arrays;

public class ArraySortAsc {

	public static void main(String[] args) {
		int[] array= {25,100, 125, 16, 68,80};
		Arrays.sort( array);

for(int i = 0; i<array.length; i++){
System.out.println("num = " + array[i]);
}
	}

}
