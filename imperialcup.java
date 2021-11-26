import javax.swing.*;
class Imperialcup
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" cup:  ");
int b=Integer.parseInt(a);
int litre=b/3;
JOptionPane.showMessageDialog(null, " litre: " + litre);
}
}