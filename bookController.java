package com.ask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ask.entity.author;
import com.ask.service.bookService;

@RestController
public class bookController {
	@Autowired
	bookService service;
	
	@PostMapping("/sav")
	public String saveauthor(@RequestBody author a)
	{
	  return service.saveauthor(a);
	}
	
	@PutMapping("update/{id}")
	public String update(@PathVariable("id")int id, @RequestBody author a)
	{
		return service.update(id,a);
	}
}
