package FutureWebshop.TFoA.DTO;

import FutureWebshop.TFoA.Entities.UserRole;
import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class RegisterUserDTO {
    @NotNull
    public String username;
    @NotNull
    public String password;
    @NotNull
    public UserRole userRole;
}
