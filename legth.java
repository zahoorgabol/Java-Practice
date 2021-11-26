import javax.swing.*;
class Legth
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" cm:  ");
int b=Integer.parseInt(a);
int mm=b*10000;
JOptionPane.showMessageDialog(null, "microm: " + mm);
}
}