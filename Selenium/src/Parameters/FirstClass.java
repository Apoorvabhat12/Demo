package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstClass {
	
	
	@Test
	@Parameters("author")
	public void test1(String author)
	{
		System.out.println(author);
	}
	
	@Test
	public void test2()
	{
		System.out.println("zzz");
		
	}
	

}
