package yju_algorithm;

import java.util.Scanner;

public class 별찍기 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("n을 입력하세요: ");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.printf("%3d ", i);
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
		
		for(int i=0; i<n; i++) {
			System.out.printf("%3d ", i);
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.printf("%3d ", i);
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.printf("%3d ", i);
			for(int j=0; j<2*(n-i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.printf("%3d", i);
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.printf("%3d ", i);
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*(n-i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=0; i<n; i++) {
			System.out.printf("%3d", i);
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<n-1; i++) {
			System.out.printf("%3d ", i+n);
			for(int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*n-3-(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("몇 개 찍을까용? ");
		int cnt=sc.nextInt()-1;
		System.out.println();
		
        for(int i=0; i<n; i++){
            System.out.printf("%3d ", i);
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            
            for(int k=0; k<cnt; k++) {
	            for(int j=0; j<n-i-1; j++){
	                System.out.print("  ");
	            }
	            for(int j=0; j<2*i+1; j++){
	                System.out.print("*");
	            }
	        }	
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            System.out.printf("%3d  ", n+i);
            for(int j=0; j<i+1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-3-2*i; j++){
                System.out.print("*");
            }
            for(int k=0; k<cnt; k++) {
	            for(int j=0; j<i+1; j++){
	                System.out.print("  ");
	            }
	            for(int j=0; j<2*n-3-2*i; j++){
	                System.out.print("*");
	            }
            }
            System.out.println();
        }
        
	}
}

