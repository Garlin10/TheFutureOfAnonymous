package hu.bme.aut.afk.thefutureofanonymus.webshop.Controller;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Product;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Service.BookService;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Service.SwordService;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Service.TankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    private TankService tankService;

    private SwordService swordService;
 
    private BookService bookService;

    @Secured("ADMIN")
    public void listAllProducts(){
       List<Product> products = new ArrayList<>();
       products.addAll(tankService.getTanks());
       products.addAll(swordService.getSwords());
       products.addAll(bookService.getBooks());

    }
}
