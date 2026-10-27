package com.internals.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.internals.bookshop.models.Book;

@Repository 
public interface BookRepo extends JpaRepository<Book, Integer> {
    
}
