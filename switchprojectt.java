import java.util.*;
class switchprojectt
{
	public static void main(String ar[])
	{
		int num1=0;
		int num2=0;
		
		System.out.println("MARKSHEET=1");
		System.out.println("ATM=2");
		//System.out.println("EMPLOYEE-SALARY=4");
		System.out.println("CALCULATOR=5");
		System.out.println("UNIT-CONVERTOR=6");
Scanner ob=new Scanner (System.in);
System.out.print("Plz,enter your choice: " ); 
int choice=ob.nextInt();
switch(choice)
{
case 1:
System.out.println("MARKSHEET!");
int markss=1000;

	
	System.out.print("Enter  total marks obtained!");
int	marks=ob.nextInt();
int mark=marks/10;
//int percent= mark*100/markss;
switch(mark)
{
	case 10:
	System.out.print("A+");   
	break;

case 9: 
System.out.print("A");
break;

case 8:
System.out.print("B");
break;

case 7: 
System.out.print("C");
break;

case 6:
System.out.print("D");
break;

case 5:
case 4:
case 3:
case 2:
case 1:
case 0:

System.out.print("FAIL");
break;

//int percent=100*mark/markss;

default: 
System.out.println("Invalid marks!");
break;


}


 case 2:
 {
System.out.println("ATM!"); 
System.out.print("enter 1 for output value!");
int value=ob.nextInt();
switch(value)
{case 1:
System.out.println("enter any value: " );
int keemat=ob.nextInt();
int ft=keemat/5000;
int ftr=keemat%5000;
int t=ftr/1000;
int tr=ftr%1000;
int fh=tr/500;
int fhr=tr%500;
int h=fhr/100;
int hr=fhr%100;
int fif=hr/50;
int fifr=hr%50;
int twen=fifr/20;
int twenr=fifr%20;
int ten=twenr/10;
int tenr=twenr%10;
int five=tenr/5;
int fiver=tenr%5;
int two=fiver/2;
int twor=fiver%2;
System.out.println("5 thousands note: " + ft + "\n thousand note: " + t + "\n Five hundred note: " + fh + "\n hundred notes: " + h + "\n fifty rupee notes: " + fif + "\n twenty note: " + twen + "\n ten rup note: " + ten + "\n five rup note: " + five + "\n two rup coin: " + two + "\n one rup: coin " + twor);
break;
 }}
 case 3:
 {
 System.out.print("Calculator");
// int val=ob.nextInt();
 //switch(value)
 
	 System.out.println("hit 1 for addition!");
	 
       System.out.println("hit 2 for subtracation!");
        
System.out.println("hit 3 for multiplication!");


int num=ob.nextInt();
switch(num)
{
case 1:

 num1=ob.nextInt();
 num2=ob.nextInt();
//int num=ob.nextInt();


System.out.print("Addition of the numbers is: " + (num1+num2));
break;

case 2: 

System.out.println("Subtraction of the numbers is: " + (num1-num2));
break;

case 3: 
System.out.print("Multiplication of the numbers is: " + (num1*num2));
break;

default: 
System.out.println("Invalid choice!");
break;
}
 }
	

case 4:
{
	System.out.println("Simple Calander!");
	System.out.print("Enter a month:");
	
	int mon=ob.nextInt();
	switch(mon)
	{
		case 1:
		case 11:
		case 12:
		System.out.println("winter!");
		break;
		case 2:
		case 3:
		case 4:
		System.out.println("Spring");
		break;
		case 5:
		case 6:
		case 7:
		case 8:
		System.out.println("Summmer!");
		break;
		case 9:
		case 10:
		System.out.print("Autumn!");
		break;
		default:
		System.out.println("Invalid month!");
		break;
	}
}	
case 5 :
{
	System.out.println("letter for word: ie; a for ant");
	
System.out.print("Enter an alphabet!");
int alpha=ob.next().charAt(0);
switch(alpha)
{
	case 'a':
	case 'A':
	System.out.print("Apple");
	break;
	case 'b':
	case 'B':
	System.out.println("b for bat");
	break;
	case 'c':
	case 'C':
	System.out.print("c for Cat");
	break;
	case 'd':
	case 'D':
	break;
	case 'e':
	case 'E':
	System.out.print(" e for eagle");
	break;
	case 'f':
	case 'F':
	System.out.print("f for frog");
	break;
	case 'g':
	case 'G':
	System.out.print("g for gentleman");
	break;
	default:
	System.out.print("invalid alphabet!");
	break;
}	
}
	case 6:
	{
		System.out.println("UNIT-CONVERTOR");
		System.out.println("for kg to gram, hit: 1");
		System.out.println("for cm to inch, hit: 2");
		System.out.println("for min to sec, hit: 3");
	int quantity=ob.nextInt();
	switch(quantity)
	{
	case 1: 
		    System.out.println("enter kg!");
		    int kg=ob.nextInt();
		    int gram=kg*1000;
		    System.out.print("you have grams: " + gram);
		    break;
	 case 2:
		 System.out.print("enter centimetres!");
		 int cm=ob.nextInt();
		 int inch=cm/12;
		 System.out.println("you have inches: " + inch);
		 break;
	case 3:
	        System.out.print("enter min!");
		  int min=ob.nextInt();
		  int sec=min*60;
		  System.out.print("Seconds you have: " + sec);
		  break;
	}
	}
}
	}
}



