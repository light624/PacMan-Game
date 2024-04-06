/**
 * 
 */
package fr.eseo.e3e.pdlo.entities;

/**
 * 
 */
public class PacMan extends Entity {
    private int score;
    
    
    public PacMan(int x, int y) {
        super(x, y);
        this.score = 0;
    }

    @Override
    public void move() {
      
    }

    public void eatBonus(Bonus bonus) {
        
}
}

