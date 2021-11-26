import javax.swing.*;
class Fyard
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" yard:  ");
int b=Integer.parseInt(a);
int foot=b*3;
JOptionPane.showMessageDialog(null, " foot: " + foot);
}
}