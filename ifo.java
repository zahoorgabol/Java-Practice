import javax.swing.*;
class Ifo
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" litre:  ");
int b=Integer.parseInt(a);
int fluid=b*35;
JOptionPane.showMessageDialog(null, " fluid: " + fluid);
}
}