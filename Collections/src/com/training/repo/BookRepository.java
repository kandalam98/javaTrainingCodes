package com.training.repo;

import java.util.*;


import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookRepository implements CrudRepository {

	private ArrayList<Book> bookList;
	
	public BookRepository() {
		super();
		this.bookList=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub

		return this.bookList.add(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public char[] get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
