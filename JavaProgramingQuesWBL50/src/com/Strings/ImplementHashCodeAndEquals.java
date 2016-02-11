package com.Strings;

/*And equals method in Java must follow its contract with hashcode method in Java as stated below.

 1) If two objects are equal by equals() method then there hashcode must be same.

 2) If two objects are not equal by equals() method then there hashcode could be same or different.

 * 
 */
public class ImplementHashCodeAndEquals {

	public static void main(String[] args) {
		
		//String str = "Kirti Ranpise";
		ImplementHashCodeAndEquals eh = new ImplementHashCodeAndEquals("Kirti Ranpise");
		//ImplementHashCodeAndEquals eh1 = new ImplementHashCodeAndEquals("Kirti Ranpise");
				
				if(eh.equals(eh))
					System.out.println("The strings are equal");
				else
					System.out.println("The strings are not equal");
				
				System.out.println(eh.hashCode());
				
	}
	
private String data;
	
ImplementHashCodeAndEquals(String data)
	{
		this.data = data;
	}
	
	public boolean equals(Object obj)
	{
		
		if(this == obj)
			return true;
		if((obj == null) || (obj.getClass() != this.getClass()))
		{
			 System.out.println(obj.getClass().getName());
			 System.out.println(this.getClass().getName());
			 return false;
		}
		
		ImplementHashCodeAndEquals eqtest = (ImplementHashCodeAndEquals)obj;
		return(data == eqtest.data) || (data != null && data.equals(eqtest.data));
	}
		

	
	public int hashCode()
	{
		int hash = 7;
		hash = 31 * hash + (null == data ? 0 : data.hashCode());
		return hash;
	}
}

	