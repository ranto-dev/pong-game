import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.util.Scanner; 
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main {
    static final int GAME_WIDTH = 1200;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.53));

    public static void main(String[] args) {
        JFrame frame_principal = new JFrame();
        frame_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_principal.setSize(GAME_WIDTH, GAME_HEIGHT);
        frame_principal.setBackground(Color.BLACK);
        frame_principal.setVisible(true);
        frame_principal.setLocationRelativeTo(null);

        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.BLACK);
        panel.setForeground(Color.WHITE);
        frame_principal.add( panel);

        JLabel label=new JLabel("PONG GAME");
        label.setFont(new Font("Serif",Font.PLAIN , 100));
        panel.add(label);
        label.setBounds(100, 100, 200, 100);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton play_with_ai=new JButton("~ Play with A.I ~");
        panel.add(play_with_ai);
        play_with_ai.setAlignmentX(Component.CENTER_ALIGNMENT);
        play_with_ai.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame_principal.dispose();
                new GameFrameAI();
            }
        });

        JButton play_with_player=new JButton("Two(2) Players");
        panel.add(play_with_player);
        play_with_player.setAlignmentX(Component.CENTER_ALIGNMENT);
        play_with_player.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame_principal.dispose();
                new GameFrame();
            }
        });
    }
}