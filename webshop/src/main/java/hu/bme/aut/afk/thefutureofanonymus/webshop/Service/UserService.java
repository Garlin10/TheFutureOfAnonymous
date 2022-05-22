package hu.bme.aut.afk.thefutureofanonymus.webshop.Service;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.UserDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.User;

public interface UserService {
    void CreateUser(UserDTO userDTO);
    User getUser(String username);
}
