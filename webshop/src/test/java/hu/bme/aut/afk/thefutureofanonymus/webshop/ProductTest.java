package hu.bme.aut.afk.thefutureofanonymus.webshop;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Controller.ProductController;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Controller.UserController;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.TankDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.User;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.UserRoles;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ProductTest {

    @Mock
    ProductController productController;

    private static final User useradmin = User.builder()
            .name("Test Tony")
            .password("tester")
            .role(UserRoles.ADMIN)
            .build();

    private static final User usercommoner = User.builder()
            .name("Test Thomas")
            .password("tester")
            .role(UserRoles.USER)
            .build();

    @Test
    void listProductsAsAdmin(){
        productController.listAllProducts();
    }

    @Test
    void listProductsAsUser(){
        Exception e = assertThrows(AuthenticationCredentialsNotFoundException.class, () -> {
            Integer.parseInt("1a");
        });

        String expectedMessage = " An Authentication object was not found";
        String actualMessage = e.getMessage();

        productController.listAllProducts();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
