package app;

/**
 * 
 * @author Maya
 *
 */
public interface WeaponInterface {
	/**
	 * Fire the weapon
	 */
	public void fireWeapon();
	/**
	 * Fires the weapon with a specified power
	 * @param power The power of the weapon
	 */
	public void fireWeapon(int power);
	/**
	 * Activates the weapon
	 * @param enable Whether the weapon is activated or not
	 */
	public void activate(boolean enable);

}
