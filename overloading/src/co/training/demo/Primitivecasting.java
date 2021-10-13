package co.training.demo;
/*
 * casting primitives
 * wrappper class
 * autoboxing
 * method overloading
 */

public class Primitivecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=23;
		//here casting is not required => because it is widening
		long maxAge=age;
		long salaryPerMonth=75000;
//		int salary=salaryPerMonth; casting long to int => down casting
		int salary=(int)salaryPerMonth;
		System.out.println(salary);

	}

}
