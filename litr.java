import javax.swing.*;
class Litr
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" litre:  ");
int b=Integer.parseInt(a);
int gallon=b/4;
JOptionPane.showMessageDialog(null, " gallon: " + gallon);
}
}