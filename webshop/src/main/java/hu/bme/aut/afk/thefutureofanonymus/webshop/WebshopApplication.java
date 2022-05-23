package hu.bme.aut.afk.thefutureofanonymus.webshop;

import hu.bme.aut.afk.thefutureofanonymus.webshop.security.SecurityConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class WebshopApplication {

	Logger logger = LoggerFactory.getLogger(WebshopApplication.class);

	//Dependency-Injection
	@Autowired
	private SecurityConfig securityConfig;

	public static void main(String[] args) {
		SpringApplication.run(WebshopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
				System.out.println("\nThe Future of Anonymous Webshop\n");
				logger.info("The webshop is up and running - logger, cca just now");
		};
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("wtf\n");
		return String.format("Hello %s!", name);
	}

	/*@GetMapping("/user/registration")
	public String showRegistrationForm(WebRequest request, Model model) {
		UserDTO userDto = new UserDTO();
		model.addAttribute("user", userDto);
		return "registration";
	}*/

}
