/**
 * Assignment 05
 * @author Stephen Meckstroth
 * Description: An assignment to Late Binding
 * Due Date: Feb 13, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: N/A
 */

package main;

import java.util.ArrayList;

import car.Car;
import truck.Truck;
import vehicle.Vehicle;
import watercraft.JetSki;
import watercraft.Yacht;

public class Main {

	public static void main(String[] args) {
		//Declare and instantiate an arraylist of vehicles
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(new Car());
		vehicles.add(new Truck());
		vehicles.add(new JetSki());
		vehicles.add(new Yacht());
		vehicles.add(new Car());
		vehicles.add(new Truck());
		vehicles.add(new JetSki());
		vehicles.add(new Yacht());
		
		//a loop to start and stop all vehicles
		for(Vehicle v : vehicles) {
			//Late-binding
			v.start();
			v.stop();
			
		}

	}

}
