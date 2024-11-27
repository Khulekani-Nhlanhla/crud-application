package org.example.crudapplication.repository;

import org.example.crudapplication.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
