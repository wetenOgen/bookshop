package com.internals.bookshop.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.internals.bookshop.models.Book;
import com.internals.bookshop.services.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController 
@RequestMapping("/books")
@CrossOrigin 
public class BookController {
    
    @Autowired 
    BookService service;

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return service.getBooks();
    }

    @GetMapping("/{bookId}")
    public Book getByBookId(@PathVariable int bookId) {
        return service.getBookById(bookId);
    }

    @PostMapping("/create")
    public void  createBook(@RequestBody Book book) { 
        service.createBook(book);;
    }

    @PutMapping("/update/{bookId}")
    public void updateBook( @RequestBody Book book) {
        service.updateBook(book);
    }
    
    @DeleteMapping("/{bookId}")
    public void deleteById(@PathVariable int bookId){
        service.deleteBookById(bookId);
    }
}
