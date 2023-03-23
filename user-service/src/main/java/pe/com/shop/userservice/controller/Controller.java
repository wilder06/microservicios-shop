package pe.com.shop.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import pe.com.shop.userservice.model.User;
import pe.com.shop.userservice.service.UserService;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }
}
