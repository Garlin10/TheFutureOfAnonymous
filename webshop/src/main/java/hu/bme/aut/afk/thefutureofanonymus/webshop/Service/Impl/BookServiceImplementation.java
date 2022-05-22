package hu.bme.aut.afk.thefutureofanonymus.webshop.Service.Impl;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.BookDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data.BookRepository;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Book;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Service.BookService;

public class BookServiceImplementation implements BookService {

    private BookRepository bookRepository;

    @Override
    public void createBook(BookDTO bookDTO) {
        Book newBook = Book.builder()
                .title(bookDTO.title)
                .author(bookDTO.author)
                .price(bookDTO.price)
                .build();
        bookRepository.save(newBook);
    }
}
