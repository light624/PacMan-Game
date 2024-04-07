package fr.eseo.e3e.pdlo.gui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GameWindow extends JFrame {
    private GamePanel gamePanel;

    public GameWindow() {
        setTitle("PacMan Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        
        gamePanel = new GamePanel();
        add(gamePanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}
