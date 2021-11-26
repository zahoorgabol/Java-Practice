import javax.swing.*;
class Yearh
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("hours:");
int b=Integer.parseInt (a);
int year=b/8760;
JOptionPane.showMessageDialog(null, "years:"+ year);
}
}