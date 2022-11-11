package Bronze;

import java.util.Scanner;

public class Q5598 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		char [] arr=str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			 if(arr[i]-68<0){
	                System.out.print((char)(arr[i]+23));
	            }
	            else{
	                System.out.print((char)(arr[i]-3));
	            }
		}
	
	}

}