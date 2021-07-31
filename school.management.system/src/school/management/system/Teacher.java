 package school.management.system;

public class Teacher {
	private int id;
	private String name;
	private double salary;
	private double salaryEarned;
	
	public Teacher(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned= 0;
	}
		

	
	public void set_salary (double salary) {
		this.salary = salary;
		
	}
	
	public int get_id() {
		return id;
	}
	
	public String get_name() {
		return name;
	}
	
	public double get_salary() {
		return salary;
	}
	
	public void receiveSalary (double salary) {
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "the teache name is " + name + 
				"the total salaray received is " + salaryEarned;
	}
	
	

}
