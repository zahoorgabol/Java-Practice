import javax.swing.*;
class Celcius
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" fahr:  ");
int b=Integer.parseInt(a);
int cel=b/32;
JOptionPane.showMessageDialog(null, " cel: " + cel);
}
}