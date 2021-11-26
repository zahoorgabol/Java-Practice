import javax.swing.*;
class Speedd
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("km per hour:");
int b=Integer.parseInt (a);
int metrePerSecond=b/4;
JOptionPane.showMessageDialog(null, "metre per second:"+ metrePerSecond);}}