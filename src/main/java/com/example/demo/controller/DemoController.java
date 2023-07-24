package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(method = GET, produces = "application/json", value = "/users")
    private Map<Integer, User> getUsers() {
        return demoService.getUsers();
    }

    @RequestMapping(method = GET, produces = "application/json", value = "/users/{id}")
    private User getUser(@PathVariable(name = "id") Integer id) {
        return demoService.getUser(id);
    }
}
