package day10;

public class Employee {

	// Variables
	int eid;
	String ename;
	String job;
	int sal;

	// Methods
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename = "John";
		emp1.job = "Manager";
		emp1.sal = 50000;
		emp1.display();

		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.ename = "Venkat";
		emp2.job = "Tester";
		emp2.sal = 20000;
		emp2.display();

	}

}
