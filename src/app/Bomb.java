package app;

public class Bomb implements WeaponInterface{
	/**
	 * prints the power and the method that is used
	 * @param power The power of the bomb
	 */
	public void fireWeapon(int power) {
		//prints the method and class that is being called with the specified power
		System.out.println("In Bomb.fireWeapon() with a power of " + power);
	}
	
	/**
	 * prints the method that is used
	 */
	public void fireWeapon() {
		//prints the method and class that is being called
		System.out.println("In overloaded Bomb.fireWeapon()");
	}

	/**
	 * overrides the activate method
	 * @param enable Whether the bomb is enabled or not
	 */
	@Override
	public void activate(boolean enable) {
		//prints the method and class that is being called and the value of enable
		System.out.println("In Bomb.activate() with an enable of " + enable);
		
	}

}
