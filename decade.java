import javax.swing.*;
class Decade
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("decades:");
int b=Integer.parseInt (a);
int years=b*10;
JOptionPane.showMessageDialog(null, "years:"+ years);
}
}