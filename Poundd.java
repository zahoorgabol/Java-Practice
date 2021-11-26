import javax.swing.*;
class Poundd
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("POUND:");
int b=Integer.parseInt(a);
int Stone=b*3;
JOptionPane.showMessageDialog(null, "stone: "+ Stone);
}
}