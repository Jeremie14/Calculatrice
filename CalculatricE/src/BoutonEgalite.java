import java.util.*;

public class BoutonEgalite {
        public static double evaluate(String expr) {
        List<String> postfix = toPostfix(expr);
        return evalPostfix(postfix);
    }

    /* ================= INFIX → POSTFIX ================= */

    private static List<String> toPostfix(String expr) {
        List<String> output = new ArrayList<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < expr.length(); ) {
            char c = expr.charAt(i);

            // Skip spaces
            if (Character.isWhitespace(c)) {
                i++;
                continue;
            }

            // Number (decimal + unary minus)
            if (Character.isDigit(c) || c == '.' ||
               (c == '-' && (i == 0 || "+-*/(".indexOf(expr.charAt(i - 1)) >= 0))) {

                StringBuilder num = new StringBuilder();
                num.append(c);
                i++;

                while (i < expr.length() &&
                      (Character.isDigit(expr.charAt(i)) || expr.charAt(i) == '.')) {
                    num.append(expr.charAt(i++));
                }

                output.add(num.toString());
                continue;
            }

            // Operator
            if ("+-*/".indexOf(c) >= 0) {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(c)) {
                    output.add(String.valueOf(ops.pop()));
                }
                ops.push(c);
                i++;
                continue;
            }

            // Left parenthesis
            if (c == '(') {
                ops.push(c);
                i++;
                continue;
            }

            // Right parenthesis
            if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    output.add(String.valueOf(ops.pop()));
                }
                ops.pop(); // remove '('
                i++;
                continue;
            }

            throw new IllegalArgumentException("Invalid character");
        }

        while (!ops.isEmpty()) {
            output.add(String.valueOf(ops.pop()));
        }

        return output;
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    /* ================= POSTFIX EVALUATION ================= */

    private static double evalPostfix(List<String> postfix) {
        Stack<Double> stack = new Stack<>();

        for (String token : postfix) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();

                switch (token.charAt(0)) {
                    case '+' -> stack.push(a + b);
                    case '-' -> stack.push(a - b);
                    case '*' -> stack.push(a * b);
                    case '/' -> stack.push(a / b);
                }
            }
        }

        return stack.pop();
    }

    private static boolean isNumber(String s) {
        return Character.isDigit(s.charAt(0)) || s.charAt(0) == '-' || s.charAt(0) == '.';
    }    
}
