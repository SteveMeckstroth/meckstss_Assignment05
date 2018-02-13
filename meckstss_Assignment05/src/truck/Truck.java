/**
 * Assignment 05
 * @author Stephen Meckstroth
 * Description: An assignment to Late Binding
 * Due Date: Feb 13, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: N/A
 */
package truck;

import vehicle.Vehicle;
/**
 * A truck type of vehicle
 * @author Stephen Meckstroth
 *
 */
public class Truck extends Vehicle {
	
	/**
	 * Start the truck
	 */
	@Override
	public boolean start() {
		System.out.println("Truck id: " + super.id +" started!");
		return true;
	}
	
	/**
	 * Stop the truck
	 */
	@Override
	public boolean stop() {
		System.out.println("Truck id: " + super.id +" stopped!");
		return true;
	}

}
