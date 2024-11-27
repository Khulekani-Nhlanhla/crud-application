package org.example.crudapplication.service;

import org.example.crudapplication.model.Author;
import org.example.crudapplication.model.Book;
import org.example.crudapplication.repository.AuthorRepository;
import org.example.crudapplication.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BooksRepository booksRepository;

    public Book saveBook(Book book) {
        return booksRepository.save(book);
    }

    public Optional<Book> findBookById(Long id) {
        return booksRepository.findById(id);
    }

    public void deleteBook(Long id) {
        booksRepository.deleteById(id);
    }
}

/*@Service
public class BookService {
    @Autowired
    private BooksRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);

    }

    public Book getBook(long bookid){
        return bookRepository.findById(bookid).orElseThrow(()-> new RuntimeException("Not Found"));
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Book updateBook(long bookid, Book book) {
        Book existingBook = bookRepository.findById(bookid).orElseThrow(() -> new RuntimeException("NOT FOUND"));
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setISBN(book.getISBN());
        bookRepository.save(existingBook);
        return existingBook;

    }

    public Book deleteBook(long bookid) {
        Book existingBook = bookRepository.findById(bookid)
        return existingBook;
    }

    public List<Book> getBooksByTitle(String bookTitle) {
        return bookRepository.getBookByTitle(bookTitle);
    }

}*/
