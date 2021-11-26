class Series3
{
public static void main(String ar[])
{
int a=0;
int b=3;
int c=0;

for(int i=0; i<=40; i++)
{
     c=a+b;
     a=c;
     b+=2;
     
System.out.println(a);     
}
}
}