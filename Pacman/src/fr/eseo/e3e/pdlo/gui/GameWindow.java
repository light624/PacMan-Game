/**
 * 
 */
package fr.eseo.e3e.pdlo.gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * 
 */
public class GameWindow extends JFrame {
    private GamePanel gamePanel;

    public GameWindow() {
        setTitle("PacMan Game");
        setSize(922, 661); // Taille de l'image
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        
        gamePanel = new GamePanel();
        add(gamePanel);
        
      
    }
    
    public void startGame() {
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        gamePanel.startGameLoop();
    }

    public static void main(String[] args) {
        new GameWindow().startGame();
    }

}
