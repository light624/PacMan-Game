package fr.eseo.e3e.pdlo.gui;

import javax.swing.JPanel;
import fr.eseo.e3e.pdlo.levels.Maze;
import fr.eseo.e3e.pdlo.utils.CellType;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class GamePanel extends JPanel {
    private Maze maze;

    public GamePanel() {
       
        maze = new Maze("../ressources/images/maze.map", "../ressources/images/walled_maze.map");
        
        setPreferredSize(new Dimension(maze.getColumns() * 20, maze.getRows() * 20));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMaze(g);
        drawEntities(g); 
    }

    private void drawMaze(Graphics g) {
        for (int row = 0; row < maze.getRows(); row++) {
            for (int col = 0; col < maze.getColumns(); col++) {
                drawCell(g, maze.getCellType(row, col), col, row);
            }
        }
    }

    private void drawCell(Graphics g, CellType type, int x, int y) {
        
        int realX = x * 20;
        int realY = y * 20;
        final int CELL_SIZE = 20;
        final int DOT_SIZE = 4;
        final int DOT_OFFSET = (CELL_SIZE - DOT_SIZE) / 2;

        switch (type) {
            case WALL:
                g.setColor(Color.BLUE);
                g.fillRect(realX, realY, CELL_SIZE, CELL_SIZE);
                break;
            case PATH:
                g.setColor(Color.BLACK);
                g.fillRect(realX, realY, CELL_SIZE, CELL_SIZE);
               
                g.setColor(Color.WHITE);
                g.fillOval(realX + DOT_OFFSET, realY + DOT_OFFSET, DOT_SIZE, DOT_SIZE);
                break;
           
            case EMPTY:
            default:
                g.setColor(Color.BLACK);
                g.fillRect(realX, realY, CELL_SIZE, CELL_SIZE);
                break;
        }
    }
    
    private void drawEntities(Graphics g) {
       
    }

    public void startGameLoop() {
       
    }

  
}
