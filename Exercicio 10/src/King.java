
public class King extends Character {

	@Override
	void fight() {

		if(this.weaponBehavior != null) {
			this.weaponBehavior.useWeapon();
		}
	}
	
	public void setWeaponBehavior(WeaponBehavior weapon) {
		this.weaponBehavior = weapon;
	}
	
	
	
}
