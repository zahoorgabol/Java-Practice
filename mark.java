import javax.swing.*;
class Mark
{
public static void  main(String ar[])
{
String a=JOptionPane.showInputDialog("enter java marks: ");
String b=JOptionPane.showInputDialog("enter c++ marks: " );
String d=JOptionPane.showInputDialog("enter c marks: ");
String e=JOptionPane.showInputDialog("enter pathon marks: " );
String f=JOptionPane.showInputDialog("enter PHP marks:");
int java=Integer.parseInt(a);
int cpp=Integer.parseInt(b);
int c=Integer.parseInt(d);
int pathon=Integer.parseInt(e);
int php=Integer.parseInt(f);
int tm=800;
int obt=java+cpp+c+pathon+php;
int percent=obt*100/tm;
JOptionPane.showMessageDialog(null, "Total marks are: " + tm + "\n Obtained marks are:" + obt + "\n Total percentage is: " + percent);}
}

