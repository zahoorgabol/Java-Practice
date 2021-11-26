import javax.swing.*;
class Hm
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("minutes:");
int b=Integer.parseInt (a);
int hour=b/60;
JOptionPane.showMessageDialog(null, "hour:"+ hour);
}
}