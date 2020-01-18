package Demo;

class AP
{
	int i=2;
	void add()
	{
		System.out.println("parent");
	}
}

class BA extends AP
{
	int i=3;
	void sub()
	{

		System.out.println("child");
	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AP a = new BA();

		System.out.println(a.i);
		
		BA b = new BA();
		
		System.out.println(b.i);
		

	}

}
