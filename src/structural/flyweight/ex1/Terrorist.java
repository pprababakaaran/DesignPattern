package structural.flyweight.ex1;

public class Terrorist implements Player {

	// Intrinsic Attribute
	private final String task;

	// Extrinsic Attribute
	private String weapon;

	public Terrorist() {
		task = "PLANT A BOMB";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void mission() {
		System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + task);
	}

}
