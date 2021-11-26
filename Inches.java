import  javax.swing.*;
class Inches
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("enter 1st value");
String b=JOptionPane.showInputDialog("enter 2nd value");
int Totalinches=Integer.parseInt(a);
int InchesInfeet=Integer.parseInt(b);
int Feet=Totalinches/InchesInfeet;
JOptionPane.showMessageDialog(null, "Total feet are : " + Feet);

}}