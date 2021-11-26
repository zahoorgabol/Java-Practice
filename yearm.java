import javax.swing.*;
class Yearm
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("years:");
int b=Integer.parseInt (a);
int min=b*525600;
JOptionPane.showMessageDialog(null, "min:"+ min);
}
}