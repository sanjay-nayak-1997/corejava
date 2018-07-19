class Employee
{
	
	int eid;
	String name;
	String dept;
	Address add;
	double salary;
	
	Employee(int eid,String name,String dept,Address add,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.dept=dept;
		this.add=add;
		this.salary=salary;
	}
	
	public void printEmployeeDetails()
	{
		System.out.println("Employee id			:	" + eid);
		System.out.println("Employee Name			:	" + name);
		System.out.println("Department			:	" + dept);
		System.out.println("Salary				:	" + salary);
		add.printAddressDetails();
	}
		
}

class Address
{
	
	int flatNo;
	String apartmentName;
	String main;
	String cross;
	String city;
	long pincode;
	
	Address(int flatno,String apartmentName,String main,String cross,String city,long pincode)
	{
		this.flatNo=flatno;
		this.apartmentName=apartmentName;
		this.main=main;
		this.cross=cross;
		this.city=city;
		this.pincode=pincode;
	}
	
	public void printAddressDetails()
	{
		System.out.println("Flat No.			:	" + flatNo);
		System.out.println("Apartment Name			:	" + apartmentName);
		System.out.println("Main				:	" + main);
		System.out.println("Cross				:	" + cross);
		System.out.println("City				:	" + city);
		System.out.println("Pincode				:	" + pincode);
	}
	
}
public class HASADemo {

	public static void main(String[] args) {
		
		Address a=new Address(101,"Sanganikethan","7th main","4th cross","Bangalore",560004);
		
		Employee e=new Employee(1001,"Rathnakar","Accounts",a,36000.0);
		
		e.printEmployeeDetails();

	}

}
