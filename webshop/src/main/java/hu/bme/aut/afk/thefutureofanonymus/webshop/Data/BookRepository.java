package hu.bme.aut.afk.thefutureofanonymus.webshop.Data;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
    Book findBookByTitle(String title);
}
