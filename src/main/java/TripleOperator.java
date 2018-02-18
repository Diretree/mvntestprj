import javax.swing.*;

public class TripleOperator {
    public static String tripleOperatortTest() {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Input a number please: "));
        String text = number%2==0?"even":"odd";
        return text;
    }
}
