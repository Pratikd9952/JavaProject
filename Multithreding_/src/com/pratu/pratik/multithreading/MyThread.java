package com.pratu.pratik.multithreading;

public class MyThread implements Runnable {

	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("The value i is "+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
