import javax.swing.*;
class Masss
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("Pounds");
int b=Integer.parseInt(a);
int c=b/200;
JOptionPane.showMessageDialog(null, "ton"+c);
}
}