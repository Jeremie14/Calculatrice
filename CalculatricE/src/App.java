import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;

public class App 
{
    public static void main(String[] args)
    {
        JButton button = new JButton();
        button.setBounds(50, 50, 100, 50);
        JFrame frame = new JFrame();
        frame.setTitle("Calculatrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(button);

        ImageIcon image = new ImageIcon("calculatrice.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(160, 160, 160)); // rgb color
    }
}
