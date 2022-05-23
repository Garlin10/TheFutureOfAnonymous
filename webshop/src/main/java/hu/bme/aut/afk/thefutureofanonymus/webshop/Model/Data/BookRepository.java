package hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
    Book findBookByTitle(String title);
}
