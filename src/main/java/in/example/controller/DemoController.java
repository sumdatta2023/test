package in.example.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class DemoController {

    @RequestMapping(method = GET, produces = "application/json", value = "/user")
    private User getUser() {
        User user = new User();
        user.setName("Test Name");
        return user;
    }
}
