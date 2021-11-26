import javax.swing.*;
class loopjo7
{
public static void main(String ar[])
{
String ob=JOptionPane.showInputDialog("enter a number:");
int a=Integer.parseInt(ob);
JOptionPane.showMessageDialog(null, "NUmb"+"-"+"Sqr"+"-"+"Cube");
for (int i=1; i<=a; i++)
JOptionPane.showMessageDialog(null, i+"-"+i*i+"-"+i*i*i);
}
}
