import javax.swing.*;
class Troly
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("Load is: " );
int load=Integer.parseInt(a);
int income=load*800;
int driver=150*load;
int tax=income*10/100;
int disel=load*2;
int diselt=disel*105;
int profit=income-(driver+tax+diselt);

JOptionPane.showMessageDialog(null, "total income: " + income + "\n driver takes: " + driver + "\n Total tax: " + tax  
+ "\n Total disel expend: "+ diselt + "\n total profit: " + profit);
}
}