
package com.example;

public class UserService {
    private UserDao userDao;

    // Constructor to inject the UserDao dependency
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    // Method to get a user by its ID using UserDao
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}