package com.boots.repository;


import com.boots.entity.Book;
import com.boots.entity.Role;
import com.boots.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface BookRepository extends JpaRepository<Book, Long> {
//    Book findByUsername(String id);
//    @Modifying
//    @Query("update Book b set " +
//            "b.name = :name, " +
//            "b.gave = :gave, " +
//            "b.publishing = :publishing, " +
//            "b.returned = :returned, " +
//            "b.student = :student " +
//            "where b.id = :id")
//    void updateBook(
//            @Param(value = "id") long id,
//            @Param(value = "name") String name,
//            @Param(value = "publishing") String publishing,
//            @Param(value = "student") String student,
//            @Param(value = "gave") Date gave,
//            @Param(value = "returned") Date returned);
}
