package hu.bme.aut.afk.thefutureofanonymus.webshop.Service;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.BookDTO;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    void createBook(BookDTO bookDTO);
}
