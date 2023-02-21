package com.boots.service;

import com.boots.entity.Book;
import com.boots.entity.Role;
import com.boots.entity.User;
import com.boots.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public HttpStatus Save(Book book) {
        bookRepository.save(book);
        return HttpStatus.OK;
    }

    public HttpStatus Delete(Long bookId) {
        if (bookRepository.findById(bookId).isPresent()) {
            bookRepository.deleteById(bookId);
            return HttpStatus.OK;
        }
        return HttpStatus.BAD_REQUEST;
    }

//    public HttpStatus Update(Book book) {
//        if (bookRepository.findById(book.getId()).isPresent()) {
//            bookRepository.updateBook(
//                    book.getId(),
//                    book.getName(),
//                    book.getPublishing(),
//                    book.getStudent(),
//                    book.getGave(),
//                    book.getReturned());
//            return HttpStatus.OK;
//        }
//        return HttpStatus.BAD_REQUEST;
//    }
}
