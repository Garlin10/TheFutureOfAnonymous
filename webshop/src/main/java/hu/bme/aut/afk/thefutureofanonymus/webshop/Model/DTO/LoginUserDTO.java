package hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginUserDTO {

    public String username;
    public String password;

}
