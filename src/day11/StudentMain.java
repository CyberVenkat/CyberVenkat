package day11;

public class StudentMain {

	public static void main(String[] args) {

		/*
		 * Students stu = new Students();
		 * 
		 * // Store data using object reference variable stu.sid = 101; stu.sname
		 * ="Akilan"; stu.grad = 'A'; stu.printstudentdata();
		 * 
		 * // Store data using method stu.setstudentdata(101, "Akilan", 'A');
		 * stu.printstudentdata();
		 */
		// Store data using constructor
		Students stu = new Students(101, "Amul", 'C');
		stu.printstudentdata();
	}

}
