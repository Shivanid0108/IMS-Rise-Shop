package Users;

import java.util.ArrayList;

public class UserServiceImplementation implements UserService {
    private final UserRepository user;

    public UserServiceImplementation(UserRepository user) {
        this.user = user;
    }

    @Override
    public String createUser(String name, String username, String pass, String dob, String bio, String role, Double salary) {
        User person = new User(username, role, salary);
        person.setName(name);
        person.setBio(bio);
        person.setDob(dob);
        person.setPass(pass);
        if (!user.save(person)) {
            return null;
        }
        return person.getUsername();
    }

    @Override
    public boolean deleteUser(String username) {
        return user.delete(username);
    }

    @Override
    public Boolean checkUser(String username) {
        return user.check(username);
    }

    @Override
    public Boolean checkUser(String username, String role) {
        return user.check(username, role);
    }

    @Override
    public String signIn(String username, String pass) {
        return user.signIn(username, pass);
    }

    @Override
    public String getRole(String username) {
        return user.getRole(username);
    }


    @Override
    public ArrayList<User> viewPeople() {
        return user.viewPeople();
    }

    @Override
    public ArrayList<User> viewRoleUsers(String role) {
        return user.viewRoleUsers(role);
    }

}
