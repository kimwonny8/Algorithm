package Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q10825 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int n=sc.nextInt();
		String[][] arr=new String[n][4];
		for(int i=0; i<n; i++) {
			arr[i][0]=sc.next();
			arr[i][1]=sc.next();
			arr[i][2]=sc.next();
			arr[i][3]=sc.next();
		}
		
		Arrays.sort(arr,new Comparator<String[]>(){
			@Override
			public int compare(String[] o1, String[] o2){
				if(o2[1].equals(o1[1])){
					if(o1[2].equals(o2[2])){
						if(o1[3].equals(o2[3])){
							return o1[0].compareTo(o2[0]);
	                        }
	                    return Integer.parseInt(o2[3])-Integer.parseInt(o1[3]);
	                    }
					return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);

				}
	            return Integer.parseInt(o2[1])- Integer.parseInt(o1[1]);
	            }
			});
		 
		 for(int i=0; i<n; i++) {
			 sb.append(arr[i][0]+"\n");
		 }
		 System.out.println(sb);
	}
}