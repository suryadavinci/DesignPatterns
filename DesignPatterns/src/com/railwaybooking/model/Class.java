package com.railwaybooking.model;

public class Class {

	private String name;
	private final int totalSeats;
	private int bookedSeats;

	public Class(int i) {
		totalSeats = i;
		bookedSeats = 0;
	}

	public int getTotalSeats() {
		return this.totalSeats;
	}

	public int getBookedSeats() {
		return this.bookedSeats;
	}

	public void setBookedSeats(int n) throws Exception {
		if (n > this.totalSeats - this.bookedSeats) {
			throw new Exception("SeatUnavailableException");
		}

		this.bookedSeats = this.bookedSeats + n;
	}

}