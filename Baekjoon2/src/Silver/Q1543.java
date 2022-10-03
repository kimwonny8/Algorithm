package Silver;

import java.util.Scanner;

public class Q1543 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(), str2=sc.nextLine();
        
        int cnt=0;
        for(int i=0; i<str.length()-str2.length()+1; i++) {
        	if(str.substring(i,i+str2.length()).equals(str2)) {
				cnt++;
				i+=str2.length();
				i--; 
			}
		}
		System.out.println(cnt);
    }
}
	