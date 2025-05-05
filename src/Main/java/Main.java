package Main.java;

import javax.swing.JFrame;
import Main.java.Panel.GamePanel;
public class Main {
    public static void main(String[] args) {

        JFrame windows = new JFrame("Chees game");
        /**
         * premet de pouvoir fermer la fenetre
         */
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * imposible de resize la fenetre
         */
        windows.setResizable(false);

        /**
         * add game panel
         */
        GamePanel gp = new GamePanel();
        windows.add(gp);
        windows.pack();

        /**
         *  permet de faire pop le fenetre au centre du moniteur
         */
        windows.setLocationRelativeTo(null);
        /**
         * permret de rendre visible la fenetre
         */
        windows.setVisible(true);

        gp.luchGame();

    }

}