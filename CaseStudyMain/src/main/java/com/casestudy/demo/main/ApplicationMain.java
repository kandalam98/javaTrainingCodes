package com.casestudy.demo.main;
import java.sql.Connection;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import org.apache.log4j.Logger;

import com.casestudy.demo.Employee;
import com.casestudy.demo.repo.EmployeeCrud;
import com.casestudy.demo.repo.EmployeeRepo;
import com.casestudy.demo.service.EmployeeService;
import com.example.demo.jdbc.DbConnection;


public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getRootLogger();
		Connection con=DbConnection.getOracleConnection();
		Scanner sc=new Scanner(System.in);
		EmployeeCrud<Employee,String> repo=new EmployeeRepo(con);
		EmployeeService service=new EmployeeService();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		
		
		
		System.out.println("Enter 1 to add Employee Details");
		System.out.println("Enter 2 to Get Information by Employee FirstName");
		System.out.println("Enter 3 to Update Employee Details");
		System.out.println("Enter 4 to get List of Employee FirstName and Email ID whose Birthday falls one same day");
		System.out.println("Enter 5 to get List of Employee FirstName and Phone Number whose Anniversary Falls on same day");
		System.out.println("Enter 6 to get all Employee's FirstName and PhoneNumber Details");
		
		
		System.out.println("Enter your Choice");
		int key=sc.nextInt();
		log.info("Key value =" +key);
		System.out.println("Entered number =" + key);
		
		
		switch(key) 
		{
		case 1:
			System.out.println("Adding Employee details");
			System.out.print("Enter First name :");
			String firstName=sc.next();
			log.info(firstName);
			System.out.print("Enter Last Name :");
			String lastName=sc.next();
			log.info(lastName);
			System.out.print("Enter address :");
			String address=sc.next();
			log.info(address);
			System.out.print("Enter Email :");
			String email=sc.next();
			log.info(email);
			System.out.print("Enter PhoneNumber :");
			int phoneNumber=sc.nextInt();
			log.info(phoneNumber);

			System.out.print("Enter Year :");
			String year1 = sc.next();
	        int y = Integer.parseInt( year1 );
	        System.out.println("Enter month of birth :");
	        String monthInput = sc.next();
	        int m = Integer.parseInt( monthInput );
	        System.out.println("Enter day of birth :");
	        String dayInput = sc.next();
	        int d = Integer.parseInt( dayInput );
//			String string1=sc.next();
	        LocalDate birthday1 = LocalDate.of( y,m,d);
	        log.info(birthday1);
	        
			System.out.print("Enter anniversary Year :");
			String year2 = sc.next();
	        int y2 = Integer.parseInt( year2 );
	        System.out.println("Enter month of birth :");
	        String month2 = sc.next();
	        int m2 = Integer.parseInt( month2 );
	        System.out.println("Enter day of birth :");
	        String day2 = sc.next();
	        int d2 = Integer.parseInt( day2 );
	        LocalDate anniversary1= LocalDate.of( y2 , m2 , d2 );
	        log.info(anniversary1);
	        
	        
	        Employee emp=new Employee(firstName,lastName,address,email,phoneNumber,birthday1,anniversary1);
			boolean result=repo.add(emp);
//			boolean result2=repo.add2(emp);
			if(result) {
//				log.info("Successfully added Employee");
				System.out.println("Successfully added Employee");
			}
//			if(result2) {
//				System.out.println("add2 success");
//			}
			break;
		case 2:
			System.out.println("Enter the First Name :" );
			String fname=sc.next();
			try {
				Employee getInfo=repo.findByname(fname);
				log.info(getInfo);
				System.out.println(getInfo);
				System.out.println("Successfully Printed Employee details by firstName");
			}catch(Exception e) {
				log.debug(e.getMessage());
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Update the details");
			System.out.print("Enter First name :");
			String firstName2=sc.next();
			log.info(firstName2);
			System.out.print("Enter Last Name :");
			String lastName2=sc.next();
			log.info(lastName2);
			System.out.print("Enter address :");
			String address2=sc.next();
			log.info(address2);
			System.out.print("Enter Email :");
			String email2=sc.next();
			log.info(email2);
			System.out.print("Enter PhoneNumber :");
			int phoneNumber2=sc.nextInt();
			log.info(phoneNumber2);

			System.out.print("Enter birthday Year :");
			String yeara2 = sc.next();
	        int ya2 = Integer.parseInt( yeara2 );
	        System.out.println("Enter month of birth :");
	        String monthInputa2 = sc.next();
	        int ma2 = Integer.parseInt( monthInputa2 );
	        System.out.println("Enter day of birth :");
	        String dayInputa2 = sc.next();
	        int da2 = Integer.parseInt( dayInputa2 );
	        LocalDate birthday2 = LocalDate.of( ya2 , ma2, da2 );
	        
			System.out.print("Enter anniversary Year :");
			String yearb2 = sc.next();
	        int yb2 = Integer.parseInt( yearb2 );
	        System.out.println("Enter month of birth :");
	        String monthb2 = sc.next();
	        int mb2 = Integer.parseInt( monthb2 );
	        System.out.println("Enter day of birth :");
	        String dayb2 = sc.next();
	        int db2 = Integer.parseInt( dayb2 );
	        LocalDate anniversary2= LocalDate.of( yb2 , mb2 , db2 );
	        
	        
	        Employee emp2=new Employee(firstName2,lastName2,address2,email2,phoneNumber2,birthday2,anniversary2);
			boolean resulta3=repo.add(emp2);
			if(resulta3) {
				System.out.println("Update successfull");
			}
			break;
		case 4:
			System.out.println("Get list of firstName and Email id on birthday :");
			System.out.print("Enter year :");
			String year3 = sc.next();
	        int y3 = Integer.parseInt( year3 );
	        System.out.println("Enter month of birth :");
	        String month3 = sc.next();
	        int m3 = Integer.parseInt( month3 );
	        System.out.println("Enter day of birth :");
	        String day3 = sc.next();
	        int d3 = Integer.parseInt( day3 );
	        LocalDate birthdaydate= LocalDate.of( y3 , m3 , d3 );
	        System.out.println(birthdaydate);
	        List<Employee> birthdayList=null;
			try {
				birthdayList=repo.findByBirthday(birthdaydate);
				List<String> ans=service.findByBirthdayService(birthdayList);
				ans.forEach(System.out::println);

			}catch(Exception e)
			{
				log.debug(e.getMessage());
				e.printStackTrace();
			}
			System.out.println("Got details by  Birthday ");
			break;
		case 5:
			System.out.println("Get list of firstName and Email id on anniversary :");
			System.out.print("Enter year :");
			String year4 = sc.next();
	        int y4 = Integer.parseInt( year4 );
	        System.out.println("Enter month of birth :");
	        String month4 = sc.next();
            int m4 = Integer.parseInt( month4);
	        System.out.println("Enter day of birth :");
	        String day4 = sc.next();
	        int d4 = Integer.parseInt( day4 );
	        LocalDate anniversary4= LocalDate.of( y4 , m4 , d4 );
	        System.out.println(anniversary4);
	        Map<String,String> allList=new HashMap<>();
			try {
				allList=repo.findByAnniversary(anniversary4);
				allList.entrySet().forEach(System.out::println);

	
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Got details by Anniversary Date ");
			break;
		case 6:
			try{
				allList=repo.findAllNameandNumber();
				log.info(allList);
				allList.entrySet().forEach(System.out::println);
//				log.debug("Got the list of all FirstName and PhoneNumber");
			}catch(Exception e) {
				log.debug(e.getMessage());
				e.printStackTrace();
			}
			break;
			
		default:
			break;
			
		}
			

	}

}
