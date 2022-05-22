package hu.bme.aut.afk.thefutureofanonymus.webshop.Service.Impl;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.UserDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data.UserRepository;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.User;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void CreateUser(UserDTO userDTO) {
        User user = User
                .builder()
                .name(userDTO.getUsername())
                .password(encoder.encode(userDTO.getPassword()))
                .role(userDTO.getRole())
                .build();


        userRepository.save(user);

    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }
}
