import javax.swing.*;
class Dys
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("days:");
int b=Integer.parseInt (a);
int hours=b*24;
JOptionPane.showMessageDialog(null, "hours:"+ hours);
}
}