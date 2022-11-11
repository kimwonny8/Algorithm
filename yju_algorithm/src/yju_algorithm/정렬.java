package yju_algorithm;

class BubbleSort {
	
	static void swap(int[] arr, int idx1, int idx2) {
		int t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
	}

	static void print(int[] arr) {
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	// 버블 정렬
	static void bubbleSort(int[] arr) {
		int n=arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
			}
		}
	}

	// 버블정렬_연습문제
	static void bubbleSort2(int[] arr) {
		int n=arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d :\n", i + 1);

			for (int j = n - 1; j > i; j--) {
				for (int k = 0; k < -1; k++) {
					System.out.printf("%3d %c", arr[k], (k != j - 1) ? ' ' : (arr[j - 1] > arr[j]) ? '+' : '-');
				}
				System.out.printf("%3d\n", arr[n - 1]);
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
			}
			for (int m = 0; m < n; m++) {
				System.out.printf("%3d  ", arr[m]);
			}
			System.out.println();
		}
	}
	
	// 버블 정렬 - 교환이 더 이상 일어나지 않으면 멈춤
	static void bubbleSort3(int[] arr) {
		int n=arr.length;
		
		int wcnt = 0; // 전체 교환 횟수
		for (int i = 0; i < n - 1; i++) {
			int cnt = 0;

			for (int j = n - 1; j > i; j--) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
					cnt++;
					wcnt++;
				}
			}
			if (cnt == 0)
				break;
		}
		System.out.println("전체교환횟수: " + wcnt);
		print(arr);
	}
	
	// 단순 선택 정렬 - 제일 작은 값 찾아서 맨 앞으로 이동
	static void selectionSort(int []arr) {
		int n=arr.length;
		
		for(int i=0; i<n-1; i++) {
			int min=i;
			print(arr);
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			System.out.printf("  가장 작은 값:%d, 위치:%d\n",arr[min], min);
			swap(arr,i,min);
		}
		System.out.print("\n정렬 완료: ");
		print(arr);
	}

	// 단순 삽입 정렬 - 두번째부터, 그 값이 앞보다 작으면 앞을 뒤로 밀고 작은 수를 앞으로
	static void insertionSort(int []arr) {
		int n=arr.length;
		for(int i=1; i<n; i++) {
			int tmp=arr[i];
			int idx=0; // 들어갈 자리 찾기

			for(int j=0; j<i; j++) {
				if(arr[j] < tmp) continue;
				else break;
			}
			
			// 들어갈 위치 뒤에꺼 한 칸씩 밀기
			for(int j=i; j>idx; j--) {
				arr[j]=arr[j-1];
			}
			print(arr);
			System.out.println();
		}
		
	}
}

public class 정렬 {
	public static void main(String[] args) {
		int[] arr = { 7, 6, 4, 3, 1, 9, 8 };
		int[] arr2 = { 6,4,1,7,3,9,8 };
		// BubbleSort.bubbleSort2(arr);
		//BubbleSort.bubbleSort3(arr2);
		//BubbleSort.selectionSort(arr);
		BubbleSort.insertionSort(arr2);
	}
}