import javax.swing.*;
class Length
{ public static void main(String ar[])
{String a=JOptionPane.showInputDialog("centimetre:");
int b=Integer.parseInt (a);
int mm=b*10;
JOptionPane.showMessageDialog(null, "mm:"+ mm);
}
}