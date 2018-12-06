package com.sample;

class CreateRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("inside run() of createRunnable");
	}
}

public class MyRunnable {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreateRunnable createRunnable=new CreateRunnable();
		Thread newThread = new Thread(createRunnable,"new Thread name");
		newThread.sleep(1000);
		newThread.start();
		System.out.println(newThread.getName());
		

	}

}
