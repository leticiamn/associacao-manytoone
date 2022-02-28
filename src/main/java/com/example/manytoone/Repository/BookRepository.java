package com.example.manytoone.Repository;

import com.example.manytoone.Model.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
