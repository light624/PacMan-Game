package fr.eseo.e3e.pdlo.entities;

import fr.eseo.e3e.pdlo.utils.Direction;

public class Bonus extends Entity {

	private boolean collected;
    private int value;

	public Bonus(int x, int y) {
		super(x, y);
		this.collected = false;
	}

	public void collect() {
		this.collected = true;

	}
    public int getValue(){
        return this.value;
    }

	@Override
	public void move(Direction direction) {

	}
}
