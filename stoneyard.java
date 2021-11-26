import javax.swing.*;
class Stoneyard
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" yards:  ");
int b=Integer.parseInt(a);
int miles=b/1760;
JOptionPane.showMessageDialog(null, " miles: " + miles);
}
}