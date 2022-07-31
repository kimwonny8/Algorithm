package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q11656 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String[] arr=new String[s.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=s.substring(i,s.length());
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) 
			System.out.println(arr[i]);
	}

}
