class ret
{
int width;
int length;
int computearea()
{
return (width*length);
}
public static void main(String ae[])
{
ret a=new ret();

a.computearea();
a.length=3;
a.width=6;
System.out.println(a.computearea());
}
}