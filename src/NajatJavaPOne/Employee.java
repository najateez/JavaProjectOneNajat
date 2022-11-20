package NajatJavaPOne;

//Using Relationships
public class Employee {
	
	private String id;
	private double salary;
	private PersonalInformation personalInfo; //Composition
	private Department dept; //Aggregation
	
    /*Composition-> if class Employee is destroyed also class PersonalInformation will be destroyed. Because of 
      Strong relationship. However , Aggregation Between class Employee and class Department, so if class Employee
      is destroyed, the class Department will not effect. Because of Weak Relationship.
     */
	public Employee(String id, double salary, String firstName, String middleName, String lastName, String gender,
			String dateOfBirth, Department dept) {
		this.id = id;
		this.salary = salary;
		this.personalInfo = new PersonalInformation(firstName, middleName, lastName, gender,dateOfBirth);
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", personalInfo=" + personalInfo.toString() + ", dept=" + ", deptNo=" + dept.getDeptNo() + ", deptName=" + dept.getDeptName() + "]";
	}

	public static void main(String[] args) {
		

	}

}
