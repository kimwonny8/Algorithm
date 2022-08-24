package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Q10610 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String str=sc.next();
		int sum=0;

		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--) {
			int num=arr[i]-'0';
			sum+=num;
			sb.append(num);
		}
		if(arr[0]!='0'||sum%3!=0) {	
			System.out.println(-1);
			return;
		}
		System.out.println(sb);
	}
}