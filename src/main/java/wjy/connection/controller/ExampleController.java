package wjy.connection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import wjy.connection.model.Awake;
import wjy.connection.service.UserService;

/**
 * @Author: blue.wjy@gmail.com
 * @Date: 2022/11/15 13:30
 */
@Controller
public class ExampleController {

    @Autowired
    private UserService userService;

    @GetMapping("/addAndGet")
    public void addAndGet() {
        userService.addAndGet();
    }

    @GetMapping("/addRmg")
    public void addRmg() {
        userService.addRmg();
    }

    @GetMapping("/control")
    public void control() {
        userService.control();
    }


    @PostMapping
    public void addAwake(Awake awake) {
        userService.addAwake(awake);
    }

}
