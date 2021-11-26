import javax.swing.*;
class lop
{
public static void main (String ar [])
{
	String ob=JOptionPane.showInputDialog("Enter a number:");
	int a=Integer.parseInt(ob);
for(int i=1; i<=a; i++)
JOptionPane.showMessageDialog(null,"the square of the the given number upto itself is: " + i*i);
}
}