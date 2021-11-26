import javax.swing.*;
class Gallon
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" gallon:  ");
int b=Integer.parseInt(a);
int litre=b*4;
JOptionPane.showMessageDialog(null, " litre: " + litre);
}
}