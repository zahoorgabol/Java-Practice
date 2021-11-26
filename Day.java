import javax.swing.*;
class Day
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog("week:");
int b=Integer.parseInt(a);
int Day=b*7;
JOptionPane.showMessageDialog(null,"Day: "+ Day);
}
}