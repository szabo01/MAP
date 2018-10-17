
public class MainApp {
	
	public static void main(String[] args) {
		
		KnifeBehavior knife = new KnifeBehavior();
        SwordBehavior sword = new SwordBehavior();
        AxeBehavior axe = new AxeBehavior();

        King king = new King();
        king.setWeaponBehavior(sword);
        king.fight();

        king.setWeaponBehavior(knife);
        king.fight();

        king.setWeaponBehavior(axe);
        king.fight();
	}

}
