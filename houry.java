import javax.swing.*;
class Houry
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("years:");
int b=Integer.parseInt (a);
int hours=b*8760;
JOptionPane.showMessageDialog(null, "hours:"+ hours);
}
}