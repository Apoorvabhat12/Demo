package Demo;

import java.util.Arrays;

public class FirstRepeating {

	public static void main(String[] args) {
		
		int a[] = { 5, 3, 4, 6, 3, 5};
		int count=0;
		
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		  
		System.out.println(intArr);
		
        // To convert the elements as List 
        System.out.println("Integer Array as List: "
                           + Arrays.asList(intArr)); 
        
        System.out.println("Integer Array as List: "
                + Arrays.toString(intArr)); 
        
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(String.valueOf(a[i]).equals(String.valueOf(a[j])))
				{
					count++;
					break;
				}
			}
			
			if(count==0)
			{
				System.out.println(a[i]);
				break;
			}
			count=0;
		}

		
		
	}

	
}
