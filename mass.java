import javax.swing.*;
class Mass
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" kg:  ");
int b=Integer.parseInt(a);
int g=b*1000;
JOptionPane.showMessageDialog(null, " g: " + g);
}
}