/**
 * Assignment 05
 * @author Stephen Meckstroth
 * Description: An assignment to Late Binding
 * Due Date: Feb 13, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: N/A
 */
package watercraft;

import vehicle.Vehicle;
/**
 * A boat longer than 28ft with sleeping quarters
 * @author Stephen Meckstroth
 *
 */
public class Yacht extends Vehicle {
	/**
	 * Start the yacht
	 */
	@Override
	public boolean start() {
		System.out.println("Yacht id: " + super.id +" started!");
		return false;
	}
	/**
	 * Stop the Yacht!
	 */
	@Override
	public boolean stop() {
		System.out.println("Yacht id: " + super.id +" stopped!");
		return true;
	}

}
