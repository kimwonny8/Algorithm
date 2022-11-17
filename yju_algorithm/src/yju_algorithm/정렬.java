package yju_algorithm;

class Sorts {

	static void swap(int[] arr, int idx1, int idx2) {
		int t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
	}

	static void print(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// 배열 출력
	static void printRow(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
	}

	// 버블 정렬
	static void Sorts(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
			}
		}
	}

	// 버블정렬_연습문제
	static void Sorts2(int[] arr) {
		int n = arr.length;

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
	static void Sorts3(int[] arr) {
		int n = arr.length;

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
	static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			print(arr);
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			System.out.printf("  가장 작은 값:%d, 위치:%d\n", arr[min], min);
			swap(arr, i, min);
		}
		System.out.print("\n정렬 완료: ");
		print(arr);
	}

	// 단순 삽입 정렬 - 두번째부터, 그 값이 앞보다 작으면 앞을 뒤로 밀고 작은 수를 앞으로
	static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			int tmp = arr[i];
			int j;

			for (j = 0; j < i; j++) {
				if (arr[j] < tmp)
					continue;
				else
					break;
			}

			// 들어갈 위치 뒤에꺼 한 칸씩 밀기
			for (int k = i; k >= j + 1; k--) {
				arr[k] = arr[k - 1];
			}
			arr[j] = tmp;

			print(arr);
			System.out.println();
		}

	}

	// 단순 삽입 정렬2 - 중간 과정이 나오도록 프로그램을 수정
	static void insertionSort2(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			System.out.printf("처리 arr[%d]=[%d]  삽입될 위치: ", i, arr[i]);
			int tmp = arr[i];
			int j;

			for (j = 0; j < i; j++) {
				if (arr[j] < tmp)
					continue;
				else
					break;
			}

			System.out.println(j);
			printRow(arr, arr.length);
			// 들어갈 위치 뒤에꺼 한 칸씩 밀기
			for (int k = i; k >= j + 1; k--) {
				arr[k] = arr[k - 1];
			}
			arr[j] = tmp;
		}

	}

	// 셸 정렬 => 8개면 4칸, 2칸, 1칸 순으로 차이나는 값 비교해서 교체(0번과 4번 인덱스)
	static void shellSort(int[] arr) {
		int n = arr.length;

		for (int h = n / 2; h > 0; h /= 2) {
			for (int i = h; i < n; i++) {
				int j;
				int tmp = arr[i];
				for (j = i - h; j >= 0 && arr[j] > tmp; j -= h) {
					arr[j + h] = arr[j];
				}
				arr[j + h] = tmp;
			}
		}
	}

	// 셸 정렬2 - h값이 서로 배수가 되지 않도록 만듦
	static void shellSort2(int[] arr) {
		int n = arr.length;

		int h;
		for (h = 1; h < n; h = h * 3 + 1) // +1은 나눗셈하면 어차피 날아감
			;

		for (; h > 0; h /= 3) {
			for (int i = h; i < n; i++) {
				int j;
				int tmp = arr[i];
				for (j = i - h; j >= 0 && arr[j] > tmp; j -= h) {
					arr[j + h] = arr[j];
				}
				arr[j + h] = tmp;
			}
		}
	}
	
	// 퀵 정렬 => O(n log n), 최악일 경우 O(n2)
	static void quickSort(int []arr, int left, int right) {
		int pl = left; // 왼쪽 포인터
		int pr = right; // 오른쪽 포인터
		int x = arr[(pl+pr)/2]; // 피벗(가운데)
		
		do {
			while(arr[pl] < x) pl++;
			while(arr[pr] > x) pr--;
			if(pl <= pr) swap(arr, pl++, pr--);
			
		} while(pl<=pr); // 왼쪽이 오른쪽을 넘을 때 끝
		
		if(left < pr) quickSort(arr, left, pr);
		if(pl < right) quickSort(arr, pl, right);
	}
	
	// 병합 정렬 - 정렬을 마친 배열 a,b를 병합하여 arr 에 저장
	static void mergeSort(int []a, int[] b, int[] arr) {
		int na=a.length;
		int nb=b.length;
		
		int pointA=0, pointB=0, pointC=0;
		
		while(pointA < na && pointB < nb) { // 작은 쪽을 arr에 넣어 둠
			arr[pointC++] = (arr[pointA] <= b[pointB]) ? a[pointA++] : b[pointB++]; 
		}
		
		while(pointA < na) {
			arr[pointC++] = a[pointA++];
		}
		
		while(pointB < nb) {
			arr[pointC++] = b[pointB++];
		}
	}
}

public class 정렬 {
	public static void main(String[] args) {
		int[] arr = { 7, 6, 4, 3, 1, 9, 8 };
		int[] arr2 = { 6, 4, 8, 3, 1, 9, 7 };
		// Sorts.Sorts2(arr);
		// Sorts.Sorts3(arr2);
		// Sorts.selectionSort(arr);
		// Sorts.insertionSort(arr2);
		// Sorts.insertionSort2(arr2);
		// Sorts.shellSort(arr);
		// Sorts.shellSort2(arr);
				
		int [] x = {5,7,1,4,6,2,3,9,8};
		Sorts.quickSort(x, 0, x.length-1);
		Sorts.print(x);
	}
}