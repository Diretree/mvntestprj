import javax.swing.*;

public class TripleOperator {
    public static String tripleOperatortTest() {
        try {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Input a number please: "));
            String result = number % 2 == 0 ? "even" : "odd";
            String resultText = "You entered " + result + " number!";
            return resultText;
        }
        catch (NumberFormatException e) {
            String exceptionMessage = "Invalid symbols";
            return exceptionMessage;
        }
    }
}