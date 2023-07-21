class Member 
{
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private int salary;

    Member(String name,int age,String phoneNumber,String address,int salary) 
	{
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() 
	{
        System.out.println("Salary " + salary);
    }
}

class Employee extends Member 
{
    String specialization;

    Employee(String name,int age,String phoneNumber,String address,int salary,String specialization) 
	{
		super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member
{
    String department;

    Manager(String name,int age,String phoneNumber,String address,int salary,String department)
    {
		super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

class java5 
{
    public static void main(String args[]) 
	{
        Employee employee = new Employee("hgdfyhg", 18, "1234567890", "fdg",500, "IT");
        Manager manager = new Manager("hjgf", 26, "9876543210", "hgch",1000, "IT");
        employee.printSalary();
        manager.printSalary();
    }
}