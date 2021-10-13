package com.taining;

import java.io.IOException;

import com.training.ifaces.BookService;
import com.training.ifaces.BookServiceImpl;
import com.training.model.Book;
import com.training.services.BookServiceImplWithStream;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookService service=null;
		int key=3;
		try{
			switch(key) {
			case 1:
				Book book=new Book(101,"Head First Java","Kathyy",333);
				service=new BookServiceImpl();
				service.write(book);
				break;
			case 2:
				Book[] list=service.read();
				for(Book eachBook:list) {
					if(eachBook!=null) {
						System.out.println(eachBook);
					}
				}
			case 3:
				Book book2=new Book(103,"java Script","Paul",500);
				BookServiceImplWithStream obj=new BookServiceImplWithStream();
				boolean status=obj.write(book2);
				if(status) {
					System.out.println("One book is serialized");
				}
				break;
			case 4:
				Book[] bklist=service.read();
				System.out.println(bklist[0].toString());
				break;
				
				
			default:
				break;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}


	}

}
