package Demo;

import java.util.Arrays;

public class IntersectionArrays {

	public static void main(String[] args) {

		int a[] = {1, 5, 10, 20, 40, 80};
		int b[] = {6, 7, 20, 80, 100};
		int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
		int d[] =  new int[10];
		int e[] = new int[10];
		int count =0,sum=0;
		int count1=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(String.valueOf(a[i]).equals(String.valueOf(b[j])))
				{
					
					//System.out.println(a[i]);
					d[i] = a[i];
					
				}
					
			}
			
		}
		
		
		
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<d.length;j++)
			{
				if(String.valueOf(c[i]).equals(String.valueOf(d[j])))
				{
					
					//System.out.println(a[i]);
					e[i] = c[i];
					System.arraycopy(c, 0, e, 0, 2);
					
				}
					
			}
			
		}
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println(e[i]);
		}
		
		
	}
		
	

}
