/**
 * 
 */
package fr.eseo.e3e.pdlo.gui;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * 
 */
public class GamePanel extends JPanel {
    private Image mazeImage;

    public GamePanel() {
        mazeImage = Toolkit.getDefaultToolkit().getImage("path_to_maze_image");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMaze(g);
        drawEntities(g);
      
    }

    private void drawMaze(Graphics g) {
        g.drawImage(mazeImage, 0, 0, this);
        
       
    }
    
    private void drawEntities(Graphics g) {
        
        
    }

    public void startGameLoop() {
       
    }

}
