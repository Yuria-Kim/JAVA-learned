package programmers;

import java.util.Arrays;
import java.util.ArrayList;

public class noneOdd {

	public static void main(String[] args) {
		
//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
        //List<Integer> oddNumbers = new ArrayList<>();
        
 
	int n = 10;
	ArrayList<Integer> array = new ArrayList<>(); // 빈 ArrayList 생성
	
	for (int i = 1; i <= n; i += 2) { //n보다 작은 홀수 값 리스트에 입력
        array.add(i);
    }
	int[] answer = new int[array.size()]; // 배열 생성
	
	for (int i = 0; i < array.size(); i++) {
        answer[i] = array.get(i); // 리스트값 하나씩 answer에 입력
    }
	
	System.out.println(Arrays.toString(answer));
		
	}

}

/* 프로그래머스 best code
 * import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}*/
