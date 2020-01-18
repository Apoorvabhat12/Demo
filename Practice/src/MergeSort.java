import java.util.Scanner;

public class MergeSort {
 
	static void mergeArray(int array[],int low,int mid,int high)
	{
	    int temp[] = new int[25];
	    int i=low,j=mid+1,k=0;
	    while(i<=mid && j<=high)
	    {
	        if(array[i]<=array[j])
	            temp[k++]=array[i++];
	        else
	            temp[k++]=array[j++];
	    }
	    while(i<=mid)
	        temp[k++]=array[i++];

	    while(j<=high)
	        temp[k++]=array[j++];
	    for(i=0;i<k;i++)

	    array[low+i]=temp[i];
	}

	static void mergesort(int array[],int low,int high){
	    int mid=(low+high)/2;

	    if(low<high){
	        mergesort(array,low,mid);
	        mergesort(array,mid+1,high);
	        mergeArray(array,low,mid,high);
	   }
	}

	public static void main(String[] args){
	   int i,n;
	   int array[] = new int[25];
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the no of elements\n");
	   n = scan.nextInt();

	   System.out.println("Enter %d elements: " + n);
	   for(i=0;i<n;i++)
	   {
		   array[i] =scan.nextInt();
	   }

	   mergesort(array,0,n-1);

	   System.out.println("Order of Sorted elements: ");
	   for(i=0;i<n;i++)
	      System.out.println(array[i]);

	
	}

}
