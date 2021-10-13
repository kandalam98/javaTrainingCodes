package com.training.daos;

import java.util.List;
import java.sql.Connection;
import java.time.LocalDate;

import com.training.entity.Student;
import com.training.ifaces.CrudRepository;
import com.training.jdbc.DbConnection;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=DbConnection.getOracleConnection();
		CrudRepository<Student,Integer> repo=new StudentDaoImpl(con);
		int key=4;
		if(key==1) {
			Student ram=new Student(101,"Ramesh",LocalDate.of(1997, 9, 17),90);
			boolean result=repo.add(ram);
			if(result) {
				
				System.out.println("One student added");
			}
		}
		if(key==2) {
			List<Student> list=repo.findAll();
			for(Student each: list) {
				System.out.println(each);
			}
		}
		if(key==3) {
			Student temp=repo.findById(101);
			System.out.println(temp);
		}
		if(key==4) {
			Student sam=new Student(101,"Ramesh",LocalDate.of(1997, 9, 17),90);
			boolean temp=repo.remove(sam);
			if(temp) {
				System.out.println("One row deleted");
			}
			
		}

		

	}

}
