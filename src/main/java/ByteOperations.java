import javax.swing.*;

public class ByteOperations {
    public static int doOperations () {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter any number please. It will be increased by 1: "));
            n++;
            return n;
        } catch (NumberFormatException e) {
            String exceptionMessage = "Invalid symbols";
            JOptionPane.showMessageDialog(null, exceptionMessage);
            return 0;
        }
    }
}
