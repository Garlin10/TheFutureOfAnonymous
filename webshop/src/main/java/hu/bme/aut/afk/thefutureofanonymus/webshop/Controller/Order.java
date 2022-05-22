package hu.bme.aut.afk.thefutureofanonymus.webshop.Controller;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.ShoppingCart;
import hu.bme.aut.afk.thefutureofanonymus.webshop.WebshopApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Access;
@RestController
@RequestMapping("/shoppingcart")
public class Order {

    Logger logger = LoggerFactory.getLogger(Order.class);

    @PostMapping
    public void Order(@RequestBody ShoppingCart cart){
        logger.info("Order placed");
    }
}
