import java.util.*;
import javax.swing.JTextField;

public class BoutonEgalite {

    private JTextField ecran;

    public BoutonEgalite(JTextField ecran) {
        this.ecran = ecran;
    }

    public Integer method() {
        String text = ecran.getText();

        char operator = ' ';
        int index = -1;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                operator = c;
                index = i;
                break;
            }
        }

        int number1 = Integer.parseInt(text.substring(0, index));
        int number2 = Integer.parseInt(text.substring(index + 1));

        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
            case '%':
                return number1 % number2;
            default:
                return 0;
        }
    }
}

