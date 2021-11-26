import java.util.*;
class Trolly
{
public static void main(String ar[])
{
Scanner rs=new Scanner(System.in);
System.out.print("enter loads: " );
int load=rs.nextInt();
int income=load*800;
int driver=150*load;
int tax=10*income/100;
int disel=load*2;
int diselRate=105*disel;
int totalProfit=income-(driver+tax+diselRate);

System.out.print("total loads: " + load + "\n total income : " + income + "\n driver takes: " + driver + "\n tax is: " + tax + "\n total disel expend:" + diselRate+ "\n total profit is : " + totalProfit);
}
}
