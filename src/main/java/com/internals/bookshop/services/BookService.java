package com.internals.bookshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internals.bookshop.models.Book;
import com.internals.bookshop.repository.BookRepo;

@Service 
public class BookService {
    
    @Autowired 
    BookRepo repo;

    public List<Book> getBooks() {
        return repo.findAll();
    }

    public Book  getBookById (int bookId) {
        return repo.getReferenceById(bookId);
    }

    public void createBook (Book book) {
        repo.save(book);
    }

    public void updateBook(Book book) {
        repo.save(book);
    }

    public void deleteBookById(int bookId) {
        repo.deleteById(bookId);
    }

}
