package com.training;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		Item item=new Item();
		Customer customer=null;
		ItemService service=null;
		while(flag) {
			int id=sc.nextInt();
			String itemname=sc.nextLine();
			int rate=sc.nextInt();
			String category=sc.nextLine();
			item=new Item(id,itemname,rate,category);
			
			int customerid=sc.nextInt();
			String customername=sc.nextLine();
			String customercategory=sc.nextLine();
			
			customer=new Customer(customerid,customername,customercategory);
			if(customer.getCategory().equals("retails") || customer.getCategory().equals("Corporate")) {
				System.out.println(service.findDiscount(item,customer));
			}
			else {
			
			System.out.println(service.findDiscount(item));
			}
			
			
			flag=sc.nextBoolean();
			
			
			sc.close();
		}
		

	}

}
