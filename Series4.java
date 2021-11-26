class Series4
{
public static void main(String ar[])
{
int a=0;
int b=3;
int c=0;
for(int i=0; i<=30; i++)
{
	System.out.println(a);	a=c;
	c=a+b;
	b+=2;
}
}
}