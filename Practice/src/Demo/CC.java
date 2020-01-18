package Demo;

class Aap
{
	Aap()
	{
		System.out.println("aaaa");
	}
	
	Aap(int a)
	{
		System.out.println("bbb");
	}
}

class Bab extends Aap
{
	Bab()
	{
		this(4);
		System.out.println("ccc");
	}
	
	Bab(int a)
	{
		super(3);
		System.out.println("dd");
	}
}

public class CC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bab b = new Bab();
	}

}
