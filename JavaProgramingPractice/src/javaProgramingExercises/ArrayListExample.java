package javaProgramingExercises;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <String> alist = new ArrayList <String>();//<String>= generic
alist.add( "kirti");
alist.add("ranpise");
alist.add( "100");
alist.add("abhi");
	
//for each loop
for (String s: alist){
	//for boolean type ://for(Boolean a : alist){  }
	//for each automatically iterate till last element and all come to 's'
	System.out.println(s);
	//break: is used to exit out of for loop
	
	if(s.equals("100"))
			{
		break;//"abhi" wont get printed here
		
	
	}
}
//iterator interface: allows you to access all the elements. a way to retrive elements from list
//it has methods like hasNext() and next()
Iterator<String> it= alist.iterator();
while (it.hasNext()){
	System.out.println(it.next());
}
}
}
