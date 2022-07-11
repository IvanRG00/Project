
import javax.swing.*;
import java.awt.*;


public class Welcomepage extends JFrame {
    JFrame frame = new JFrame();
    JLabel intro = new JLabel();

    Welcomepage(String username) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome page");
        frame.setLayout(null);
        frame.setSize(450, 450);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0x277f2a));

        intro.setText("Welcome " + username);
        intro.setBounds(155, 95, 130, 39);
        intro.setFont(new Font(null, Font.BOLD, 16));
        intro.setForeground(new Color(0X000));
        intro.setVisible(true);
        frame.add(intro);

    }

}
