package yju_algorithm;

import java.util.Scanner;

public class 구구단 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		for(int i=0; i<33; i++) {
			for(int j=0; j<9; j++) {
				for(int k=0; k<3; k++) {					
					int num=k+2+i*3;
					System.out.printf("%d *%3d = %3d\t", num, j+1, num*(j+1));
				}
				System.out.println();

			}
			System.out.println();
		}
	}
}