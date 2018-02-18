import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ByteOperationsFrame extends JFrame{
    private String lastTripleOperationsResultString = " - ";
    private JLabel lastTripleOperationsResult;
    private String lastIteratorResultString = " - ";
    private JLabel lastIteratorResult;
    private JButton tripleOperatorResult;
    private JButton showResult;

    public ByteOperationsFrame() {
        super("Test Operations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100, 400, 200);
        showResult = new JButton("Check Iterator");
        tripleOperatorResult = new JButton("Check Triple Operator");
        lastTripleOperationsResult = new JLabel("Last Triple Operator Result: "+lastTripleOperationsResultString);
        lastIteratorResult = new JLabel("Last Iterator Result: "+lastIteratorResultString);
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        JPanel resultsPanel = new JPanel(new GridLayout(2, 1));
        add(showResult, BorderLayout.NORTH);
        add(tripleOperatorResult, BorderLayout.NORTH);
        add(lastTripleOperationsResult, BorderLayout.SOUTH);
        add(lastIteratorResult, BorderLayout.SOUTH);
        buttonsPanel.add(showResult);
        buttonsPanel.add(tripleOperatorResult);
        add(buttonsPanel, BorderLayout.NORTH);
        resultsPanel.add(lastIteratorResult);
        resultsPanel.add(lastTripleOperationsResult);
        add(resultsPanel, BorderLayout.SOUTH);

        showResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lastIteratorResultString = String.valueOf(ByteOperations.doOperations());
                JOptionPane.showMessageDialog(null, "Result is: "+lastIteratorResultString);
                updateIteratorResult();
            }
        });

        tripleOperatorResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lastTripleOperationsResultString = TripleOperator.tripleOperatortTest();
                JOptionPane.showMessageDialog(null,"You entered "+lastTripleOperationsResultString+" number!");
                updateTripleOperatorResult();
            }
        });
    }

    private void updateTripleOperatorResult() {
        lastTripleOperationsResult.setText("Last Triple Operator Result: You entered "+lastTripleOperationsResultString+" number!");
    }

    private void updateIteratorResult() {
        lastIteratorResult.setText("Last Iterator Result: "+lastIteratorResultString);
    }
}
