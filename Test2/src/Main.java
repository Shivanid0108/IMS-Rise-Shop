import Users.UserRepositoryImplementation;
import Users.UserService;
import Users.UserServiceFactory;
import Utils.PrintUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            UserService userService = UserServiceFactory.getUserService(new UserRepositoryImplementation());
//            PostService postService = PostServiceFactory.getPostService(new PostRepositoryImpl());
//            GroupService groupService = GroupServiceFactory.getGroupService(new GroupRepositoryImpl());
//            MessageService messageService = MessageServiceFactory.getMessageService(new MessagerepositoryImpl());
            App app = new App(userService);//, postService, groupService, messageService);
            PrintUtil.welcomeText();
            app.start();
        } catch (SQLException e) {
            System.out.print("\nInitialisation error");
            e.printStackTrace();
        }
    }
}