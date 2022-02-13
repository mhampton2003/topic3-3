package app;

/**
 * 
 * @author Maya
 *
 */

public class Game {
	/**
	 * Prints out if weapon is bomb then activates and fires
	 * @param weapon The weapon object of type WeaponInterface
	 */
	private static void fireWeapon(WeaponInterface weapon) {
		//checks if weapon is a Bomb
		if (weapon instanceof Bomb) {
			System.out.println("------------> I am a Bomb");
		}
		
		//activates and fires weapon
		weapon.activate(true);
		weapon.fireWeapon(5);
	}
	
	/**
	 * Creates weapons array then fires weapons
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		//creates array of weapons
		WeaponInterface[] weapons = new WeaponInterface[2];
		weapons[0] = new Bomb();
		weapons[1] = new Gun();
		
		//fires the bomb and the gun from the array
		for (int i = 0; i < 2; ++i) {
			fireWeapon(weapons[i]);
		}
	}

}
