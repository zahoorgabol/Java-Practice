import javax.swing.*;
class Fuel
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("kilo metre per litre:");
int b=Integer.parseInt (a);
int milespergallon=b*2;
JOptionPane.showMessageDialog(null, "miles per gallon:"+milespergallon);}}