package com.tek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tek.Dao.LibraryDao;
import com.tek.beans.Library;

public class LibraryServiceImpl implements LibraryService {

	@Autowired
	LibraryDao librarydao;

	public Library getBook(String name) {
		return librarydao.getBook(name);
	}

	public List<Library> getAllBooks() {
		// TODO Auto-generated method stub
		return librarydao.getAllBooks();
	}

	public void delete(String name) {
		librarydao.delete(name);

	}

	public void save(Library person) {
		librarydao.save(person);

	}

}
