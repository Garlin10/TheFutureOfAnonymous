package hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.UserRoles;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class RegisterUserDTO {
    @NotNull
    @NotEmpty
    public String username;
    @NotEmpty
    @NotNull
    public String password;
    @NotEmpty
    @NotNull
    public UserRoles userRole;

}
