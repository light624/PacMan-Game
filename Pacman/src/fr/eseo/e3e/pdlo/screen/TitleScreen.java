package fr.eseo.e3e.pdlo.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TitleScreen extends JPanel implements KeyListener {

    private Image titleImage;
    public TitleScreen() {
       
        titleImage = new ImageIcon(getClass().getResource("../ressources/images/titleScreen.jpg")).getImage();
        addKeyListener(this);
        setFocusable(true);
        setPreferredSize(new Dimension(titleImage.getWidth(null), titleImage.getHeight(null)));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
      g.drawImage(titleImage, 0, 0, this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
     if (e.getKeyCode() == KeyEvent.VK_N) {
           System.out.println("Création du labyrinthe...");
           
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

  
    public void setFrame(JFrame frame) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pac-Man");
            TitleScreen titleScreen = new TitleScreen();
            titleScreen.setFrame(frame);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(titleScreen);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
