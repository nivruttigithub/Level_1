//Write a Java program to create a class called "Employee" with instance variables 
//"name," "salary," and "ID." Include a method to calculate the employee's 
//yearly salary and a method to print the employee's name and salary.

//By Using Constructor

package level_1;

public class Employee {
	private String name;
	private int salary;
	private int id;

	public Employee(String name, int salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public void calculateEmpSalary() {
		double empSalary = salary * 12;
		System.out.println("Employee Yearly Salary is : " + empSalary);
	}

	public void printEmpDetails() {
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("ID : " + id);
	}

	public static void main(String args[]) {
		Employee emp = new Employee("Nivrutti", 450000, 101);
		emp.calculateEmpSalary();
		emp.printEmpDetails();
	}

}
