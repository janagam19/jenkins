package com.tek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tek.beans.Library;
import com.tek.service.LibraryService;


@RestController
public class Controller {
	
	@Autowired
	LibraryService libService;
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public ResponseEntity<Library> get(@PathVariable("name") String name) {
		Library lib = libService.getBook(name);
		return new ResponseEntity<Library>(lib, HttpStatus.OK);

	}

	@RequestMapping(value = "/authorname/{author}", method = RequestMethod.GET)
	public ResponseEntity<Library> getByAuthor(@PathVariable("author") String author) {
		return new ResponseEntity<Library>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Library> getAll() {
		return libService.getAllBooks();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Library> save(@RequestBody Library library) {
		libService.save(library);
		return new ResponseEntity<Library>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
	public ResponseEntity<Library> delete(@PathVariable("name") String name) {

		Library p = libService.getBook(name);
		if (p != null) {
			libService.delete(name);
			return new ResponseEntity<Library>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Library>(HttpStatus.NOT_FOUND);
		}

	}

 
	}
	

