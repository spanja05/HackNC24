/**
 * 
 */

/**
 * 
 */
public class User {
	
	private String name;
	private String phoneNumber;
	private String email;
	private boolean locationEnabled;
	private String foodOption;
	private String location;
	private boolean isVolunteer;
	
	public User(String name, String phoneNumber, String email, boolean locationEnabled, String foodOption, String location, boolean isVolunteer) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setLocationEnabled(locationEnabled);
        setFoodOption(foodOption);
        setLocation(location);
        setVolunteer(isVolunteer);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the locationEnabled
	 */
	public boolean isLocationEnabled() {
		return locationEnabled;
	}

	/**
	 * @param locationEnabled the locationEnabled to set
	 */
	public void setLocationEnabled(boolean locationEnabled) {
		this.locationEnabled = locationEnabled;
	}

	/**
	 * @return the foodOption
	 */
	public String getFoodOption() {
		return foodOption;
	}

	/**
	 * @param foodOption the foodOption to set
	 */
	public void setFoodOption(String foodOption) {
		this.foodOption = foodOption;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the isVolunteer
	 */
	public boolean isVolunteer() {
		return isVolunteer;
	}

	/**
	 * @param isVolunteer the isVolunteer to set
	 */
	public void setVolunteer(boolean isVolunteer) {
		this.isVolunteer = isVolunteer;
	}
	
	public void callForHelp() {
		System.out.println("Calling the cops right now");
	}

	

}