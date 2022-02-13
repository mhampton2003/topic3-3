package app;

public class Gun implements WeaponInterface{
	/**
	 * prints out the power of the gun and the method that was used
	 * @param power The power of the gun
	 */
	public void fireWeapon(int power) {
		System.out.println("In Gun.fireWeapon() with a power of " + power);
	}
	
	/**
	 * prints out the method that is used
	 */
	public void fireWeapon() {
		System.out.println("In overloaded Gun.fireWeapon()");
	}

	/**
	 * overrides the activate method
	 * @param enable Whether the gun is enabled or not
	 */
	@Override
	public void activate(boolean enable) {
		System.out.println("In Gun.activate() with an enable of " + enable);
		
	}

}
