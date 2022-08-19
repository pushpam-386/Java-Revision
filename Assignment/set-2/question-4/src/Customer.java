import java.io.Serializable;

public class Customer implements Serializable {
    private String username;
    private String password;
    private String mobileNumber;
    private String email;

    public Customer(String username, String password, String mobileNumber, String email) {
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
