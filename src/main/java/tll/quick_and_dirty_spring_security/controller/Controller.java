package tll.quick_and_dirty_spring_security.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
    @GetMapping("user")
    public String getUser() {
        return "User access";
    }

    @GetMapping("admin")
    public String getAdmin() {
        return "Admin access";
    }
}
