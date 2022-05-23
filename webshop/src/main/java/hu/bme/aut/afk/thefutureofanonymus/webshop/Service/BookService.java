package hu.bme.aut.afk.thefutureofanonymus.webshop.Service;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.BookDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    void createBook(BookDTO bookDTO);
    List<Book> getBooks();
}
