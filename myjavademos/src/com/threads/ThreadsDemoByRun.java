package com.threads;


//implemented by implement runnable interface
class ThreadsRunDemos implements Runnable {

	public void run() { // imp method given by thread class java

		//logic part
		try {
			System.out.println("list of threads running " + Thread.currentThread());
		} catch (Exception e) {

			System.out.println("exceotion caught" + e);

		}

	}

}

public class ThreadsDemoByRun {

	public static void main(String ar[]) {

		int numberOfThreads = 2;

		for (int i = 0; i < numberOfThreads; i++) {

			ThreadsDemos threadsDemos = new ThreadsDemos();//created the object of a class

			threadsDemos.start();// life cycle of threads start() call the run method
			threadsDemos.setName("abhinav thread");
			threadsDemos.setPriority(8);
			

		}

	}

}
