package Test1;

import java.util.Arrays;

public class test1 {
	
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = (start-1);
		for(int j = start; j <= end-1; j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, end);
		return (i+1);
	}
	static void quicksort(int[]arr, int start, int end) {
		if(start<end) {
			int pi = partition(arr, start, end);
			quicksort(arr, start, pi-1);
			quicksort(arr, pi+1, end);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		int arr[] = {10,7,8,9,1,5};
		int n = arr.length;
		
		quicksort(arr, 0, n-1);
		System.out.println("sorted");
		System.out.println(Arrays.toString(arr));
	}

}
