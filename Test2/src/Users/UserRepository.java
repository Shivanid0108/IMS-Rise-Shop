package Users;

import java.util.ArrayList;

public interface UserRepository {
    boolean save(User a);

    boolean delete(String username);

    String signIn(String username, String pass);

    String getRole(String username);

    Boolean check(String username);

    ArrayList<User> viewPeople();
}
