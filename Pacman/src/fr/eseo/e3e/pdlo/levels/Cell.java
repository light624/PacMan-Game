/**
 * 
 */
package fr.eseo.e3e.pdlo.levels;

import fr.eseo.e3e.pdlo.utils.CellType;

/**
 * 
 */
public class Cell {
    private boolean isWall;
    private boolean hasBonus;
    private boolean hasGhost;
    private CellType type;
    

    public Cell(boolean isWall) {
        this.isWall = isWall;
        this.hasBonus = false;
        this.hasGhost = false;
    }
    public boolean isWalkable() {
        return this.type == CellType.PATH || this.type == CellType.BONUS || this.type == CellType.SUPER_BONUS;
    }

    
    public boolean isWall() {
        return isWall;
    }

    public void setWall(boolean isWall) {
        this.isWall = isWall;
    }
    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
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
