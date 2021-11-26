import javax.swing.*;
class Hw
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("weeks:");
int b=Integer.parseInt (a);
int hour=b*168;
JOptionPane.showMessageDialog(null, "hours:"+ hour);
}
}