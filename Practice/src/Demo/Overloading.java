package Demo;

public class Overloading {

	public int area(int a, int b){
		  System.out.println("int");
		  return a * b;
		  }

		 public float area(float a, float b){
		  System.out.println("float");
		  return a * b;
		 }

		 public double area(double a, double b){
		  System.out.println("double");
		  return a * b;
		 }
		 
		 public double area(float a ,double b)
		 {
			 System.out.println("double double");
			  return a * b;
		 } 
	
		 
		/* public double area(double a ,float b)
		 {
			 System.out.println("double float");
			  return a * b;
		 } */
		 
		/* public double area(double a ,int b)
		 {
			 System.out.println("double int");
			  return a * b;
		 }*/
		 
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		  obj.area(1, 2.2);
		  obj.area(1F, 2.2);
		  obj.area(1F, 2);
		  

	}

	
}
