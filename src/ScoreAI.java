import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ScoreAI extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGTH;
    int player1;
    int player2;

    ScoreAI(int GAME_WIDTH, int GAME_HEIGHT) {
        ScoreAI.GAME_WIDTH = GAME_WIDTH;
        ScoreAI.GAME_HEIGTH = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGTH);

        g.drawString("Player: "+String.valueOf(player1/10) + String.valueOf(player1%10), (GAME_WIDTH/2)-350, 50);
        g.drawString("IA: "+ String.valueOf(player2/10) + String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);
    }
}
