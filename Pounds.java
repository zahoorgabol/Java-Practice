import  javax.swing.*;
class Pounds 
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("pounds:");
int b= Integer.parseInt(a);
int c=b/2;
JOptionPane.showMessageDialog(null, "total pounds;" + c);
}
}