import javax.swing.*;

public class MainClass {
public static void main(String args[]) {
    String userName;
    String birthDate;
    userName = JOptionPane.showInputDialog("Please enter your name:");
    JOptionPane.showMessageDialog(null, "Hello, "+userName+"!");
    birthDate = JOptionPane.showInputDialog("Please enter you birth date:");
    JOptionPane.showMessageDialog(null, "Thats nice, here is your birth date: \n"+birthDate+"");
}
}