package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

//        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 0);
        userService.saveUser("Ivan", "Ivanov", (byte) 4);
        userService.saveUser("Ivan", "Ivanov", (byte) 5);
        userService.saveUser("Ivan", "Ivanov", (byte) 6);
        List<User> users = userService.getAllUsers();


        for (User user : users) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }


}
