package Bronze;

import java.util.Scanner;

public class Q2902 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char []arr=new char[name.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=name.charAt(i);
		}
		for(int i=0; i<arr.length; i++) {
			if(i==0) System.out.print(arr[i]);
			if(arr[i]=='-') System.out.print(arr[i+1]);
		}
		}
}
