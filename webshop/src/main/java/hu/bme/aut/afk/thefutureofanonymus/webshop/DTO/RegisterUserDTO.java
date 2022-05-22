package hu.bme.aut.afk.thefutureofanonymus.webshop.DTO;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Entities.UserRoles;
import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class RegisterUserDTO {
    @NotNull
    public String username;
    @NotNull
    public String password;
    @NotNull
    public UserRoles userRole;
}
