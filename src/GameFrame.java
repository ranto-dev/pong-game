import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    GamePanelAI panelAI;
    GamePanel panelPlayer;

    GameFrame() {
        panelPlayer = new GamePanel();
        this.add(panelPlayer);
        this.setTitle("Ping pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
