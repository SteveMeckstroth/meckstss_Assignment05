/**
 * Assignment 05
 * @author Stephen Meckstroth
 * Description: An assignment to Late Binding
 * Due Date: Feb 13, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: N/A
 */
package vehicle;

import drivable.Drivable;
import java.util.UUID;

public abstract class Vehicle implements Drivable {
	protected UUID id;
	
	public Vehicle(){
		id = UUID.randomUUID();
	}
}
