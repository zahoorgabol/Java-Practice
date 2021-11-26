import  javax.swing.*;
class Hours
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("hours:");
int b=Integer.parseInt(a);
int day=b/24;
JOptionPane.showMessageDialog(null, "days:"+day);
}}