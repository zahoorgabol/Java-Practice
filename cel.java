import javax.swing.*;
class Cel
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" celcius:  ");
int b=Integer.parseInt(a);
int kelvin=b*274;
JOptionPane.showMessageDialog(null, " kelvin: " + kelvin);
}
}