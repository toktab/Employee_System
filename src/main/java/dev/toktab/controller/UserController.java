package dev.toktab.controller;

import dev.toktab.model.User;
import dev.toktab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@Component
public class UserController {
    @Autowired
    private UserRepository userRepository;
//
//    @Query(value = "select a.id as student_id, a.name as student_name, b.id, b.rank from user a\n" +
//            "join type b on a.id = b.id;", nativeQuery = true)
//    Collection<User> findAllActiveUsersNative() {
//        return null;
//    }

//    @Query(value = "select a.id as student_id, a.name as student_name, b.id, b.rank from user a\n" +
//            "join type b on a.id = b.id;", nativeQuery = true)
    @GetMapping()
    public List<User> getAllUsers(){

        return userRepository.findAll();
    }
}
