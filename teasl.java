import javax.swing.*;
class Teasl
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" litre:  ");
int b=Integer.parseInt(a);
int teas=b*168;
JOptionPane.showMessageDialog(null, " teas: " + teas);
}
}