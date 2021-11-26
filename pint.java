import javax.swing.*;
class Pint
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" pint:  ");
int b=Integer.parseInt(a);
int litre=b/2;
JOptionPane.showMessageDialog(null, " litre: " + litre);
}
}