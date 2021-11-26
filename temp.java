import javax.swing.*;
class Temp
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" cel:  ");
int b=Integer.parseInt(a);
int fahr=b*32;
JOptionPane.showMessageDialog(null, " fahrenheit: " + fahr);
}
}