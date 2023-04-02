//Prajwal P P CS2S3
class Employee{
	String name;
	int age;
	double phoneno;
	String address;
	long salary;
	void printDetails(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phoneno: " +phoneno);
		System.out.println("Address: " +address);
		System.out.println("Salary: " +salary);
	}
}

class Officer extends Employee{
	String specialization;
}

class Manager extends Employee{
	String department;
}

public class Inheritence{
	public static void main(String args[]){
	Officer o=new Officer();
	o.name="Elon Musk";
	o.age=49;
	o.phoneno=9898898;
	o.address="New York";
	o.salary=100000000;
	
	Manager m=new Manager();
	m.name="Bill Gates";
	m.age=60;
	m.phoneno=7077070;
	m.address="Los Angeles";
	m.salary=156000000;
	
	System.out.println("Officer details");
	o.printDetails();
	System.out.println("Manager details");
	m.printDetails();
	}
}


/*
Officer details
Name: Elon Musk
Age: 49
Phoneno: 9898898.0
Address: New York
Salary: 100000000
Manager details
Name: Bill Gates
Age: 60
Phoneno: 7077070.0
Address: Los Angel
*/
