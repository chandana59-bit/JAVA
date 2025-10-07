package com.tnsif.multithreading;

public class Multidemo {

		public static void main(String[] args) {
			 JoinYeild t1 = new JoinYeild();
			 JoinYeild t2 = new JoinYeild();

		        t1.setName("Thread-1");
		        t2.setName("Thread-2");

		        t1.start();
		        t2.start();

		        try {
		           
		            t1.join();
		        } catch (InterruptedException e) {
		            System.out.println(e);
		        }

		        System.out.println("Main thread finished after t1 completes.");
		    }

}
