import javax.swing.*;
class Teas
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" teaspoon:  ");
int b=Integer.parseInt(a);
int litre=b/168;
JOptionPane.showMessageDialog(null, " litre: " + litre);
}
}