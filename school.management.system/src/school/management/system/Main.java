package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	public static void main (String[] args) {
		//try {
		Teacher teacher1 = new Teacher (1, "sudeep", 6000);
		
		Teacher teacher2 = new Teacher (2, "surendta", 4000);
		Teacher teacher3 = new Teacher (3, "sushma", 4200);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		teacherList.add(teacher3);
		
		//System.out.println("the list of teacher" + teacherList);
		//}
//		catch (Expression e) {
//			
//		}
		
		
		
		
		Student student1= new Student (1, "sam", 5);
		Student student2= new Student (2, "saram", 6);
		Student student3= new Student (3, "radha", 4);
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		
		School gmbs= new School(studentList, teacherList);
		Teacher teacher4 = new Teacher(4, "hari", 500);
		gmbs.addTeachers(teacher4);
				
		
		student1.payfee(5000);
		student2.payfee(6000);
		teacher1.receiveSalary(teacher1.get_salary());
		teacher2.receiveSalary(teacher2.get_salary());
		
		System.out.println("the name of the teacher who get salary is :"+teacher1.get_name()+" total money gmbs have  " + gmbs.getTotalMoneyEarn());
		
		System.out.println(student1);
		System.out.println(teacher4);
		
				
		
	}

}
