package Demo;

import java.util.Scanner;

public class Disarium {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the numberr");
	int k = scan.nextInt();
	int n = k;
	int count=0;
	int ans=0;
	while(n>0)
	{	
		
	    int p = n/100;
	     n = n%100;
	    count++;
	    if(count>0)
	    {
	    	count = p;
	    	 ans = ans +  p * count;
	    }
	}
	if(k==ans)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
}

}
