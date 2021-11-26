import javax.swing.*;
class Pintlitre
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" litre:  ");
int b=Integer.parseInt(a);
int pint=b*2;
JOptionPane.showMessageDialog(null, " pint: " + pint);
}
}