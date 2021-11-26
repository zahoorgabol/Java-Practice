import javax.swing.*;
class Year
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("minutes:");
int b=Integer.parseInt (a);
int year=b/525600;
JOptionPane.showMessageDialog(null, "year:"+ year);
}
}