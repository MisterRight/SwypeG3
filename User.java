/*
 * Swype
 */
package swypeg3;

/**
 *
 * @author AG
 */
public class User {

    private int UID;
    private String FirstName;
    private String LastName;
    private String UserName;
    private String city;
    private String phone;
    private String birthday;
    private String LastLogin;
    private String FirstLogin;

    public User() {
    }

    public User(int UID, String FirstName, String LastName, String UserName, String city, String phone, String birthday, String LastLogin, String FirstLogin) {
        this.UID = UID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UserName = UserName;
        this.city = city;
        this.phone = phone;
        this.birthday = birthday;
        this.LastLogin = LastLogin;
        this.FirstLogin = FirstLogin;

    }

    public int getUID() {
        return UID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getUserName() {
        return UserName;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getLastLogin() {
        return LastLogin;
    }

    public String getFirstLogin() {
        return FirstLogin;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setLastLogin(String LastLogin) {
        this.LastLogin = LastLogin;
    }

    public void setFirstLogin(String FirstLogin) {
        this.FirstLogin = FirstLogin;
    }

}
