package Demo;
import java.util.ArrayList;  
import java.util.Collections;
import java.util.Comparator;
 class Author  {
	  String firstName; 
	  String bookName; 
	  int auAge; 
	  Author(String first, String book, int age){ 
	    this.firstName = first; 
	    this.bookName = book; 
	    this.auAge = age; 
	  } 
	  public String getFirstName() { 
	    return firstName; 
	  }
	  public void setFirstName(String firstName) { 
	    this.firstName = firstName; 
	  }
	  public String getBookName() { 
	    return bookName; 
	  }
	  public void setBookName(String bookName) { 
	    this.bookName = bookName; 
	  }
	  public int getAuAge() { 
	    return auAge; 
	  }
	  public void setAuAge(int auAge) { 
	    this.auAge = auAge; 
	  }
	  
	 
 }

	  class AuthorAgeComparator implements Comparator<Author>{
		   public int compare(Author a1,Author a2){
		     if(a1.auAge==a2.auAge)
		       return 0;
		   else if(a1.auAge>a2.auAge)
		       return 1;
		   else
		       return -1;
		  }
		}
	  
	  class BookNameComparator implements Comparator<Author>{ 
		  public int compare(Author a1,Author a2){   
		     return a1.bookName.compareTo(a2.bookName); 
		  }  
		}
public class SortingPgm {

	public static void main(String[] args) {
		ArrayList<Author> al=new ArrayList<Author>();        
	     al.add(new Author("Henry", "Tropic of Cancer",  45));
	     al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
	     al.add(new Author("Frank", "300", 65));
	     al.add(new Author("Deborah", "Sky Boys", 51));
	     al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
	     
	     System.out.println("Sorting by Author Age:");
	     Collections.sort(al, new AuthorAgeComparator());
	     for(Author au: al){       
	       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
	          au.getAuAge());        
	     }             
	     /*Sorting using BookNameComparator*/      
	     System.out.println("Sorting by Book Name:");      
	     Collections.sort(al, new BookNameComparator());      
	     for(Author au: al){       
	        System.out.println(au.getFirstName()+", "+au.getBookName()+", "+ 
	           au.getAuAge());       
	     }    
	  }  

	}
 


