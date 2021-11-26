import javax.swing.*;
class Mg
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" mg:  ");
int b=Integer.parseInt(a);
int gram=b/1000;
JOptionPane.showMessageDialog(null, " gram: " + gram);
}
}