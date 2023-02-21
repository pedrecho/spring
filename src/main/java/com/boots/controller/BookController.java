package com.boots.controller;


import com.boots.entity.Book;
import com.boots.repository.BookRepository;
import com.boots.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    private final BookRepository book;

    BookController(BookRepository book) {
        this.book = book;
    }

    @GetMapping(path = "/book/{id}")
    public @ResponseBody Optional<Book> GetById(@PathVariable(name = "id") Long id) {
        return this.book.findById(id);
    }

    @GetMapping(path = "/book")
    public @ResponseBody List<Book> GetAll() {
        return this.book.findAll();
    }

    @PostMapping(path = "/book")
    public HttpStatus Save(Book book) {
        return bookService.Save(book);
    }

    @DeleteMapping(path = "/book")
    public HttpStatus Delete(Book book) {
        return bookService.Delete(book.getId());
    }

//    @PutMapping(path = "/book")
//    public HttpStatus Update(Book book) {
//        return bookService.Update(book);
//    }
}
