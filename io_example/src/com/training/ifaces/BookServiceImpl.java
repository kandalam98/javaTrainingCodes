package com.training.ifaces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.training.ifaces.BookService;
import com.training.model.Book;

public class BookServiceImpl implements BookService {
	
	/*
	 * The book service Interface has write method with throws  clasue
	 * so we can override and add throws clause
	 * 
	 * but if book service interface is NOt having throws clause
	 * hen we have to override and handle ,IO Exception  CANNOT use throws clause
	 */

	@Override
	public boolean write(Book book) throws IOException {
		// TODO Auto-generated method stub
		boolean result=false;
		try(PrintWriter writer=new PrintWriter(new FileWriter("book.txt",true))){
			writer.println(book.toString());
			result=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public Book[] read() throws IOException {
		Book[] bookList=new Book[3];
		try(BufferedReader reader=new BufferedReader(new FileReader("book.txt"))){
			String line=null;
			int i=0;
			while((line=reader.readLine())!=null) {
				String[] values=line.split(",");
				Book book=new Book(Integer.parseInt(values[0]),values[1],values[2],Double.parseDouble(values[3]));
				bookList[i]=book;
				i++;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return bookList;
	}

}
