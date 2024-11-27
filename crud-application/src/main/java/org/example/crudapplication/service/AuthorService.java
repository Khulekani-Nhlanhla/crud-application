package org.example.crudapplication.service;

import org.example.crudapplication.model.Author;
import org.example.crudapplication.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> findAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
