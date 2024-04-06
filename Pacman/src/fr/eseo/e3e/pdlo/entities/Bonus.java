package fr.eseo.e3e.pdlo.entities;

import fr.eseo.e3e.pdlo.utils.Direction;

public class Bonus extends Entity {

	private boolean collected;

	public Bonus(int x, int y) {
		super(x, y);
		this.collected = false;
	}

	public void collect() {
		this.collected = true;

	}

	@Override
	public void move(Direction direction) {

	}
}
