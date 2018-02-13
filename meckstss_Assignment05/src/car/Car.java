/**
 * Assignment 05
 * @author Stephen Meckstroth
 * Description: An assignment to Late Binding
 * Due Date: Feb 13, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: N/A
 */
package car;

import vehicle.Vehicle;
/**
 * A car type of vehicle
 * @author Stephen Meckstroth
 *
 */
public class Car extends Vehicle {
	
	/**
	 * Start the car
	 */
	@Override
	public boolean start() {
		System.out.println("Car id: " + super.id +" started!");
		return true;
	}
	
	/**
	 * Stop the car
	 */
	@Override
	public boolean stop() {
		System.out.println("Car id: " + super.id +" stopped!");
		return true;
	}

}
