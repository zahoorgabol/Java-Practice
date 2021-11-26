import java.util.*;
class Netinc
{
public static void main(String ar[])
{
Scanner pay=new Scanner(System.in);
System.out.print("enter the basic salary: ");
int basic=pay.nextInt();
int houseRent=45*basic/100;
int medicalAll=15*basic/100;
int bonus=5*basic/100;
int grossPay=(basic+houseRent+medicalAll+bonus);

int incomeTax=5*basic/100;
int zakat = 3*basic/100;
int survanceAll=8*basic/100;
int netIncome=grossPay-(incomeTax+zakat+survanceAll);
System.out.print("house Rent is: " + houseRent+ "\n  medical allowance is: " + medicalAll+  "\n  bonus: " + bonus + "\n Gross pay is: "
+ grossPay + "\n income tax is: " + incomeTax + "\n zakat is: " + zakat + "\n survance Allowance is : " + survanceAll + "\n Netincome is: " + netIncome);
}
}


