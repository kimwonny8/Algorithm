package Silver;

import java.util.Scanner;

public class Q9020 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		boolean[] arr = new boolean[10001]; 
		arr[0]=arr[1]=true;  // false ¸é ¼Ò¼ö
	
		for(int i=2; i<=Math.sqrt(arr.length); i++) {
			if(arr[i]) continue;
			for(int j=i*i; j<arr.length; j+=i) {
				arr[j]=true;
			}
		}
	
		int T=sc.nextInt();
		
		while(T-->0) {
			int n=sc.nextInt();
			int start=n/2, end=n/2;
			
			while(true) {
				if(arr[start]==false && arr[end]==false) {
					sb.append(start+" "+end+"\n");
					break;
				}
				start--; end++;
			}
		}
		System.out.println(sb);
	}

}