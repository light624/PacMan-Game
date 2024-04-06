/**
 * 
 */
package fr.eseo.e3e.pdlo.entities;

/**
 * 
 */
public abstract class Entity {
	protected int x, y;

	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract void move();
}
