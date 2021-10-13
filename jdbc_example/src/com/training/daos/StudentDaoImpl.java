package com.training.daos;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Student;
import com.training.ifaces.CrudRepository;

public class StudentDaoImpl implements CrudRepository<Student,Integer> {

	private Connection con;

	
	public StudentDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean add(Student t) 
	{
		String sql  = "insert into student values(?,?,?,?)";
		int rowAdded=0;
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, t.getRollNumber());
			pstmt.setString(2, t.getStudentname());
			pstmt.setDate(3, Date.valueOf(t.getDateofbirth()));
			pstmt.setDouble(4, t.getMarkscored());
			rowAdded = pstmt.executeUpdate();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return rowAdded==1 ? true : false;
	}

	@Override
	public List<Student> findAll() 
	{
		// TODO Auto-generated method stub
		String sql="select * from student";
		List<Student> list=new ArrayList<>();
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) 
			{
				int rollNumber=rs.getInt("rollNumber");
				String studentname=rs.getString("studentname");
				LocalDate dob=rs.getDate("dateofbirth").toLocalDate();
				int markScored=rs.getInt("markscored");
				Student student=new Student(rollNumber,studentname,dob,markScored);
				list.add(student);
			}
			
		}catch(Exception e) {
			e.printStackTrace();	
		}
		return list;
	}

	@Override
	public boolean update(Student t) {
		// TODO Auto-generated method stub
		String sql="update student  set rollNumber= ?,studentname= ?,markscored =? where rollNumber= ?";
		int updated=0;
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				pstmt.setInt(1, t.getRollNumber());
				pstmt.setString(2, t.getStudentname());
				pstmt.setDouble(4, t.getMarkscored());
				updated = pstmt.executeUpdate();		
		    }
	    }	
		catch(SQLException e2) {
			e2.printStackTrace();
		}
		return updated==1 ? true : false;
	}

	@Override
	public boolean remove(Student t) {
		// TODO Auto-generated method stub
		String sql="delete from student where rollNumber= ?";
		int rowDeleted=0;
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				pstmt.setInt(1, t.getRollNumber());
//				pstmt.setString(2, t.getStudentname());
//				pstmt.setDate(3, Date.valueOf(t.getDateofbirth()));
//				pstmt.setDouble(4, t.getMarkscored());
				rowDeleted = pstmt.executeUpdate();		
		    }
	    }	
		catch(SQLException e2) {
			e2.printStackTrace();
		}
		return rowDeleted==1 ? true : false;
	}

	@Override
	public Student findById(int e) {
		// TODO Auto-generated method stub
		String sql="select * from student where rollNumber= ? ";
		Student obj=null;
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setInt(1, e);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				int rollNumber=rs.getInt("rollNumber");
				String studentname=rs.getString("studentname");
				LocalDate dob=rs.getDate("dateofbirth").toLocalDate();
				int markScored=rs.getInt("markscored");
				obj=new Student(rollNumber,studentname,dob,markScored);		
		    }
	    }	
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		return obj;
	}


}