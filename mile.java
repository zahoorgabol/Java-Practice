import javax.swing.*;
class Mile
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" miles:  ");
int b=Integer.parseInt(a);
int foot=b*5280;
JOptionPane.showMessageDialog(null, " foot: " + foot);
}
}