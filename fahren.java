import javax.swing.*;
class Fahren
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" kelvin:  ");
int b=Integer.parseInt(a);
int fahr=b/255;
JOptionPane.showMessageDialog(null, " fahrenheit: " + fahr);
}
}