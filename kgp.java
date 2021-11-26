import javax.swing.*;
class Kgp
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" kg:  ");
int b=Integer.parseInt(a);
int pound=b*2;
JOptionPane.showMessageDialog(null, " pounds: " + pound);
}
}