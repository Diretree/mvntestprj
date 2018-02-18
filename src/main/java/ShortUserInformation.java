import javax.swing.*;

public class ShortUserInformation {
    public static void showUserInfo() {
    String userName = "Diretree";
    int userAge = 27;
    char driverLicenceCategory = 'B';
    String text = "Водитель: "+userName;
    text=text+"\n"+"Возраст: "+userAge+" лет";
    text=text+"\n"+"Права категории: "+driverLicenceCategory;
    JOptionPane.showMessageDialog(null, text);
    }
}