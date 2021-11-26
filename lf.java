import javax.swing.*;
class Lf
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" fluid:  ");
int b=Integer.parseInt(a);
int litre=b/35;
JOptionPane.showMessageDialog(null, " litre: " + litre);
}
}