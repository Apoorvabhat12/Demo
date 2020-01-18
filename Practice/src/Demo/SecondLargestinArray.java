package Demo;

public class SecondLargestinArray {

	public static void main(String[] args) {


		int a[] = {5,7,3,2,4};
		
		int largest,second;
		
		largest = a[0];
		second = a[1];
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i] > largest ) 
			{
				second = largest;
				largest = a[i];
			}
		}

		System.out.println(second);
	}

}
