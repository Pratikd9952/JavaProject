package com.pratu.pratik.multithreading;

public class MyMainThread {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		
		Thread tre=new Thread(t1);
		
		AnotherThread at=new AnotherThread();
		
		at.start();
		tre.start();
		
	}

}
