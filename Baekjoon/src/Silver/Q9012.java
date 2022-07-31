package Silver;

import java.util.Scanner;

public class Q9012 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		for(int i=0; i<n; i++) {
			String txt=sc.next();
			int cnt=0;
			
			for(int j=0; j<txt.length(); j++) {
				char []arr=new char[txt.length()];
				arr[j]=txt.charAt(j);
				if(arr[j]=='(') cnt++;
				else if(arr[j]==')') cnt--;	
				if(cnt<0) break;
			} 
			if(cnt==0) System.out.println("YES");
			else System.out.println("NO");	
		} 	

	}
}