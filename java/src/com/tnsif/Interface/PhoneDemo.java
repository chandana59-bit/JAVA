package com.tnsif.Interface;

public class PhoneDemo {
	  public static void main(String[] args) {
	        Phone jioSim = new Jio();
	        Phone samsungPhone = new Samsung();

	        jioSim.call();
	        jioSim.sms();

	        samsungPhone.call();
	        samsungPhone.sms();
	    }
	}

