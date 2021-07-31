package school.management.system;
/**
 * student will have
 * id
 * name
 * fee paid
 * total fee
 **/

public class Student {
	private int id;
	private String name;
	private int grade;
	private double fee_paid;
	private double fee_total;
	
	
	public Student (int id, String name, int grade) {
		this.id = id;
		this.name= name;
		this.grade =grade;
		this.fee_paid=0;
		this.fee_total=2000;
		
	}

	public void set_grade (int grade) {
		this.grade= grade;
		
	}
	
	public void payfee(double fee_paid) {
		this.fee_paid+=fee_paid;
		School.updateTotalMoneyEarn(fee_paid);
		
		
	}
	
	public int get_id() {
		return id;
	}
	
	public String get_name() {
		return name;
	}
	
	public int get_grade() {
		return grade;
	}
	
	
	public double getfee_paid() {
		return fee_paid;
	}
	
	public double getfee_total() {
		return fee_total;
	}
	
	public double getRemainingFee( ) {
		return fee_total-fee_paid;
	
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of the student is " + name +
				"  total fee paid to School is $" + fee_paid;
	}
	
	
	
}
