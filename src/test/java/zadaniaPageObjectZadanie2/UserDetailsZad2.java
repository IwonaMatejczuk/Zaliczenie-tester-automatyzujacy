package zadaniaPageObjectZadanie2;

public class UserDetailsZad2 {
    private String firstName;
    private String lastName;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public UserDetailsZad2 setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDetailsZad2 setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDetailsZad2 setPassword(String password) {
        this.password = password;
        return this;
    }
}

