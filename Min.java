import javax.swing.*;
class Min
{
public static void main( String ar[])
{
String a=JOptionPane.showInputDialog("hours");
int b=Integer.parseInt(a);
int min=b*60;
JOptionPane.showMessageDialog(null, "minutes: " +min);
}}