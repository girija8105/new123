package classpractise;

public class demo {
	demo(int x,string y)
	{
		System.err.println(x+" "+y);
	}

}
class tester extends demo
{
	tester(string s)
	{
		super(123,"hi");
		System.out.println(s);
}
}
class hi extends tester
{
	hi(int x)
	{
		super("ilu");
		System.out.println(x);
	}
}
public class cool extends hi
{
	public static void main(String[] args) {
		new hi(4)
	}
}
