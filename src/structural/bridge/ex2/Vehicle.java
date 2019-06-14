package structural.bridge.ex2;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
	protected List<Workshop> workshops = new ArrayList<>();
	protected Color color;

	protected Vehicle(Color color) {
		super();
		this.color = color;
	}

	public boolean joinWorkshop(Workshop workshop) {
		return workshops.add(workshop);
	}

	abstract public void manufacture();
}
