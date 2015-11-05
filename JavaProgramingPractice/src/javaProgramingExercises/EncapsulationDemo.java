package javaProgramingExercises;

public class EncapsulationDemo {
	private int ssn;
	private String empName;
	private int empAge;
	
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	

	//Getter and setter methods
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpAge( 23);
		obj.setEmpName( "Maria");
		obj.setSsn( 12345);
		
		System.out.println("Employee is  "+ obj.getEmpName());
		System.out.println("Her age is "+ obj.getEmpAge());
		System.out.println("Her ssn is "+ obj.getSsn());
	}
}
	