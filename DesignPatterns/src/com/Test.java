package com;

import java.util.ArrayList;
import java.util.Scanner;

import com.railwaybooking.model.Location;
import com.railwaybooking.model.Routes;
import com.railwaybooking.model.Trains;
import com.railwaybooking.model.ChennaiExpress;

public class Test {

	public static void main(String[] args) {

		Routes.enterRoutes();

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("Available Destinations : \n");
			ArrayList<Location> l = Location.availableLocations;
			for (int i = 0; i < l.size(); i++) {
				System.out.println(i + 1 + ". " + l.get(i).getName() + " \t" + l.get(i).getShortName());
			}

			System.out.println("Select Souce and Destionation [s d]:");
			int from = s.nextInt();
			int to = s.nextInt();

			String route = Location.availableLocations.get(from - 1).getShortName() + "TO"
					+ Location.availableLocations.get(to - 1).getShortName();

			System.out.println(route);

			Routes r = Routes.getRoute(route);

			System.out.println(r.getTrains());

			System.out.println("Select a Train ");
			int selectedTrain = s.nextInt();

			Trains t = r.getTrains().get(selectedTrain);

			t.printDetails();

			System.out.println("Enter Class and Seats : ");
			String c = s.next();
			int seats = s.nextInt();

			try {
				if (c.equalsIgnoreCase("s")) {
					t.getSleeper().setBookedSeats(seats);
				} else if (c.equalsIgnoreCase("a")) {
					t.getAC().setBookedSeats(seats);
				} else if (c.equalsIgnoreCase("g")) {
					t.getGeneral().setBookedSeats(seats);
				}
				System.out.println("Tickets Booked");
			} catch (Exception e) {
				System.out.println("Required seats exceeds available seats");
			}

			t.printDetails();

		}

	}

	public static void printDetails(ArrayList<Trains> h) {
		for (int i = 0; i < h.size(); i++)
			h.get(i).printDetails();
		System.out.println();
	}

}
