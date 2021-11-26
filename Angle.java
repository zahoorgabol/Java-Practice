import javax.swing.*;
class Angle
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("degree:");
int degree=Integer.parseInt(a);
int rad=degree*3/180;
JOptionPane.showMessageDialog(null,"degree: " + rad);
}
}
