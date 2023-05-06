package programmers;

import java.util.Scanner;
import java.util.Arrays;

class Solution { // 배열값에 2를 곱해 리턴하는 클래스 생성
    public int[] solution(int[] numbers) {
       
    	int[] answer = new int[numbers.length];
       
        for (int i = 0; i<numbers.length; i++ ) {
        	answer[i] = numbers[i] * 2;
        }
        return answer;
    }
	//programmers 최상단의 아름다운 코드 '이렇게 간단히!!!!! ㅠㅠ'
/* class Solution { 
	public int[] solution(int[] numbers) {
		return Arrays.stream(numbers).map(i -> i * 2).toArray(); } }*/
	 
}


public class multinum_array {
	public static void main(String[] args) {
		//정수 배열 numbers가 매개변수로 주어집니다. 
		//numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5]; //예제로 5개를 입력하여 구현
		for (int i = 0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers)); 
		// 배열 전체 출력을 위해서는 별도로 Arrays유틸 임포트 후 출력하거나 반복문 사용해야 함.
		// Arrays 유틸에 포함된 .toString 함수 사용
		Solution sol = new Solution(); // solution class 의 인스턴스 생성 
		int[] answer = sol.solution(numbers);
		System.out.println(Arrays.toString(answer));
	}

}
