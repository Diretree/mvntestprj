import javax.swing.*;

public class TripleOperator {
    public static void tripleOperatortTest() {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Input a number please: "));
        String text = number%2==0?"even":"odd";
        JOptionPane.showMessageDialog(null,"You entered "+text+" number!");
    }
}
