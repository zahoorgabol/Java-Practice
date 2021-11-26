import javax.swing.*;
class loopjo5
{
public static void main(String ar[])
{
String ob=JOptionPane.showInputDialog("enter the no: " );
int a=Integer.parseInt(ob);
for(int i=0; i<=a; i+=2)
JOptionPane.showMessageDialog(null,"series of even No upto given No:" + i);
}
}
