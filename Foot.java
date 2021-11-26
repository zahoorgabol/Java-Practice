import javax.swing.*;
class Foot
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("enter the total feet");
int b=Integer.parseInt(a);
int totalinches=b*12;
JOptionPane.showMessageDialog(null, "total inches are: " + totalinches);
}
}