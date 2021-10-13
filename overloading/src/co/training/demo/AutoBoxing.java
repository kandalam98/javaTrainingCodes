package co.training.demo;

public class AutoBoxing {
	public static void print(int a , int b) {
		System.out.println(a+b);
	}
	public static void printUsingWrapper(Integer a ,Integer b) {
		System.out.println(a+b+100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(54,4);
		//java uses AutoBoxing to convert primitive into object 
		printUsingWrapper(5,6);

	}

}
