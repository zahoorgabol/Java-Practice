import javax.swing.*;
class Kg
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" g:  ");
int b=Integer.parseInt(a);
int kg=b/1000;
JOptionPane.showMessageDialog(null, " kg: " + kg);
}
}