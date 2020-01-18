package Demo;

import java.util.Arrays;

public class DuplicateNumberinArray {

	public static void main(String[] args) {
		
		int arr[] = {1,3,5,2,1,3,1};
		
		
		
		
		int a=10;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(String.valueOf(arr[i]).equals(String.valueOf(arr[j])))
				{
					System.out.println(String.valueOf(arr[j]));
					break;
				}
				
			
			}
		}
		
		
	System.out.println(Arrays.toString(arr));
	
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(String.valueOf(arr[i]));
	}

	}

	
	
	
	
}





