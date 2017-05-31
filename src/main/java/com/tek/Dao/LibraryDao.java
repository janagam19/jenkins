package com.tek.Dao;

import java.util.List;

import com.tek.beans.Library;

public interface LibraryDao {
	
	public Library getBook(String name);

	public List<Library> getAllBooks();

	public void delete(String name);

	public void save(Library person);
}
