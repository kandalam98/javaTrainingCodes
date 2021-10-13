package co.training.demo;

public class WrapperVClass {
	public static void main(String[] args) {
		/*
		 * Command Line argument values are passed => Run as , run configuration
		 * select arguments tab and enter the values
		 */
		int rollNumber=Integer.parseInt(args[0]);
		String studentName=args[1];
		double markScored=Double.parseDouble(args[2]);
		String email=args[3];
		Student ram=new Student(rollNumber,studentName,markScored,email);
		System.out.println(ram.getMarkScored());
		
		int phoneNumber=2324334;
		String strPhoneNumber=Integer.toString(phoneNumber);
		System.out.println("Phone number length : =" + strPhoneNumber.length());
	}
	

}
