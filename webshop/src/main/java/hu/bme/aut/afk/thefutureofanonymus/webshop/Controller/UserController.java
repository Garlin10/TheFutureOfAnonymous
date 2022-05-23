package hu.bme.aut.afk.thefutureofanonymus.webshop.Controller;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.RegisterUserDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/login")
    public String loginUser(){
        return "ALF LOGIN";
    }

    @PostMapping("/register")
    public void registerUser(@RequestBody RegisterUserDTO registerUserDTO) {
        userService.CreateUser(registerUserDTO);
    }
}
