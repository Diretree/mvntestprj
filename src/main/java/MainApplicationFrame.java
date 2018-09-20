import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainApplicationFrame extends JFrame {
    private String lastTripleOperatorResultString = " - ";
    private String lastIntegerParserResultString;
    private int lastByteOperationsResultInt;
    private JLabel lastTripleOperatorResult;
    private JLabel lastIntegerParserResult;
    private JLabel lastByteOperationsResult;
    private JButton tripleOperatorResult;
    private JButton byteOperationsResult;
    private JButton integerParserResult;

    public MainApplicationFrame() {
        super("Test Operations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100, 400, 200);
        // Initiate buttons
        integerParserResult = new JButton("Check Integer Parser");
        byteOperationsResult = new JButton("Check Byte Operations");
        tripleOperatorResult = new JButton("Check Triple Operator");
        // Initiate result labels
        lastTripleOperatorResult = new JLabel("Last Triple Operator Result: "+ lastTripleOperatorResultString);
        lastIntegerParserResult = new JLabel("Last Integer Parser Result: "+ lastByteOperationsResultInt);
        lastByteOperationsResult = new JLabel("Last Byte Operations Result: "+ lastByteOperationsResultInt);
        // Initiate panels for buttons and result labels inside main frame
        JPanel buttonsPanel = new JPanel(new GridLayout(2, 1, 1, 1));
        JPanel resultsPanel = new JPanel(new GridLayout(3, 1));
        // Add buttons and labels to main frame
        add(integerParserResult, BorderLayout.NORTH);
        add(byteOperationsResult, BorderLayout.NORTH);
        add(tripleOperatorResult, BorderLayout.NORTH);
        add(lastTripleOperatorResult, BorderLayout.SOUTH);
        add(lastIntegerParserResult, BorderLayout.SOUTH);
        add(lastByteOperationsResult, BorderLayout.SOUTH);
        // Place buttons on button panel
        buttonsPanel.add(byteOperationsResult);
        buttonsPanel.add(tripleOperatorResult);
        buttonsPanel.add(integerParserResult);
        // Add buttons panel to main frame - Layout: NORTH
        add(buttonsPanel, BorderLayout.NORTH);
        // Place result labels on label panel
        resultsPanel.add(lastIntegerParserResult);
        resultsPanel.add(lastTripleOperatorResult);
        resultsPanel.add(lastByteOperationsResult);
        // Add result panel to main frame - Layout: SOUTH
        add(resultsPanel, BorderLayout.SOUTH);

        // On-click action for Byte Operations Button
        byteOperationsResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lastByteOperationsResultInt = ByteOperations.postfixIncrease();
                JOptionPane.showMessageDialog(null, "Result was " + lastByteOperationsResultInt + "!");
                updateByteOperationsResult();
            }
        });

        // On-click action for Triple Operator Button
        tripleOperatorResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lastTripleOperatorResultString = TripleOperator.tripleOperatortTest();
                JOptionPane.showMessageDialog(null,lastTripleOperatorResultString);
                updateTripleOperatorResult();
            }
        });

        integerParserResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lastIntegerParserResultString = IntegerParser.parseInteger();
                updateIntegerParserResult();
            }
        });
    }

    private void updateTripleOperatorResult() {
        lastTripleOperatorResult.setText("Last Triple Operator Result: " + lastTripleOperatorResultString);
    }

    private void updateByteOperationsResult() {
        lastByteOperationsResult.setText("Last Byte Operations Result: "+ lastByteOperationsResultInt);
    }

    private void updateIntegerParserResult() {
        lastIntegerParserResult.setText("Last Integer Parser Result: " + "\n" + lastIntegerParserResultString);
    }
}
