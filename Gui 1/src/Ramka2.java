import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.DefaultMenuLayout;

public class Ramka2 extends JFrame {

    JLabel jl = new JLabel();
    JLabel Creator = new JLabel();
    private JLabel timelable;
    private JLabel daylable;
    private JLabel datelable;


    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;

    private String currenttime;
    private String currentday;
    private String currentdate;


    Ramka2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Summer Clock");
        this.setLayout(new FlowLayout());
        this.setSize(650, 420);
        this.setResizable(false);
        this.setVisible(true);


        timeFormat = new SimpleDateFormat("hh:mm:ss");
        timelable = new JLabel();
        timelable.setFont(new Font("Olympic", Font.CENTER_BASELINE, 25));
        timelable.setForeground(new Color(0x0000));
        timelable.setOpaque(true);
        add(timelable);
        timelable.setVisible(true);


        dayFormat = new SimpleDateFormat("E");
        daylable = new JLabel();
        daylable.setFont(new Font("Buzz", Font.CENTER_BASELINE, 25));
        daylable.setForeground(new Color(0x0000));
        daylable.setOpaque(true);
        add(daylable);
        daylable.setVisible(true);


        dateFormat = new SimpleDateFormat(("dd.MM.yyyy"));
        datelable = new JLabel();
        datelable.setFont(new Font("Air", Font.CENTER_BASELINE, 25));
        datelable.setForeground(new Color(0x0000));
        datelable.setOpaque(true);
        add(datelable);
        datelable.setVisible(true);

        Creator.setSize(250, 250);
        Creator.setFont(new Font("Create", Font.ITALIC, 15));
        Creator.setVisible(true);
        Creator.setText("Created by Ivan");
        Creator.setForeground(new Color(0x00000));
        add(Creator);
        Creator.setOpaque(true);


        jl.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Downloads\\image\\by-the-sea.png"));
        jl.setSize(250, 240);
        jl.setFont(new Font("Style", Font.CENTER_BASELINE, 23));
        jl.setVisible(true);
        add(jl);

        settime();

    }

    private void settime() {
        while (true) {
            currenttime = timeFormat.format(Calendar.getInstance().getTime());
            timelable.setText(currenttime);

            currentday = dayFormat.format(Calendar.getInstance().getTime());
            daylable.setText(currentday);

            currentdate = dateFormat.format(Calendar.getInstance().getTime());
            datelable.setText(currentdate);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}