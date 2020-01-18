package Demo;

public class MissingNumberinArray {

	public static void main(String[] args) {
		
		int array[] = {1,2,4,5};
		
		int array1[] = {1,2,3,4,5};
		
		int sum=0;
		
		int sum1=0;
		
		int actualSum =0;
		
		for(int i=0;i<array1.length;i++)
		{
			sum= sum + array1[i];
		}
		
		System.out.println("Sum with all elements " + sum);
		
		for(int i=0;i<array.length;i++)
		{
			sum1= sum1 + array[i];
		}
		
		System.out.println("Sum with missing element " + sum1);
		
		
		actualSum = sum - sum1;
		
		System.out.println("Missing number is " + actualSum);
		
		
	}

}
