package com.tek.beans;

public class Library {
	String book;
	String author;
	String year;
	int quantity;
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Library(String book, String author, String year, int quantity) {
		super();
		this.book = book;
		this.author = author;
		this.year = year;
		this.quantity = quantity;
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
