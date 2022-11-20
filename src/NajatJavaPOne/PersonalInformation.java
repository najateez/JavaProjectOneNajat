package NajatJavaPOne;

//Using Relationship (this class with Employee):- 
//Composition
public class PersonalInformation {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	

	public PersonalInformation(String firstName, String middleName, String lastName, String gender,String dateOfBirth) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "PersonalInformation [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + "]";
	}

	
	
	
	public static void main(String[] args) {
		

	}

}
