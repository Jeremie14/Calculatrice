import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Calculatrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("calculatrice.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(160, 160, 160));
    }
}
