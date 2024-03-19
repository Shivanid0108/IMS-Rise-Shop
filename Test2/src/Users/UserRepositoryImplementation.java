package Users;

import Utils.DatabaseUtils;
import java.sql.*;
import java.util.ArrayList;

public class UserRepositoryImplementation implements UserRepository {
    private static final String insert_user = "INSERT into users" + "(name,username,password,dob,bio) VALUES" + " (?,?,?,?,?);";
    private static final String view_all_users = "Select username from users;";
    private static final String delete_user = "DELETE from users WHERE username=\"%s\";";
    private static final String check_user = "Select username from users where username=\"%s\";";
    private static final String signing_user = "Select password from users where username=\"%s\";";
    private static final String view_role = "Select role from users where username=\"%s\";";
    private static final String view_users = "SELECT username,name,dob,bio from users;";
    private static final Connection connection = DatabaseUtils.getConnection();

    public UserRepositoryImplementation() throws SQLException {
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS users(name text,username text PRIMARY KEY NOT NULL,password text,dob text,bio text,created DATETIME DEFAULT CURRENT_TIMESTAMP,role TEXT,salary REAL);");
    }

    @Override
    public boolean save(User person) {
        try (PreparedStatement pst = connection.prepareStatement(insert_user)) {
            pst.setString(1, person.getName());
            pst.setString(2, person.getUsername());
            pst.setString(3, person.getPass());
            pst.setString(4, person.getDob());
            pst.setString(5, person.getBio());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.print("\n3 " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(String username) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(delete_user, username));
            return true;
        } catch (SQLException e) {
            System.out.print("\n5 " + e.getMessage());
        }
        return false;
    }

    @Override
    public String signIn(String username, String pass) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(signing_user, username));
            if (rs.next()) {
                if (rs.getString("password").equals(pass)) {
                    return username;
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            System.out.print("\n4 " + e.getMessage());
        }
        return null;
    }

    @Override
    public String getRole(String username) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(view_role, username));
            if (rs.next()) {
                return rs.getString("role");
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.print("\n4 " + e.getMessage());
        }
        return null;
    }
    @Override
    public Boolean check(String username) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(check_user, username));
            if (rs.next() && rs.getString("username").equals(username)) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print("\n6 " + e.getMessage());
        }
        return false;
    }
    @Override
    public ArrayList<User> viewPeople() {
        ArrayList<User> users = new ArrayList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(view_users);
            while (rs.next()) {
                User user = new User(rs.getString("username"));
                user.setName(rs.getString("name"));
                user.setDob(rs.getString("dob"));
                user.setBio(rs.getString("bio"));
                users.add(user);
            }
            return users;
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

}
