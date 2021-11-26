import javax.swing.*;
class Microm
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" mmicrom:  ");
int b=Integer.parseInt(a);
int cm=b/10000;
JOptionPane.showMessageDialog(null, "cm: " + cm);
}
}