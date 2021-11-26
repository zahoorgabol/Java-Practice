import javax.swing.*;
class Milef
{
public static void main (String ar[])
{
String a=JOptionPane.showInputDialog(" foot:  ");
int b=Integer.parseInt(a);
int miles=b/5280;
JOptionPane.showMessageDialog(null, " miles: " + miles);
}
}