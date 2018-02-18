import javax.swing.*;

public class IntegerParser {
    public static void parseInteger () {
        int number = 321;
        String notANumber = "123";
        int aNumber = Integer.parseInt(notANumber);
        String title1 = "Comand Number + NotANumber";
        String title2 = "Comand Number + aNumber";
        int type1 = JOptionPane.ERROR_MESSAGE;
        int type2 = JOptionPane.WARNING_MESSAGE;
        JOptionPane.showMessageDialog(null,number+notANumber,title1,type1);
        JOptionPane.showMessageDialog(null, number+aNumber, title2,type2);
    }
}
