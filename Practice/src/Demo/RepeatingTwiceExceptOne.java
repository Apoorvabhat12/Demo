package Demo;

public class RepeatingTwiceExceptOne {

	public static void main(String[] args) {
		
		int a[] = {1,1,2,2,3,4,4,5,5};
		int count=0;
		int c[] = new int[9];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(String.valueOf(a[i]).equals(String.valueOf(a[j])))
				{
					count++;
				}
			}
			
			
		}
		
		
		
	}

}
