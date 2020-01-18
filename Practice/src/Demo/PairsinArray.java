package Demo;



public class PairsinArray {

	public static void main(String[] args) {
		
		int a[] = {2,8, 6, 8, 9, 11,8};
		int sum=10;
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum1 = a[i]+a[j];
				
				if(String.valueOf(sum1).equals(String.valueOf(sum)))
				{
					System.out.println(a[i] + "," +  a[j]);
				}
			}
		}
				

	}

}
