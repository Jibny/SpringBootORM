package top.shmly.enterprise.information.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.shmly.enterprise.information.model.User;
import top.shmly.enterprise.information.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("hello")
public class HelloController {
    @Autowired
    private UserService userService;


    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello springboot!";
    }


    @RequestMapping("/find/{id}")
    @ResponseBody
    public Map helloUser(@PathVariable("id") Long id) {
        Map map = new HashMap<String, User>();
        User user = userService.findUserById(id);
        map.put("username", user.getUsername());
        map.put("password", user.getPassword());
        return map;
    }

    @GetMapping("all")
    @ResponseBody
    public List<top.shmly.enterprise.information.entity.User> helloAll() {
        List<top.shmly.enterprise.information.entity.User> users = userService.findAll();
        return users;
    }

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("nishuodedui", "nishuodedui");
        return "index";
    }

    // http://localhost:8080/hello/create?username=user3&password=123456
    @GetMapping("create")
    @ResponseBody
    public List<top.shmly.enterprise.information.entity.User> createUser(String username, String password) {
        userService.createUser(username, password);
        List<top.shmly.enterprise.information.entity.User> users = userService.findAll();
        return users;

    }

}
