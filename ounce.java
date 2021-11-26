import javax.swing.*;
class Ounce
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" ounces:  ");
int b=Integer.parseInt(a);
int kg=b/35;
JOptionPane.showMessageDialog(null, " kg: " + kg);
}
}