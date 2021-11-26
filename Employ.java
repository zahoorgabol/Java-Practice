import javax.swing.*;
class Employ
{
public static void main(String ar[])
{
String a=JOptionPane.showInputDialog("Enter the basic pay: " );
int pay=Integer.parseInt(a);
int rent=pay*45/100;
int allowance=pay*15/100;
int bonus=pay*5/100;
int grossPay=pay+(rent+allowance+bonus);
int zakat=pay*3/100;
int tax=pay*8/100;
int sA= pay*5/100;
int netInc=grossPay-(zakat+tax+sA);

JOptionPane.showMessageDialog(null,"rent is: " + rent+ "\n allowance is: " + allowance+ "\n bonus  is: " +
bonus + "\n grossPay is: " + grossPay+ "\n gives zakat: " + zakat+ "\n pays tax: " + tax+ 
"\n survance allowance: " + sA + "\n Net income he has: " + netInc);
}
}
