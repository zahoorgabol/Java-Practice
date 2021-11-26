class rect
{
int y;
int x;
int com()
{
return (x+y);
}
int jom()
{
	return (x/y);
}

int a;
int b;
int som()
{
	return(a*b);
}

static int lom(int c, int d)
{
	return(c+d);
}
public static void main (String ar[])
{
rect j=new rect();
j.com();
j.x=4;
j.y=5;
System.out.println(j.com());
rect k=new rect();
k.x=7;
k.y=8;
System.out.println(j.com()*k.com());
rect l=new rect();
l.x=200;
l.y=4;
System.out.println(l.jom());
rect m=new rect();
m.a=3;
m.b=2;
System.out.println(m.som());
System.out.println(lom(4,6));
}
}