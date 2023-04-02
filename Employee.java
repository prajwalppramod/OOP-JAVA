public class Employee {
    String name;
    int age;
    double phoneno;
    String address;
    int salary;
    void printSalary(){
        System.out.println(salary);
    }
}

public class Officer extends Employee{
String specialization;
}

public class Manager extends Employee{
    String department;
}
public class Inheri{
    public static void main(String args[])
    {
        Officer e=new Officer();
        e.name="Prajwal";
        e.age=20;
        e.phoneno=1234567890;
        e.address="Pranavam";
        e.salary=1200000;
        e.specialization="UIUX";
        Manager m=new Manager();
        m.name="Baven";
        m.age=19;
        m.phoneno=1234567890;
        m.address="Vettukalel";
        m.salary=1200000;
        m.department="Marketing";
        m.printSalary();
        e.printSalary();
    }
}