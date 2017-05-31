package com.tek.service;

import java.util.List;

import com.tek.beans.Library;

public interface LibraryService {
	public Library getBook(String name);

	public List<Library> getAllBooks();

	public void delete(String name);

	public void save(Library person);

}
