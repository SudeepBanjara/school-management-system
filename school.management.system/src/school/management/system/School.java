package school.management.system;
import java.util.List;

public class School {
	private  List<Student> students;
	private List <Teacher> teachers;
	private static double totalMoneyEarn;
	private static double totalMoneySpent;
	
	public School(List<Student> students, List <Teacher> teachers) {
		this.students=students;
		this.teachers=teachers;
		this.totalMoneyEarn=0;
		this.totalMoneySpent=0;
				
		
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Student student) {
		students.add(student);
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeachers(Teacher teacher) {
		teachers.add(teacher); 
	}

	public double getTotalMoneyEarn() {
		return totalMoneyEarn;
	}

	public static void updateTotalMoneyEarn(double moneyEarn) {
		totalMoneyEarn  +=moneyEarn;
	}

	public double getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static void updateTotalMoneySpent(double moneySpent) {
		totalMoneyEarn -= moneySpent;
	}
	
	
	
		

}
