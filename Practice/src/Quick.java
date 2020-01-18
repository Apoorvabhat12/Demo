import java.util.Scanner;

public class Quick {
	
	static void quicksort(int array[],int low,int high){
	    int mid;


	   if(low<high){
	        mid=partition(array,low,high);
	        quicksort(array,low,mid-1);
	        quicksort(array,mid+1,high);
	   }
	}

	static int partition(int array[],int low,int high)
	{

	     int i, j, pivot, temp;
	      pivot=array[low];
	      i=low+1;
	      j=high;
	      
	    while(true)
	    {
	        while((i<high)&& (pivot>=array[i]))
	              i++;
	         while(pivot<array[j])
	            j--;
	         if(i<j){
	            temp=array[i];
	            array[i]=array[j];
	            array[j]=temp;
	         }
	            else{
	                temp=array[low];
	                array[low]=array[j];
	                array[j]=temp;

	                return j;
	            }

	   }
	}

	public static void main(String[] args){
	   int i,n;
	   int array[] = new int[50];
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the no of elements\n");
	   n = scan.nextInt();

	   System.out.println("Enter %d elements: " + n);
	   for(i=0;i<n;i++)
	      array[i] = scan.nextInt();

	   quicksort(array,0,n-1);

	   System.out.println("Order of Sorted elements: ");
	   for(i=0;i<n;i++)
	      System.out.println(array[i]);

	   
	}


}
