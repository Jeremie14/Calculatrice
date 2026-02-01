import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
//import java.awt.event.ActionListener;

public class App 
{
    public static void main(String[] args)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBounds(125, 20, 250, 50);

        JButton deleteOne = new JButton("Erase");
        deleteOne.setBounds(20, 100, 100, 50);
        JButton deleteAll = new JButton("Delete");
        deleteAll.setBounds(130, 100, 100, 50);
        JButton modulo = new JButton("%");
        modulo.setBounds(240, 100, 100, 50);
        JButton division = new JButton("/");
        division.setBounds(350, 100, 100, 50);
        JButton button1 = new JButton("1");
        button1.setBounds(20, 280, 100, 50);
        JButton button2 = new JButton("2");
        button2.setBounds(130, 280, 100, 50);
        JButton button3 = new JButton("3");
        button3.setBounds(240, 280, 100, 50);
        JButton button4 = new JButton("4");
        button4.setBounds(20, 220, 100, 50);
        JButton button5 = new JButton("5");
        button5.setBounds(130, 220, 100, 50);
        JButton button6 = new JButton("6");
        button6.setBounds(240, 220, 100, 50);
        JButton button7 = new JButton("7");
        button7.setBounds(20, 160, 100, 50);
        JButton button8 = new JButton("8");
        button8.setBounds(130, 160, 100, 50);
        JButton button9 = new JButton("9");
        button9.setBounds(240, 160, 100, 50);
        /*JButton button0 = new JButton("0");
        button1.setBounds(50, 100, 100, 50);*/

        JFrame frame = new JFrame();
        frame.setTitle("Calculatrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        //frame.add(button0);
        frame.add(deleteOne);
        frame.add(deleteAll);
        frame.add(modulo);
        frame.add(division);
        frame.add(panel);

        ImageIcon image = new ImageIcon("calculatrice.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(160, 160, 160)); // rgb color
    }
}
