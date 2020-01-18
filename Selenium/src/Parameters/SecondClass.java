package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondClass {
	
	
	
	@Test
	@Parameters("author")
	public void test3(String author)
	{
		System.out.println("qqq" + "----" + author);
	}
	
	@Test
	public void test4()
	{
		System.out.println("ppp");
		
	}

}
