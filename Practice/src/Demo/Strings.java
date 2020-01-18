package Demo;

public class Strings {

	public static void main(String[] args) {

		//Emp e = new Emp();
		//System.out.println(e.toString());
		
		//String s = new String("gv1");
		//System.out.println(s);
		
		String q = new String("ap is cute");
		char[] p = q.toCharArray();
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
		
		String w[] = q.split("\\s");
		
		for(int i=0;i<w.length;i++)
		{
			System.out.println(w[i]);
		}

	}

}
