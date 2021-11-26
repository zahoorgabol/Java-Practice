import javax.swing.*;
class Gram
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" gram:  ");
int b=Integer.parseInt(a);
int mg=b*1000;
JOptionPane.showMessageDialog(null, " mg: " + mg);
}
}