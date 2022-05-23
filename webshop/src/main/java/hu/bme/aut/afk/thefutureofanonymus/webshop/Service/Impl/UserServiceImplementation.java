package hu.bme.aut.afk.thefutureofanonymus.webshop.Service.Impl;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.RegisterUserDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.UserDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data.UserRepository;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.User;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.transaction.Transactional;

public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;

    Logger logger = LoggerFactory.getLogger(UserServiceImplementation.class);


    @Override
    @Transactional
    public void CreateUser(RegisterUserDTO registerUserDTO) {
        User user = User
                .builder()
                .name(registerUserDTO.getUsername())
                .password(encoder.encode(registerUserDTO.getPassword()))
                .role(registerUserDTO.getUserRole())
                .build();


        userRepository.save(user);

        logger.info("user successfully created");

    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }
}
