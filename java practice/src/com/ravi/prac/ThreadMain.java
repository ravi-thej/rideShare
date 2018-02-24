package com.ravi.prac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMain {

	static int NUM_THREADS = 3;

	public static void main(String[] args) {
	ExecutorService exec = Executors.newFixedThreadPool(NUM_THREADS);
	
	class MyCallable implements Callable {
		private final int threadnumber;
		
		MyCallable(int threadnumber){
		this.threadnumber = threadnumber;
		}
		
		public Integer call() {
		System.out.println("Running thread #" + threadnumber);
		return threadnumber;
		}
	}
	
	class MyRunnable extends Thread {
		
		private final int threadnumber;
		
		MyRunnable(int threadnumber){
		this.threadnumber = threadnumber;
		}

		@Override
		public void run() {
			System.out.println("Running thread #" + threadnumber);
			
		}
		
	}
	
		List<MyCallable> callables = new ArrayList<MyCallable>();
		for(int i=1; i<=NUM_THREADS; i++) {
			callables.add(new MyCallable(i));
		}
//		try {
//			List<Future<MyCallable>> results = exec.invokeAll((Collection<? extends Callable<MyCallable>>) callables);
//			for(Future result: results) {
//				System.out.println("Got result of thread #" + result.get());
//			}
//		} catch (InterruptedException ex) {
//			ex.printStackTrace();
//		} catch (ExecutionException ex) {
//			ex.printStackTrace();
//		} finally {
//			exec.shutdownNow();
//		}
		
		
		List<MyRunnable> runnables = new ArrayList<MyRunnable>();
		for(int i=1; i<=NUM_THREADS; i++) {
			runnables.add(new MyRunnable(i));
		}
		try {
			List<Future<MyRunnable>> results = new ArrayList<>();
			for (Thread run : runnables) {
				run.start();
				run.join();
//			Future<MyRunnable> result = (Future<MyRunnable>) exec.submit(run);
			System.out.println("main thread");
//			results.add(result);
			}
			for(Future result: results) {
				System.out.println("Got result of runnable #" + result.get());
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} catch (ExecutionException ex) {
			ex.printStackTrace();
		} finally {
			exec.shutdownNow();
		}
	}
}
