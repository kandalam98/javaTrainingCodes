package com.casestudy.demo.repo;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.casestudy.demo.Employee;


public class EmployeeRepo implements EmployeeCrud<Employee,String>
{
	private Connection con;
	public EmployeeRepo(Connection con) {
		super();
		this.con = con;
	}

	private List<Employee> empList;
	private List<Employee> employeeList;
	public EmployeeRepo() {
		super();
		this.empList=new ArrayList<>();
		this.employeeList=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add (Employee t) 
	{
		// TODO Auto-generated method stub
		String sql  = "insert into Employee values(?,?,?,?,?,?,?)";
		int rowAdded=0;
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, t.getFirstName());
			pstmt.setString(2, t.getLastName());
			pstmt.setString(3, t.getAddress());
			pstmt.setString(4, t.getEmail());
			pstmt.setLong(5, t.getPhoneNumber());
			pstmt.setDate(6, Date.valueOf(t.getBirthday()));
			pstmt.setDate(7, Date.valueOf(t.getAnniversary()));
//			this.empList.add(new Employee(t.getFirstName(),t.getLastName(),t.getAddress(),t.getEmail(),t.getPhoneNumber(),t.getBirthday(),t.getAnniversary()));
			rowAdded = pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowAdded==1 ? true : false;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return this.empList;
	}

	@Override
	public boolean update(Employee t) {
		// TODO Auto-generated method stub
		String sql="update Employee  set firstName= ?,lastName= ?,address =?,email=?,phoneNumber=?,birthday=?, anniversary=? where email= ?";
		int updated=0;
		
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
//			ResultSet rs=pstmt.executeQuery();
			pstmt.setString(1, t.getFirstName());
			pstmt.setString(2, t.getLastName());
			pstmt.setString(3, t.getAddress());
			pstmt.setString(4, t.getEmail());
			pstmt.setLong(5, t.getPhoneNumber());
			pstmt.setDate(6, Date.valueOf(t.getBirthday()));
			pstmt.setDate(7, Date.valueOf(t.getAnniversary()));
			updated = pstmt.executeUpdate();

	    }	
		catch(SQLException e2) {
			e2.printStackTrace();
		}
		return updated==1 ? true : false;
	}

	@Override
	public boolean remove(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Employee findByname(String e )
	{
		String sql="select * from Employee where firstName= ? ";
		Employee obj=null;
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setString(1, e);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				String firstName1=rs.getString("firstName");
				String lastName2=rs.getString("lastName");
				String address2=rs.getString("address");
				String email2=rs.getString("email");
				int phoneNumber2=rs.getInt("phoneNumber");
				LocalDate dob2=rs.getDate("birthday").toLocalDate();
				LocalDate anniversary2=rs.getDate("anniversary").toLocalDate();
				obj=new Employee(firstName1,lastName2,address2,email2,phoneNumber2,dob2,anniversary2);
	
		    }
	    }	
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		return obj;
	}
	@Override
	public List<Employee> findByBirthday(LocalDate e )
	{
		 String sql="select * from Employee where birthday=?";
		 List<Employee> list = new ArrayList<>();
		 Employee obj=null;
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setDate(1, Date.valueOf(e));
			ResultSet rs=pstmt.executeQuery();
	        if(rs.next())
	        {
	        	String firstName=rs.getString("firstName");
				String lastName=rs.getString("lastName");
				String address=rs.getString("address");
				String email=rs.getString("email");
				int phoneNumber=rs.getInt("phoneNumber");
				LocalDate dob=rs.getDate("birthday").toLocalDate();
				LocalDate anniversary=rs.getDate("anniversary").toLocalDate();
				obj=new Employee(firstName,lastName,address,email,phoneNumber,dob,anniversary);
				list.add(obj);

	        }
	    }	
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		return list;
	}
	@Override
	public Map<String,String> findByAnniversary(LocalDate e )
	{
		 String sql="select firstName,phoneNumber from Employee where anniversary=?";
		 Map<String,String> list = new HashMap<>();
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setDate(1,Date.valueOf(e));
			ResultSet rs=pstmt.executeQuery();
	        while(rs.next())
	        {
	        	int number=rs.getInt("phoneNumber");
	        	String temp=Integer.toString(number);
	        	list.put(rs.getString("firstName"),temp);
	        }
	    }	
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		return list;
	}
	@Override
	public Map<String,String> findAllNameandNumber()
	{
		String sql="select firstName,phoneNumber from Employee";

		Map<String,String>  list = new HashMap<>();
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			ResultSet rs=pstmt.executeQuery();
	        while(rs.next())
	        {
	        	int number=rs.getInt("phoneNumber");
	        	String temp=Integer.toString(number);
	        	list.put(rs.getString("firstName"),temp);

	        }
	    }	
		catch(SQLException e1)
		{
			e1.printStackTrace();
		}
		return list;
	}

	
	





}
