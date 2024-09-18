import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PaddleAI extends Rectangle{

    int id;
    int yVelocity;
    int speed = 10;
    int PADDLE_HEIGHT;

    PaddleAI(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
        this.PADDLE_HEIGHT = PADDLE_HEIGHT;
    }

    public void keyPressed(KeyEvent e) {
        if (id == 1) {
                if (e.getKeyCode() == KeyEvent.VK_Z) {
                    setYDirection(-speed);
                    move();
                }

                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }

        }
    }
    public void keyReleased(KeyEvent e) {
        if (id == 1) {
                if (e.getKeyCode() == KeyEvent.VK_Z) {
                    setYDirection(0);
                    move();
                }

                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                    move();
                }
        }
    }

    public void moveTowards(int moveToY) {
        int centerY = y  + PADDLE_HEIGHT / 2;

        if(Math.abs(centerY-moveToY) > 5) {
            if(centerY > moveToY) {
                y -= speed;
            }

            if (centerY < moveToY) {
                y += speed;
            }
        }
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }
    public void move() {
        y = y + yVelocity;
    }
    public void draw(Graphics g) {
        if (id == 1) {
            g.setColor(Color.BLUE);
        } else {
            g.setColor(Color.RED);
        }

        g.fillRect(x, y, width, height);
    }
}
