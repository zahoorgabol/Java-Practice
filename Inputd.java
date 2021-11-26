import javax.swing.*;
class Inputd
{
public static void main (String ar[])
{
String name=JOptionPane.showInputDialog("Enter your name plz! ");
String University=JOptionPane.showInputDialog("Enter your university name: ");
String dept=JOptionPane.showInputDialog("Enter your dept name: ");
String rollNo=JOptionPane.showInputDialog("Enter your roll no:");
JOptionPane.showMessageDialog(null, "your name is: " + name);
JOptionPane.showMessageDialog(null, " your university name is : " + University);
JOptionPane.showMessageDialog(null, "your dept is: " + dept);
JOptionPane.showMessageDialog(null, "Your roll no. is : " + rollNo);
}
}