package LinkedList;

import java.util.Scanner;

public class Bubble {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		 int a[] = new int[5];
		 int n,i,j,temp;
		    System.out.println("Enter the size of array: ");
		    n = scan.nextInt();
		    System.out.println("Enter the array elements: ");
		    
		    for(i=0;i<n;++i)
		       a[i]  =scan.nextInt();
		        
		    for(i=0;i<n;i++){
		        for(j=i+1;j<n;j++){
		           if(a[i]>a[j]){
		              temp=a[i];
		              a[i]=a[j];
		              a[j]=temp;
		           }
		        }
		     }

		            
		    System.out.println("\nArray after sorting: ");
		    for(i=0;i<n;++i)
		        System.out.println(a[i]);
		 
		    
		}
	}


