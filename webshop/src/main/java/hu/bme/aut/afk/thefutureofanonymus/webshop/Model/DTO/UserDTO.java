package hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO;


import com.sun.istack.NotNull;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.UserRoles;
import lombok.Data;

@Data
public class UserDTO {

	@NotNull
	private String username;

	@NotNull
	private String password;

	@NotNull
	private UserRoles role;
}
