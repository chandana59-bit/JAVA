package com.tnsif.Interface;

	public class Samsung implements Phone {
	    @Override
	    public void call() {
	        System.out.println("Call using Samsung phone");
	    }

	    @Override
	    public void sms() {
	        System.out.println("SMS using Samsung phone");
	    }
	}

