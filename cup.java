import javax.swing.*;
class Cup
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" litre:  ");
int b=Integer.parseInt(a);
int cup=b*3;
JOptionPane.showMessageDialog(null, " cup: " + cup);
}
}