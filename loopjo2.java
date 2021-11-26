import javax.swing.*;
class loopjo2
{
public static void main(String ar[])
{
String ob=JOptionPane.showInputDialog("enter  table no: " );
int a=Integer.parseInt(ob);
for (int i=1; i<=10; i++)
JOptionPane.showMessageDialog(null,"Table of the no is: " + i+"*"+a+"="+a*i);
}
}