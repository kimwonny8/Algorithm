package Silver;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q17413 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String s=sc.nextLine();
		char[] arr=s.toCharArray();
		Stack<Character> st=new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			if(arr[i]=='<') {
				int j=i;
				while(arr[j]!='>') {		
					sb.append(arr[j]);
					j++;
				}
				sb.append(">");
				i=j;
			}
			else if(arr[i]==' ') sb.append(" ");
			else {
				int j=i;
				while(j<arr.length && arr[j]!=' ' && arr[j]!='<' ) {
					st.add(arr[j]);
					j++;
				}
				int size=st.size();
				for(int k=0; k<size; k++)	sb.append(st.pop());
				i=j-1;
			}
			
		}
		System.out.println(sb);
   }
}
