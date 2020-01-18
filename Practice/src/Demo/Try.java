package Demo;

import java.util.Arrays;

public class Try {

	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		String s = Arrays.toString(a);
		//System.out.println(s);
		
		
		int b[] = {5,6,7};
		String z = String.valueOf(b);
		//System.out.println(z);
		
		int c[]  = {10,11,12};
		String p[] = new String[c.length];
		
		for(int i=0;i<c.length;i++)
		{
			p[i] = String.valueOf(c[i]);
		}
		//System.out.println(Arrays.toString(p));
		
		
		String q = "abc";
		int w[] = new int[q.length()];
		
		for(int i=0;i<w.length;i++)
		{
			w[i] = q.charAt(i);
			//System.out.println(w[i]);
		}
		
		String si[] = {"g","a","u","r","a","v"};
		String zi[] = new String[si.length];
		for(int i=0;i<si.length;i++)
		{
			if(si[i] != "u")
			{
				zi[i] = si[i];
				System.out.print(zi[i]);
			}
		}
		System.out.println(zi.toString());
		
		
		
		
	}

}
