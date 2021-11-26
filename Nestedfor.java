class Nestedfor
{
public static void main(String ar[])
{
for(int outer=1; outer<=5; outer++)
{
	System.out.println("outer:"+outer);
	for(int inner=1; inner<=10; inner++)
	{
		System.out.println("inner:"+inner);
	}
}}
}