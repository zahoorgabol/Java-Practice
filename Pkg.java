import javax.swing.*;
class Pkg
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" pounds:  ");
int b=Integer.parseInt(a);
int kg=b/2;
JOptionPane.showMessageDialog(null, " kg: " + kg);
}
}