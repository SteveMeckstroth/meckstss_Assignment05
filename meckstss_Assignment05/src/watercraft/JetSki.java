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
 * A jet-ski type of watercraft
 * @author Stephen Meckstroth
 *
 */
public class JetSki extends Vehicle {
	
	/**
	 * Start the jetski
	 */
	@Override
	public boolean start() {
		System.out.println("JetSki id: " + super.id +" started!");
		return true;
	}
	/**
	 * Stop the JetSki
	 */
	@Override
	public boolean stop() {
		System.out.println("JetSki id: " + super.id +" started!");
		return false;
	}

}
