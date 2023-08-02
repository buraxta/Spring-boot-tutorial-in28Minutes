package com.buarxta.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int count = 0;

    static {
        users.add(new User(++count, "ad", LocalDate.now().minusYears(2)));
        users.add(new User(++count, "ad2", LocalDate.now().minusYears(3)));
        users.add(new User(++count, "ad3", LocalDate.now().minusYears(4)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(++count);
        users.add(user);
        return user;
    }
}
