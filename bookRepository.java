package com.ask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ask.entity.book;

@Repository
public interface bookRepository extends JpaRepository<book,Integer>{

}
