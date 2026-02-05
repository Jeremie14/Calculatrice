import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class App
{
    public static void main(String[] args)
    {
        //Création de l'afficheur de texte
        JTextField ecran = new JTextField();
        ecran.setBounds(80, 20, 320, 50);
        ecran.setEditable(false);
        ecran.setFont(new Font("Arial", Font.BOLD, 20));


        //Création des boutons
        JButton deleteOne = new JButton("Erase");
        deleteOne.setFont(new Font("Arial", Font.BOLD, 18));
        deleteOne.setBounds(20, 100, 100, 50);
        deleteOne.setBackground(Color.ORANGE);
        deleteOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = ecran.getText();

                if (!currentText.isEmpty()) {
                    ecran.setText(
                        currentText.substring(0, currentText.length() - 1)
                    );
                }
            }
        });

        JButton deleteAll = new JButton("Clear");
        deleteAll.setFont(new Font("Arial", Font.BOLD, 18));
        deleteAll.setBounds(130, 100, 100, 50);
        deleteAll.setBackground(Color.ORANGE);
        deleteAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ecran.setText("");
            }
        });

        JButton modulo = new JButton("%");
        modulo.setFont(new Font("Arial", Font.BOLD, 18));
        modulo.setBounds(240, 100, 100, 50);
        modulo.setBackground(Color.ORANGE);
        modulo.addActionListener(e -> {ecran.setText(ecran.getText() + "%");});

        JButton division = new JButton("/");
        division.setFont(new Font("Arial", Font.BOLD, 18));
        division.setBounds(350, 100, 100, 50);
        division.setBackground(Color.ORANGE);
        division.addActionListener(e -> {ecran.setText(ecran.getText() + "/");});

        JButton button1 = new JButton("1");
        button1.setFont(new Font("Arial", Font.BOLD, 18));
        button1.setBounds(20, 280, 100, 50);
        button1.setBackground(Color.ORANGE);
        button1.addActionListener(e -> {ecran.setText(ecran.getText() + "2");});

        JButton button2 = new JButton("2");
        button2.setBounds(130, 280, 100, 50);
        button2.setBackground(Color.ORANGE);
        button2.addActionListener(e -> {ecran.setText(ecran.getText() + "2");});

        JButton button3 = new JButton("3");
        button3.setBounds(240, 280, 100, 50);
        button3.setBackground(Color.ORANGE);
        button3.addActionListener(e -> {ecran.setText(ecran.getText() + "3");});

        JButton button4 = new JButton("4");
        button4.setBounds(20, 220, 100, 50);
        button4.setBackground(Color.ORANGE);
        button4.addActionListener(e -> {ecran.setText(ecran.getText() + "4");});        

        JButton button5 = new JButton("5");
        button5.setBounds(130, 220, 100, 50);
        button5.setBackground(Color.ORANGE);
        button5.addActionListener(e -> {ecran.setText(ecran.getText() + "5");});

        JButton button6 = new JButton("6");
        button6.setBounds(240, 220, 100, 50);
        button6.setBackground(Color.ORANGE);
        button6.addActionListener(e -> {ecran.setText(ecran.getText() + "6");});

        JButton button7 = new JButton("7");
        button7.setBounds(20, 160, 100, 50);
        button7.setBackground(Color.ORANGE);
        button7.addActionListener(e -> {ecran.setText(ecran.getText() + "7");});

        JButton button8 = new JButton("8");
        button8.setBounds(130, 160, 100, 50);
        button8.setBackground(Color.ORANGE);
        button8.addActionListener(e -> {ecran.setText(ecran.getText() + "8");});

        JButton button9 = new JButton("9");
        button9.setBounds(240, 160, 100, 50);
        button9.setBackground(Color.ORANGE);
        button9.addActionListener(e -> {ecran.setText(ecran.getText() + "9");});

        JButton button0 = new JButton("0");
        button0.setBounds(130, 340, 100, 50);
        button0.setBackground(Color.ORANGE);
        button0.addActionListener(e -> {ecran.setText(ecran.getText() + "0");});

        JButton virgule = new JButton(",");
        virgule.setBounds(240, 340, 100, 50);
        virgule.setBackground(Color.ORANGE);
        virgule.addActionListener(e -> {ecran.setText(ecran.getText() + ",");});

        JButton multiplication = new JButton("x");
        multiplication.setBounds(350, 160, 100, 50);
        multiplication.setBackground(Color.ORANGE);
        multiplication.addActionListener(e -> {ecran.setText(ecran.getText() + "x");});

        JButton soustraction = new JButton("-");
        soustraction.setBounds(350, 220, 100, 50);
        soustraction.setBackground(Color.ORANGE);
        soustraction.addActionListener(e -> {ecran.setText(ecran.getText() + "-");});

        JButton addition = new JButton("+");
        addition.setBounds(350, 280, 100, 50);
        addition.setBackground(Color.ORANGE);
        addition.addActionListener(e -> {ecran.setText(ecran.getText() + "+");});

        JButton egalite = new JButton("=");
        egalite.setBounds(350, 340, 100, 50);
        egalite.setBackground(Color.ORANGE);
        egalite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String storage = ecran.getText();

                ArrayList<Integer> numbers = new ArrayList<>();
                ArrayList<String> signs = new ArrayList<>();

                for (char c : storage.toCharArray()) {
                    if (Character.isDigit(c)) {
                        numbers.add(Character.getNumericValue(c));
                    } else {
                        signs.add(String.valueOf(c));
                    }
                }

                int result = 0;

                switch (signs.get(0)) {
                    case "+":
                        result = numbers.get(0) + numbers.get(1);
                        break;
                    case "-":
                        result = numbers.get(0) - numbers.get(1);
                        break;
                    case "x":
                        result = numbers.get(0) * numbers.get(1);
                        break;
                    case "/":
                        result = numbers.get(0) / numbers.get(1);
                        break;
                }

                ecran.setText(String.valueOf(result));
            }
        });

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
        frame.add(ecran);


        //L'icone de l'application
        ImageIcon image = new ImageIcon("calculatrice.png");
        frame.setIconImage(image.getImage());


        //Couleur du fond d'écran de la calculatrice
        frame.getContentPane().setBackground(new Color(64, 64, 64)); // rgb color
    }
}
