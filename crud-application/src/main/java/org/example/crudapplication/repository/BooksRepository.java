package org.example.crudapplication.repository;

import org.example.crudapplication.model.Author;
import org.example.crudapplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {

}
