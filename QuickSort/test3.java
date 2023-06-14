package Test1;

import java.util.Arrays;

public class test3 {
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void main(String[] args) {

		/*so what?
		 * 피봇값 결정 -> 피봇값과 비교하여 작은값은 제자리, 큰값은 오른쪽으로 이동
		 * (정석은 피봇값을 전후로 전에 작은값, 후에 큰값 두기)
		 * so => 배열을 돌며 값을 비교 후 value값 변경
		 * 작은값일 때마다 any count ++;
		 * 배열 마지막까지 다 돌고나면 count와 피봇값 스왑
		 * 여기까지가 1차정렬
		 * count 자리에 있는 피봇값 앞쪽/ 피봇값 뒤쪽
		 * 각각 같은 과정으로 정렬
		 * that`s all this way*/
		int arr[] = {6,7,8,3,1,4};
		int n = arr.length-1;
		int pivot = arr[n]; // last index
		
		int j = n-1; // last index-1;
		int count = 0;
		int index = 0; //회전 후 last pivot 위치 확인용
		while (count<=n) {
			
			for(int i = 0; i<n; i++) {
				if(arr[i]>=pivot) {
					swap(arr, i, j);
					//int temp = arr[j];
					//arr[j] = arr[i]; // 피봇을 제외한 맨 뒤 인덱스에 i인덱스 벨류값 삽입
					//arr[i] = temp;
					// 이 구조가 swap함수 구축 기본
					j--;//last index를 하나 앞으로
					count++;
				
					
					if(i>=j) {//arr 배열 순회 1차 완료
						swap(arr, i, n);
	//					int temp2 = arr[i-1];
	//					arr[i-1] = arr[n];
	//					arr[n] = temp2;
						index = i;
						System.out.println("when i == j");
						System.out.println(Arrays.toString(arr));
						System.out.println();
						break;
					}
					System.out.println(Arrays.toString(arr));
				}
			}
			
			j = index-1;
		}
		//System.out.println(Arrays.toString(arr));
	}

}
