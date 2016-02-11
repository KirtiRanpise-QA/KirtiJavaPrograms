package com.General;
//Write a program implementing explicit garbage collection.
public class GarbageCollector {

	public static void main(String[] args) {
		GcCollection obj = new GcCollection("Collected : ");	
//set the reference to null so that finalize()get called on this
		obj= null;
		
		//Run garbage collector explicitly, which in turn calls finalize() on the object
				System.gc();

	}
}
	
	
	class GcCollection{
	private String collect;
	public GcCollection(String collect){
		this.collect= collect;
	}
public GcCollection() {
		// TODO Auto-generated constructor stub
	}
@Override
public void finalize(){
	System.out.println(this.collect + " Its Done");
}	
}

