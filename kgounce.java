import javax.swing.*;
class Kgounce
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" kg:  ");
int b=Integer.parseInt(a);
int ounce=b*35;
JOptionPane.showMessageDialog(null, " ounces: " + ounce);
}
}