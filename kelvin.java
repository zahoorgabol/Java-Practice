import javax.swing.*;
class Kelvin
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" Kelvin:  ");
int b=Integer.parseInt(a);
int cel=b/273;
JOptionPane.showMessageDialog(null, " cel: " + cel);
}
}