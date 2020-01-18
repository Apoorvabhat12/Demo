package Demo;

public class SmallestLargestArray {

	public static void main(String[] args) {
		
		int a[] = {20,6,13,45,40};
		
		int first = a[0];
		int second = a[1];
		
		if(first>second)
		{
			first = a[0];
			second = a[1];
		}
		
		else
		{
			first= a[1];
			second = a[0];
		}
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>first)
			{	
				second = first;
				first = a[i];
					 
			}
			else if(a[i]<first && a[i]>second)
			{
				second = a[i];
			}
		}
		
		System.out.println("largest " + first);
		System.out.println("Smallest " + second);

	}

}
