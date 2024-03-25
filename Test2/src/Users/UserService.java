package Users;

import java.util.ArrayList;

public interface UserService {
    String createUser(String name, String username, String pass, String dob, String bio, String role, Double salary);

    boolean deleteUser(String username);

    Boolean checkUser(String username);

    Boolean checkUser(String username, String role);

    String signIn(String username, String pass);

    String getRole(String username);

    ArrayList<User> viewPeople();

    ArrayList<User> viewRoleUsers(String role);

}
