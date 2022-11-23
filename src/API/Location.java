package API;

public class Location {
	
	private String city;
	private String state;
	private String country;
	private int postCode;
	
	private Street street;
	private Coordinates coordinates;
	private TimeZone timezone;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public Coordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	public TimeZone getTimezone() {
		return timezone;
	}
	public void setTimezone(TimeZone timezone) {
		this.timezone = timezone;
	}


}
