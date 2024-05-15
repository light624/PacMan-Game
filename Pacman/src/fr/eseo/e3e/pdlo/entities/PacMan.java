/**
 * 
 */
package fr.eseo.e3e.pdlo.entities;

import fr.eseo.e3e.pdlo.utils.Coordonnees;
import fr.eseo.e3e.pdlo.utils.Direction;

/**
 * 
 */
public class PacMan extends Entity {
	private int score;
	private Coordonnees position;
    private boolean dead = false;

	public PacMan(int x, int y) {
		super(x, y);
		this.score = 0;
	}

	@Override
	public void move(Direction direction) {

	}

	public void eatBonus(Bonus bonus) {
        this.score+=bonus.getValue();

	}
    public void die() {
        this.dead = true;
    }

    public boolean isDead() {
        return dead;
    }
}
