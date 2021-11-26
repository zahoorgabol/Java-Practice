import javax.swing.*;
class Hourr
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog("hours:");
int b=Integer.parseInt(a);
int week=b/168;
JOptionPane.showMessageDialog(null, "week:" + week);
}}