import javax.swing.*;
class Temperature
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" fahr:  ");
int b=Integer.parseInt(a);
int kelvin=b*255;
JOptionPane.showMessageDialog(null, " kelvin: " + kelvin);
}
}