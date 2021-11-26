import javax.swing.*;
class Minuts
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("total hours");
int b=Integer.parseInt(a);
int hours=60*b;
JOptionPane.showMessageDialog(null, "total minutes are: " + hours);
}}
