package com.training.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.training.ifaces.BookService;
import com.training.model.Book;

public class BookServiceImplWithStream implements BookService {

	@Override
	public boolean write(Book book) throws IOException {
		// TODO Auto-generated method stub
		boolean result=false;
		try(ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("book.ser"))){
			outStream.writeObject(book);
			result=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Book[] read() throws IOException {
		// TODO Auto-generated method stub
		Book[] booklist=new Book[3];
		int i=0;
		try(ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(new File("book.ser")))) 
		{
			Book bk=(Book)inputStream.readObject();
			booklist[i]=bk;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
