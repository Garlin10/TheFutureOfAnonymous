package hu.bme.aut.afk.thefutureofanonymus.webshop.DTO;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class BookDTO {
    @NotNull
    public String title;
    public String author;
    public Integer price;
}
