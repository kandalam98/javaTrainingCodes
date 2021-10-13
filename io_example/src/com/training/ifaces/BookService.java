package com.training.ifaces;
import com.training.model.Book;
import java.io.IOException;

public interface BookService {
	public boolean write(Book book) throws IOException;
	public Book[] read() throws IOException;

}
