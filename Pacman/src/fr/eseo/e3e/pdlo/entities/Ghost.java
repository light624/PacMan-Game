/**
 * 
 */
package fr.eseo.e3e.pdlo.entities;

import fr.eseo.e3e.pdlo.utils.Direction;

/**
 * 
 */
public class Ghost extends Entity {
	private boolean isScared;

	public Ghost(int x, int y) {
		super(x, y);
	}

	
	public void moveRamdomly(Direction direction) {

	}
	public void chasePacman(){}


	@Override
	public void move(Direction direction) {
		throw new UnsupportedOperationException("Unimplemented method 'move'");
	}

}
