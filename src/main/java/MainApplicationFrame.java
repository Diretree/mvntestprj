import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainApplicationFrame extends JFrame {
    private String lastTripleOperatorResultString = " - ";
    private JLabel lastTripleOperatorResult;
    private String lastIteratorResultString = " - ";
    private JLabel lastIteratorResult;
    private JButton tripleOperatorResult;
    private JButton byteOperationsResult;

    public MainApplicationFrame() {
        super("Test Operations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100, 400, 200);
        byteOperationsResult = new JButton("Check Iterator");
        tripleOperatorResult = new JButton("Check Triple Operator");
        lastTripleOperatorResult = new JLabel("Last Triple Operator Result: "+lastTripleOperatorResultString);
        lastIteratorResult = new JLabel("Last Iterator Result: "+lastIteratorResultString);
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        JPanel resultsPanel = new JPanel(new GridLayout(2, 1));
        add(byteOperationsResult, BorderLayout.NORTH);
        add(tripleOperatorResult, BorderLayout.NORTH);
        add(lastTripleOperatorResult, BorderLayout.SOUTH);
        add(lastIteratorResult, BorderLayout.SOUTH);
        buttonsPanel.add(byteOperationsResult);
        buttonsPanel.add(tripleOperatorResult);
        add(buttonsPanel, BorderLayout.NORTH);
        resultsPanel.add(lastIteratorResult);
        resultsPanel.add(lastTripleOperatorResult);
        add(resultsPanel, BorderLayout.SOUTH);

        byteOperationsResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ByteOperations byteOperationsFrame = new ByteOperations();
                byteOperationsFrame.setVisible(true);
                byteOperationsFrame.setResizable(false);
            }
        });

        tripleOperatorResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lastTripleOperatorResultString = TripleOperator.tripleOperatortTest();
                JOptionPane.showMessageDialog(null,"You entered "+lastTripleOperatorResultString+" number!");
                updateTripleOperatorResult();
            }
        });
    }

    private void updateTripleOperatorResult() {
        lastTripleOperatorResult.setText("Last Triple Operator Result: You entered "+lastTripleOperatorResultString+" number!");
    }

    private void updateIteratorResult() {
        String byteOperationsResultString = String.valueOf(ByteOperations.updateByteOperationsResult());
        lastIteratorResult.setText("Last Iterator Result:"+byteOperationsResultString);
    }
}
