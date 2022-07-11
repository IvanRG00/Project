import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login implements ActionListener {

    JFrame frame = new JFrame();

    JLabel introlabel = new JLabel();
    JLabel namelabel = new JLabel("Name:");
    JTextField namefield = new JTextField();

    JLabel passwordlabel = new JLabel("Password:");
    JPasswordField passwordfield = new JPasswordField();

    JButton loginbutton = new JButton("Login");
    JButton resetbutton = new JButton("Reset");


    JLabel message = new JLabel();
    HashMap<String, String> login;


    Login(HashMap<String, String> logininfocopy) {
        login = logininfocopy;

        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 450);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0x277f2a));
        frame.setTitle("Login panel");

        frame.add(introlabel);

        frame.add(namelabel);
        frame.add(namefield);

        frame.add(passwordlabel);
        frame.add(passwordfield);

        frame.add(loginbutton);
        frame.add(resetbutton);

        frame.add(message);


        introlabel.setBounds(140, 40, 130, 79);
        introlabel.setFont(new Font(null, Font.BOLD, 24));
        introlabel.setText("User login");

        namelabel.setBounds(175, 100, 45, 45);
        namefield.setBounds(145, 130, 95, 18);

        passwordlabel.setBounds(165, 130, 65, 54);
        passwordfield.setBounds(145, 170, 95, 18);

        loginbutton.setBounds(145, 191, 95, 21);
        loginbutton.setFocusable(false);
        loginbutton.addActionListener(this);

        resetbutton.setBounds(145, 211, 95, 21);
        resetbutton.setFocusable(false);
        resetbutton.addActionListener(this);


        message.setFont(new Font(null, Font.BOLD, 12));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetbutton) {
            namefield.setText("");
            passwordfield.setText("");
        }
        if (e.getSource() == loginbutton) {
            String username = namefield.getText();
            String password = String.valueOf(passwordfield.getPassword());

            if (login.containsKey(username)) {
                if (login.get(username).equals(password)) {
                    message.setBounds(145, 290, 190, 45);
                    System.out.println("Login succesful");
                    frame.setVisible(false);
                    Welcomepage welcomepage = new Welcomepage(username);
                } else {
                    message.setBounds(127, 290, 190, 45);
                    message.setForeground(Color.black);
                    message.setText("Wrong username/password");
                }
            } else {
                message.setBounds(140, 290, 190, 45);
                message.setForeground(Color.black);
                message.setText("Username not found");
            }


        }
    }
}
