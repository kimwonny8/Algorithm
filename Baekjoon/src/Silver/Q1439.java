package Silver;

import java.util.Scanner;

public class Q1439 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char [] arr=new char[s.length()];
		int zero=0, one=0;
		for(int i=0; i<arr.length; i++) arr[i]=s.charAt(i);
	
	    if(arr[0]=='0') zero++;
	    else one++;

		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] != arr[i]) {
				if(arr[i]=='0') zero++;
				else if(arr[i]=='1') one++;
			}
		}
		System.out.println(Math.min(zero, one));
	}
 
}