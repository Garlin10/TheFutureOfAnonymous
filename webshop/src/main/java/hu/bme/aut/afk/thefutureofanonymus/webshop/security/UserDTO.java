package hu.bme.aut.afk.thefutureofanonymus.webshop.security;


import com.sun.istack.NotNull;

public class UserDTO {
	@NotNull
	private String firstName;

	@NotNull
	private String lastName;

	@NotNull
	private String password;
	private String matchingPassword;

	@NotNull
	private String email;
}
