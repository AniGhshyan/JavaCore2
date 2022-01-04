package Homework.education.storage;

import Homework.education.exception.UserNotFoundException;
import Homework.education.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserStorage {
    private Map<String, User> users = new HashMap<>();

    public void addUser(String email, User user) {
        users.put(email, user);
    }

    public void print() {
        for (User value : users.values()) {
            System.out.println(value);
        }
    }

    public User getByEmail(String email) throws UserNotFoundException {
        for (User value : users.values()) {
            if (value.getEmail().equals(email)) {
                return value;
            }
        }
        throw new UserNotFoundException("User by " + email + " does not exists");
    }
}
