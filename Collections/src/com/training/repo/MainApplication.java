package com.training.repo;
import java.util.*;
import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.utils.AuthorNameComparator;
import com.training.utils.BookNameComparator;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(1,"abc","ramesh",99);
		Book b2=new Book(2,"ab","suresh",199);
		Book b3=new Book(3,"abcd","kamesh",299);
		Book b4=new Book(4,"abcde","bramesh",399);
		CrudRepository respo=new BookRepository();
		respo.add(b1);
		respo.add(b4);
		respo.add(b3);
		respo.add(b2);
		List<Book> bookList=respo.findAll();
		
		for(Book eachbook : bookList) {
			System.out.println(eachbook);		
		}
		Collections.sort(bookList);
		for(Book eachbook : bookList) {
			System.out.println(eachbook);		
		}
		Collections.sort(bookList,new BookNameComparator());
		System.out.println("Comparing by name");
		for(Book eachbook : bookList) {
			System.out.println(eachbook);		
		}
		
		Collections.sort(bookList,new AuthorNameComparator());
		System.out.println("Comparing by author");
		for(Book eachbook : bookList) {
			System.out.println(eachbook);		
		}
//		bookList.set(1,b2);
//		System.out.println(bookList.size());
//		System.out.println(bookList.get(1)+ "," + bookList.get(1));


	}

}
