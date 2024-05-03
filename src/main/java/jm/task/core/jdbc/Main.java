package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {

            UserService userService = new UserServiceImpl();

            userService.createUsersTable();

            userService.saveUser("Anna", "PostAnna", (byte) 11);
            userService.saveUser("Boris", "PostBoris", (byte) 22);
            userService.saveUser("Clara", "PostClara", (byte) 33);
            userService.saveUser("Demon", "PostDemon", (byte) 44);

            userService.removeUserById(1);
            userService.getAllUsers();
            userService.cleanUsersTable();
            userService.dropUsersTable();
        }

}
