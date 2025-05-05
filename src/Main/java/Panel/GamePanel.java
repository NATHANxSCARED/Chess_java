package Main.java.Panel;

import Main.java.board.Board;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    /**
     * configuration taille de la fenetre
     */
    public static final int WIDTH = 1100;
    public static  final int REIGHT = 800;
    final int FPS = 60;
    Thread gameThread;

    Board board = new Board();

    public GamePanel(){
        setPreferredSize(new Dimension(WIDTH,REIGHT));
        setBackground(Color.black);
    }

    public void luchGame (){
        gameThread = new Thread(this);
        gameThread.start();
    }

    private  void update(){
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        board.draw(g2);
    }

    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while(gameThread != null){
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime)/drawInterval;
            lastTime = currentTime;

            if (delta >=1){
                update();
                repaint();
                delta--;
            }
        }
    }
}
