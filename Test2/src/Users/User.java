package Users;

public class User {
    private final String username;
    private String name = "";
    private String pass = "";
    private String dob = "";
    private String bio = "";

    private String role = "";

    private Double salary = 0.0;

    User(String username, String role, Double salary) {

        this.username = username;
        this.role = role;
        this.salary = salary;

    }

    User(String username) {
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void set(Double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void print() {
        System.out.print("\n" + name + " | " + username + " | " + dob + " | " + bio + " | " + role + " | " + salary);
    }
}
