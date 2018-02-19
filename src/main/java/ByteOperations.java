import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ByteOperations extends JFrame {
    private JButton postfixIncrementIncrease;
    private JButton prefixIncrementIncrease;
    private JButton postfixIncrementDecrease;
    private JButton prefixIncrementDecrease;

    public ByteOperations () {
        super("Byte Operations");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100,100, 400, 200);

        JPanel buttonsPanel = new JPanel(new FlowLayout());

        postfixIncrementIncrease = new JButton("Test n++");
        add(postfixIncrementIncrease, BorderLayout.CENTER);

        buttonsPanel.add(postfixIncrementIncrease);
        add(buttonsPanel, BorderLayout.NORTH);

        postfixIncrementIncrease.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                postfixIncrease();
            }
        });
    }


    public static int postfixIncrease () {
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

    public static String updateByteOperationsResult () {
        String byteOperationsResultString = "Test";
        return byteOperationsResultString;
    }
}
