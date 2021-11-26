import javax.swing.*;
class Vol
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" litre:  ");
int b=Integer.parseInt(a);
int mm=b*1000;
JOptionPane.showMessageDialog(null, " mm: " + mm);
}
}