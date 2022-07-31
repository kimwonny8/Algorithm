package Bronze;

import java.util.Scanner;

public class Q1924 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int day=sc.nextInt();
		
		int[] arr={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] arr2={"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int totalDays=day;
		for (int i=0; i<month-1; ++i) {
			totalDays+=arr[i];
		}
		
		System.out.println(arr2[totalDays % 7]);
	}
}

