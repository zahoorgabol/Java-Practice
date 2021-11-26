import javax.swing.*;
class Tablelit
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" litre:  ");
int b=Integer.parseInt(a);
int ts=b*56;
JOptionPane.showMessageDialog(null, " tablespoon: " + ts);
}
}