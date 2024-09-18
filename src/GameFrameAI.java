import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrameAI extends JFrame {

    GamePanelAI panelAI;

    GameFrameAI() {
        panelAI = new GamePanelAI();
        this.add(panelAI);
        this.setTitle("Ping pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
