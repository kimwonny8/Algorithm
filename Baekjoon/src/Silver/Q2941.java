package Silver;

import java.util.Scanner;

public class Q2941 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		char []arr=new char[a.length()];
		int cnt=arr.length;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=a.charAt(i);
		}
		for(int i=0; i<arr.length-1; i++) {
				if(arr[i]=='c') {
					if(arr[i+1]=='='||arr[i+1]=='-') cnt--; 
				}
				else if(arr[i]=='d') {
					if(i!=arr.length-2) {
						if(arr[i+1]=='z' && arr[i+2]=='=') cnt--; 
					}
					if( arr[i+1]=='-')  cnt--;
				}
				else if(arr[i]=='l' && arr[i+1]=='j') cnt--;
				else if(arr[i]=='n' && arr[i+1]=='j') cnt--;
				else if(arr[i]=='s' && arr[i+1]=='=') cnt--;
				else if(arr[i]=='z'){
					if(arr[i+1]=='=') cnt--;
				}
		}
		System.out.println(cnt);
	}
}
