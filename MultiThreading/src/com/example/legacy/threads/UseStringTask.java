package com.example.legacy.threads;

public class UseStringTask implements Runnable {
	
    private String str1;
    private String str2;
    
	public UseStringTask(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		/*
		 * following lines are commented out because we are planning 
		 * to use executor framework
		 * In executor framewrok threa pools are created and we only need
		 * to submit the task and not create threads
		 */
//		Thread thread=new Thread(this);
//		Thread thread2 = new Thread();
//		thread.start();//this refers to runnable( current obj)
	}

	@Override
	public void run() {
		PrintStrings.print(str1,str2);

	}

}
