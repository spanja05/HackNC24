
public class User {

    private String name;
    private String phoneNumber;
    private String email;
    private boolean locationEnabled;

    public User(String name, String phoneNumber, String email, boolean locationEnabled) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.locationEnabled = locationEnabled;
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

    public void requestHelp() {
        System.out.println("Calling the cops right now");
    }

}
