package services.impl;

import dao.IUserDAO;
import dao.impl.UserDAO;
import model.User;
import services.IUserService;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements IUserService {
    IUserDAO userDAO = new UserDAO();
    @Override
    public void insertUser(User user) {
        try {
            userDAO.insertUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User selectUser(int id) {
        return userDAO.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userDAO.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) {
        try {
            return userDAO.deleteUser(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateUser(User user) {
        try {
            return userDAO.updateUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> findUserByCountry(String country) {
        return userDAO.selectAllUsers().stream().filter(user -> user.getCountry().contains(country)).collect(Collectors.toList());
    }
}
