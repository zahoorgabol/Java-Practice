import javax.swing.*;
class Incf
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" inches:  ");
int b=Integer.parseInt(a);
int foot=b/12;
JOptionPane.showMessageDialog(null, " foot: " + foot);
}
}