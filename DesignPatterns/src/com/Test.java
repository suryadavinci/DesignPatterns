package com;

import com.railwaybooking.model.ChennaiExpressBooking;

public class Test {

	
	public static void main(String[] args) throws Exception {

		ChennaiExpressBooking c= ChennaiExpressBooking.cXB;
		
		System.out.println(c.getSleeper().getBookedSeats());
		c.getSleeper().setBookedSeats(3);
		System.out.println(c.getSleeper().getBookedSeats());
		
	}
	
	
}

