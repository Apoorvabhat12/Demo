package Strings;

import java.util.StringTokenizer;

public class PrintString {

	public static void main(String[] args) {
		
		String a = "apoorva,gv,varma";
		
		StringTokenizer stk = new StringTokenizer(a,",");
		
		while(stk.hasMoreTokens())
		{
			String tkn = stk.nextToken();
			
			String[] arr = new String[tkn.length()];
		    for(int i = 0; i < tkn.length(); i++)
		    {
		        arr[i] = String.valueOf(tkn.charAt(i));
		    }
		}

	}

}
