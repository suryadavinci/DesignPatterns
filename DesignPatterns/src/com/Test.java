package com;

import java.util.ArrayList;
import java.util.Scanner;

import com.railwaybooking.model.Location;
import com.railwaybooking.model.Routes;
import com.railwaybooking.model.Trains;
import com.railwaybooking.model.ChennaiExpress;

public class Test {

	
	public static void main(String[] args) throws Exception {

		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Available Destinations : \n");
		ArrayList<Location> l=Location.availableLocations;
		for(int i=0;i<l.size();i++){
			System.out.println(i+1+". "+l.get(i).getName()+" \t"+l.get(i).getShortName());
		}
		
		System.out.println("Select Souce and Destionation [s d]: \n");
		int from=s.nextInt();
		int to=s.nextInt();
		
		String route= Location.availableLocations.get(from-1).getShortName()+"TO"+Location.availableLocations.get(to-1).getShortName();
		
		System.out.println(route);
		
		System.out.println(Routes.getRoute(route).getTrain());
		
		
	}
	
	
}

