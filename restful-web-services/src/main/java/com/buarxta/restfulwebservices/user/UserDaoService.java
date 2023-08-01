package com.buarxta.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "ad", LocalDate.now().minusYears(2)));
        users.add(new User(2, "ad2", LocalDate.now().minusYears(3)));
        users.add(new User(3, "ad3", LocalDate.now().minusYears(4)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }
}
