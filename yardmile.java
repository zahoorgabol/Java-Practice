import javax.swing.*;
class Yardmile
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" miles:  ");
int b=Integer.parseInt(a);
int yard=b*1760;
JOptionPane.showMessageDialog(null, " yard: " + yard);
}
}