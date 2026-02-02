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
        //Création du panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBounds(80, 20, 320, 50);

        //Création des boutons
        JButton deleteOne = new JButton("Erase");
        deleteOne.setBounds(20, 100, 100, 50);
        JButton deleteAll = new JButton("Clear");
        deleteAll.setBounds(130, 100, 100, 50);
        JButton modulo = new JButton("%");
        modulo.setBounds(240, 100, 100, 50);
        JButton division = new JButton("/");
        division.setBounds(350, 100, 100, 50);
        JButton button1 = new JButton("1");
        button1.setBounds(20, 280, 100, 50);
        button1.setBackground(Color.ORANGE);
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
        JButton button0 = new JButton("0");
        button0.setBounds(130, 340, 100, 50);
        JButton virgule = new JButton(",");
        virgule.setBounds(240, 340, 100, 50);
        JButton multiplication = new JButton("x");
        multiplication.setBounds(350, 160, 100, 50);
        JButton soustraction = new JButton("-");
        soustraction.setBounds(350, 220, 100, 50);
        JButton addition = new JButton("+");
        addition.setBounds(350, 280, 100, 50);
        JButton egalite = new JButton("=");
        egalite.setBounds(350, 340, 100, 50);

        //Affichage de la calculatrice
        JFrame frame = new JFrame();
        frame.setTitle("Calculatrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(480, 450);
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
        frame.add(button0);
        frame.add(deleteOne);
        frame.add(deleteAll);
        frame.add(modulo);
        frame.add(division);
        frame.add(multiplication);
        frame.add(soustraction);
        frame.add(addition);
        frame.add(egalite);
        frame.add(virgule);
        frame.add(panel);

        //L'icone de l'application
        ImageIcon image = new ImageIcon("calculatrice.png");
        frame.setIconImage(image.getImage());
        //Couleur du fond d'écran de la calculatrice
        frame.getContentPane().setBackground(new Color(64, 64, 64)); // rgb color
    }
}
