import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SnakeGame  extends JPanel{
    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    int boardWidth;
    int boardHeight;
    int tileSize = 25;

    //SNAKE
    Tile snakeHead; 

    //FOOD
    Tile food;

    SnakeGame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardWidth;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);

        snakeHead = new Tile(5, 5);

        food = new Tile(10, 10);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
         //GRID
         for (int i = 0; i < boardWidth/tileSize; i++){
            g.drawLine(i * tileSize, 0, i * tileSize, boardHeight);
            g.drawLine(0, i * tileSize, boardWidth, i * tileSize);
         }
         //FOOD
         g.setColor(Color.red);
         g.fillRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize);
        //SNAKE
        g.setColor(Color.green);
        g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize);
    }
}
