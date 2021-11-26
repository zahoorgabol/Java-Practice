import javax.swing.*;
class Decadey
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("years:");
int b=Integer.parseInt (a);
int decades=b/10;
JOptionPane.showMessageDialog(null, "decades:"+ decades);
}
}