import javax.swing.*;
class loopjo6
{
public static void main(String ar[])
{
String ob=JOptionPane.showInputDialog("enter a number: " );
//JOptionPane.showMessageDialog(null,"Number" + "-" + "square");
int a=Integer.parseInt(ob);
JOptionPane.showMessageDialog(null,"Number" + "-" + "square");

for(int i=1; i<=a; i++)
JOptionPane.showMessageDialog(null, i + "-"+ i*i);
}
}
