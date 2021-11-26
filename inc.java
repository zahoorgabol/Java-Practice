import javax.swing.*;
class Inc
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" foot:  ");
int b=Integer.parseInt(a);
int inch=b*12;
JOptionPane.showMessageDialog(null, " inches: " + inch);
}
}