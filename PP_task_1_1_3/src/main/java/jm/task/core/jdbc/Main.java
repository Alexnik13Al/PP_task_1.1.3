package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {

            Util.getConnection();
            UserDao userDao = new UserDaoJDBCImpl();

            userDao.createUsersTable();

            userDao.saveUser("Anna", "PostAnna", (byte) 11);
            userDao.saveUser("Boris", "PostBoris", (byte) 22);
            userDao.saveUser("Clara", "PostClara", (byte) 33);
            userDao.saveUser("Demon", "PostDemon", (byte) 44);

            userDao.removeUserById(1);
            userDao.getAllUsers();
            userDao.cleanUsersTable();
            userDao.dropUsersTable();
        }

}
