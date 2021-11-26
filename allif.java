import java.util.*;
class allif
{
	public static void main(String ar[])
	{
		Scanner ob=new Scanner (System.in);
		System.out.print("enter your choice/selection:"); //we will give input to find the options we can have.
int a=ob.nextInt();
if (a==1)
{
System.out.println("marksheet!" ); //if 1 button will be hit, marksheet will be displayed. we also have other buttons to hit to have other outputs.
System.out.print("enter java marks:");
int java=ob.nextInt();
System.out.print("enter c++ marks: ");
int cpp=ob.nextInt();
System.out.print("enter c marks: ");
int c=ob.nextInt();
System.out.print("enter pathon marks: " );
int pathon=ob.nextInt();
System.out.print("enter php marks: " );
int php=ob.nextInt();
int obt=(java+cpp+c+pathon+php);
int m=500;
int per=obt*100/m;
System.out.println("obtained marks are: " +obt);
System.out.println("Total  marks are: " + m);
System.out.println("Percentage is : " + per);
}
if(a==2)
{System.out.println("ATM! " );
System.out.print("enter a certain value:" );
int val=ob.nextInt();
int f=val/5000;
int rr=val%5000; //the variables are taken on the bases of self understanding. so dont be confused!
int t=rr/1000;
int rd=rr%1000;
int fh=rd/500;
int bv=rd%500;
int h=bv/100;
int rh=bv%100;
int fif=rh/50;
int rf=rh%50;
int twenty=rf/20;
int rt=rf%20;
int ten=rt/10;
int rv=rt%10;
int fiv=rv/5;
int rfiv=rv%5;
int two=rfiv/2;
int rtwo=rfiv%2;    //we can als0 give an other variable but its perfect here what  i made. remaining value is the coin of one rupee
System.out.println("No of 5 thousands note is: " + f);
System.out.println("No of 1 thousand notes is: " + t);
System.out.println("No of 5 hundred notes is : " + fh);
System.out.println("No of 1 hundred notes is : " + h);
System.out.println("No of fifty rupee note: " + fif);
System.out.println("NO of twenty rupee notes is :" + twenty);
System.out.println("No of ten rupee note is :" + ten );
System.out.println("No of 5 rupee coin  is: "  + fiv);
System.out.println("No of 2 rupee coin  is : " + two);
System.out.println("No of 1 rupee coin is: " + rtwo);}

if (a==3)
{
	System.out.println("Trolly load and its expenditures");
System.out.print("Enter the load: " );
int load=ob.nextInt();
int income=800*load;
int driver=150*load;
int tax=income*10/100;
int litre=load*2;
int disel=litre*105;
int profit=income-(driver+tax+disel);
System.out.println("total income is: " + income);
System.out.println("driver  takes: " + driver);
System.out.print("pay taxes:" + tax);
System.out.println("Disel expenditure: " + disel);
System.out.println("total profit : " + profit);
}

if(a==4)
{
	System.out.println("Employee's salary and expenditure calculation!");
	System.out.print("Enter the employee's salary: " );
	int pay=ob.nextInt();
	int rent=pay*45/100;
	int mA=pay*15/100;
	int bonus=pay*5/100;
	int grossPay=pay+rent+mA+bonus;
	int zakat=3*pay/100;
	int incTax=8*pay/100;
	int surAllowance=5*pay/100;
	int netInc=grossPay-(zakat+incTax+surAllowance);
System.out.println("Pay for rent: " + rent);
System.out.println("Medical Allowance: " + mA);
System.out.println("total bonus: "+ bonus);
System.out.println("Total gross salary is: " + grossPay);
System.out.println("gives zakat: " + zakat);
System.out.println("total tax he pay: " + incTax);
System.out.println("Total survance allowances: " + surAllowance);
System.out.println("Total net income is: " + netInc);
}
	if(a==5)
	{
		System.out.println("Calculator!");
		System.out.print("give 1st no: " );
		int no1=ob.nextInt();
		System.out.print("enter 2nd no: " );
		int no2=ob.nextInt();
		System.out.print("enter your choice:" );
		int b=ob.nextInt();
		if(b==1)
		{
			System.out.println("Addition is: "+ (no1+no2));
		}
		if(b==2)
		{System.out.println("Subtraction of the numbers is: " + (no1-no2));}
	if (b==3)
	{System.out.println("Multiplication of the numbers  is: " + (no1*no2));}
if (b==4)
{System.out.println("division  of the numbers is: " + (no1/no2));}
if(b==5)
{System.out.println("remainder of the nnumbers is: " + (no1%no2));}
if (b>=6)
	{System.out.println("invalid choice!");}}

if(a==6)
{System.out.println("unit convertor!");
System.out.print("enter your choice: ");
int c=ob.nextInt();
if(c==1)
{System.out.println("kilo to gram " );
System.out.println("enter kilogram: " );
int kilo=ob.nextInt();
int gram=kilo*1000;
System.out.print("grams are: " + gram);}
if(c==2)
{
	System.out.print("gram to kilo");
	System.out.print("enter grams: " );
	int gram =ob.nextInt();
	int kilo=gram/1000;
	System.out.print("total kg are: " + kilo);}
	if (c==3){
		System.out.println("seconds to mints!");
System.out.print("enter the seconds: " );
int sec=ob.nextInt();
int mints=sec/60;
System.out.print("total mints are: " + mints);} 
		
}
if(a>=7)
	System.out.print("Sorry, you hava an Invalid chioce/option!!");}
}