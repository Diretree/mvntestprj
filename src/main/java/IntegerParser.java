import javax.swing.*;

public class IntegerParser {
    public static String parseInteger () {
        try {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Input a number please: "));
            String notANumber = JOptionPane.showInputDialog("Input a string with both numbers and letters please: ");
            int intPart = Integer.parseInt(notANumber.replaceAll("[^0-9]", ""));
            String stringPart = String.valueOf(notANumber.replaceAll("\\\\D+", ""));
            String title1 = "Parse result of two inputs";
            int type1 = JOptionPane.WARNING_MESSAGE;
            String parseResult = "First input integer was: " + number + "\n" + "Second input string part was: " + stringPart + "\n" + "Second input integer part was: " + intPart;
            JOptionPane.showMessageDialog(null,parseResult, title1,type1);
            return parseResult;
        }
        catch (NumberFormatException e) {
            String exceptionMessage = "Invalid characters";
            return exceptionMessage;
        }
    }
}