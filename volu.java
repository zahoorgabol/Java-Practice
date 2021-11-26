import javax.swing.*;
class Volu
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" mm:  ");
int b=Integer.parseInt(a);
int litre=b/1000;
JOptionPane.showMessageDialog(null, " litre: " + litre);
}
}