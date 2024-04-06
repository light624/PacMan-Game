/**
 * 
 */
package fr.eseo.e3e.pdlo.levels;

/**
 * 
 */
public class Cell {
    private boolean isWall;
    private boolean hasBonus;
    private boolean hasGhost;
    

    public Cell(boolean isWall) {
        this.isWall = isWall;
        this.hasBonus = false;
        this.hasGhost = false;
    }

    
    public boolean isWall() {
        return isWall;
    }

    public void setWall(boolean isWall) {
        this.isWall = isWall;
    }

    public boolean hasBonus() {
        return hasBonus;
    }

    public void setBonus(boolean hasBonus) {
        this.hasBonus = hasBonus;
    }

    public boolean hasGhost() {
        return hasGhost;
    }

    public void setGhost(boolean hasGhost) {
        this.hasGhost = hasGhost;
    }

}
