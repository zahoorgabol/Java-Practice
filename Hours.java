import  javax.swing.*;
class Days
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("days:");
int b=Integer.parseInt(a);
int hour=b/24;
JOptionPane.showMessageDialog(null, "hours:"+hour);
}}