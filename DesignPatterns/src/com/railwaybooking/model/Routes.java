package com.railwaybooking.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Routes {

	String name;
	Location from;
	Location to;
	int distance;
	HashSet<Trains> trains = new HashSet<Trains>();
	private static HashMap<String, Routes> availableRoutes = new HashMap<String, Routes>();

	// static HashMap<Routes,LinkedList<Trains>> availableExpRoutes = new
	// HashMap<Routes,LinkedList<Trains>> ();
	/*
	 * Routes() { Location from= Location.availableLocations.get(0); Location
	 * to= Location.availableLocations.get(1); Trains train= ChennaiExpress.cXB;
	 * try{ new Routes("CHNTOBANG",from,to,172, train ); to=
	 * Location.availableLocations.get(2);
	 * 
	 * train= ChennaiExpress.cXB; new Routes("CHNTOMUM",from,to,472, train );
	 * 
	 * train=MumbaiExpress.mXB; from= Location.availableLocations.get(1); new
	 * Routes("BANGTOMUM",from, to,300,train);}catch(Exception e){
	 * 
	 * }
	 * 
	 * }
	 */

	Routes(String name, Location from, Location to, int distance, Trains express)
			throws Exception {
		if (distance < 0) {
			throw new Exception("NegativeDistanceException");
		}

		this.name = name;
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.trains.add(express);
		String routeString = from.getShortName() + "TO" + to.getShortName();

		availableRoutes.put(routeString, this);

	}

	public static Routes getRoute(String routeString) {
		return availableRoutes.get(routeString);

	}

	public HashSet<Trains> getTrains() {
		return this.trains;
	}

	public void addTrains(Trains train) {
		this.trains.add(train);
	}

	public static void enterRoutes() {

		Location from = Location.availableLocations.get(0);
		Location to = Location.availableLocations.get(1);
		Trains train = ChennaiExpress.cXB;
		try {

			if (Routes.getRoute("CHNTOBANG") != null) {
				Routes.getRoute("CHNTOBANG").addTrains(train);
			} else {
				new Routes("CHNTOBANG", from, to, 172, train);
			}

			to = Location.availableLocations.get(2);
			if (Routes.getRoute("CHNTOMUM") != null) {
				Routes.getRoute("CHNTOMUM").addTrains(train);
			} else {
				new Routes("CHNTOMUM", from, to, 472, train);
			}

			train = MumbaiExpress.mXB;
			if (Routes.getRoute("CHNTOMUM") != null) {
				Routes.getRoute("CHNTOMUM").addTrains(train);
			} else {
				new Routes("CHNTOMUM", from, to, 472, train);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
