package NajatJavaPOne;

//Using final keyword.
public class Admin {
	
	private final int ADMIN_ID=665;
	private final String ADMIN_NAME;
	public final static String EMAIL="najateez96@gmail.com";
	public final static String PASSWORD;
	private int phoneNumber;
	private String gender;
	
	
	{
		ADMIN_NAME="Najateez";
	}
	
	static{
		PASSWORD="najatalkhatri111";
	}


	// we comment some of properties in constructor because we already gave values of them. with use of final keyword.
	public Admin(int ADMIN_ID, String ADMIN_NAME, String EMAIL, String PASSWORD, final int phoneNumber, String gender ) {
	//	this.ADMIN_ID = ADMIN_ID;
	//	this.ADMIN_NAME = ADMIN_NAME;
	//	this.EMAIL = EMAIL;
	//	this.PASSWORD = PASSWORD;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}
	
	@Override
	final public String toString() {
		return "Admin [ADMIN_ID=" + ADMIN_ID + ", ADMIN_NAME=" + ADMIN_NAME + ", EMAIL=" + EMAIL + ", PASSWORD=" + PASSWORD + ", phoneNumber=" + phoneNumber
				+ ", gender=" + gender + "]";
	}


	public static void main(String[] args) {
		

	}

}
