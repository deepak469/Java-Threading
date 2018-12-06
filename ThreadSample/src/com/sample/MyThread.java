/**
 * 
 */
package com.sample;

/**
 * @author Deepak
 *
 */

class CreateThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("running run() method");
	}
	
	
}


public class MyThread {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*System.out.println(Thread.currentThread().getName()+ " "+Thread.currentThread().getId());
		
		CreateThread createThread = new CreateThread();
		//createThread.sleep(2000);
		createThread.start();
		//createThread.sleep(2000);
		System.out.println(createThread.getName()+" "+ createThread.getId());
		System.out.println("last line");*/
		System.out.println("Main thread starts");
		CreateThread t = new CreateThread();            // MyThread extends Thread
	    t.setPriority(10);
		t.start();
	    System.out.println(t.isAlive());        // true
	    t.join();
	    System.out.println(t.getName());// main method waits for thread t to complete
	    System.out.println(t.isAlive());        // false
	    Thread.sleep(3000);                     // main method sleeps for 3 seconds
	    System.out.println("Main thread ends");
	}

}
