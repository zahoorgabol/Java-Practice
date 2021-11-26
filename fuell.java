import javax.swing.*;
class Fuell
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("miles per gallon:");
int b=Integer.parseInt (a);
int kilometreperlitre=b/2;
JOptionPane.showMessageDialog(null, "KMperlitre:"+kilometreperlitre);}}