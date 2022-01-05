package Homework.author.storage;

import Homework.author.model.User;
import Homework.author.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private Map<String, User> userMap = new HashMap<>();

    public void addUser(User user) {
        userMap.put(user.getEmail(), user);
        FileUtil.serializeUserMap(userMap);
    }

    public void print() {
        for (User value : userMap.values()) {
            System.out.println(value);
        }
    }

    public User getByEmail(String email) {
        return userMap.get(email);
    }

    public void initData() {
        Map<String, User> userMapFromFile = FileUtil.deserializeUserMap();
        if (userMapFromFile != null) {
            userMap = userMapFromFile;
        }
    }

}
