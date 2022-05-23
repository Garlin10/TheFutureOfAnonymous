package hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Product;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.User;

import java.util.ArrayList;

public class ShoppingCart {
    private User user;
    private ArrayList<Product> products = new ArrayList<>();
}
