import javax.swing.*;
class Speed
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("metre per secnd:");
int b=Integer.parseInt (a);
int kmPerHour=b*4;
JOptionPane.showMessageDialog(null, "Km per hour:"+kmPerHour);}}