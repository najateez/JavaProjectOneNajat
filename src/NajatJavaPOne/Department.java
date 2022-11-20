package NajatJavaPOne;

//Using Relationship (this class with Employee):-
//Aggregation
public class Department {
	
	private int deptNo;
	private String deptName;

	
	public Department(int deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}
	
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public static void main(String[] args) {
		

	}

}
