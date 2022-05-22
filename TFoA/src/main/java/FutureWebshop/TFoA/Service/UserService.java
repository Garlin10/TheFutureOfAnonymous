package FutureWebshop.TFoA.Service;

import FutureWebshop.TFoA.DTO.RegisterUserDTO;
import FutureWebshop.TFoA.Entities.User;

public interface UserService {
    void createUser(RegisterUserDTO registerUserDTO);
    User getUser(String username);
}
