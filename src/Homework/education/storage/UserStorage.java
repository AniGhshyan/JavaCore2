package Homework.education.storage;

import Homework.education.model.User;

public class UserStorage {
    private User[] users = new User[10];
    private int size = 0;

    public void addUser(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        tmp = users;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public User getByPassword(String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getPassword().equals(password))
                return users[i];
        }
        return null;
    }

    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }
}
