package API;

//The main class of Results.java json is = class JsonToJavaObject.java
public class Results {
	
	private String gender;
	private String email;
	private String phone;
	private String cell;
	private String nat;
	
	private Name name;
	private Location location;
	private Login login;
	private DOB dob;
	private Registered registered;
	private Id id;
	private Picture pics;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getNat() {
		return nat;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public DOB getDob() {
		return dob;
	}
	public void setDob(DOB dob) {
		this.dob = dob;
	}
	public Registered getRegistered() {
		return registered;
	}
	public void setRegistered(Registered registered) {
		this.registered = registered;
	}
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	public Picture getPics() {
		return pics;
	}
	public void setPics(Picture pics) {
		this.pics = pics;
	}
}