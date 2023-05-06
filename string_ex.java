package programmers;
// 프로그래머스 예제 : 문자열 겹쳐쓰기 함수 만들기

public class string_ex {
	public String solution(String my_string, String overwrite_string, int s) {
		String answer = ""; //최종 결과 담을 변수 
		String a1 = my_string.substring(0, s); // 첫글자부터 주어진 숫자의 인덱스까지 잘라내기
		String a2 = my_string.substring(s+overwrite_string.length()); // 덮어쓸 글자수 보다 뒤쪽 원본 확보
		answer = a1.concat(overwrite_string).concat(a2); // 합체!!
		return answer;
		    }
		}
