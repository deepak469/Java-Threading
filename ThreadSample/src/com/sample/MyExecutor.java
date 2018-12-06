package com.sample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SampleRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) " );
		System.out.println("inside run() of createRunnable");
		System.out.println(Thread.currentThread().getName() + " (End) " );
	}
}

class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " (Start) " );
		System.out.println("inside the call() method");
		System.out.println(Thread.currentThread().getName() + " (End) " );
		return "success";
	}
	
}


public class MyExecutor {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		SampleRunnable sr = new SampleRunnable();
		
		Executor exe = Executors.newSingleThreadExecutor();
		exe.execute(sr);
		
		ExecutorService exeService = Executors.newSingleThreadExecutor();
		exeService.execute(sr);
		exeService.shutdown();
		
		MyCallable mc = new MyCallable();
		ExecutorService exeSer = Executors.newSingleThreadExecutor();
		Future<String> a = exeSer.submit(mc);
		System.out.println("hai "+a.get());
		exeSer.shutdown();

	}

}
