package programmers;

public class valueOf {
	public static void main(String[] args) {
		
		/*
		 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
		 * 
		 * 12 ⊕ 3 = 123 3 ⊕ 12 = 312 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는
		 * solution 함수를 완성해 주세요.
		 * 
		 * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
		 */
		
		int a = 9;
		int b = 91;
		
		String ab = String.valueOf(a) + b; // 문자로 형 변환 후 결합
		String ba = String.valueOf(b) + a;
		
		int ab_I = Integer.valueOf(ab); // 크기 비교 위해 정수형 변환
		int ba_I = Integer.valueOf(ba);
		
		int answer = 0;
		
		if (ab_I > ba_I) {
			answer = ab_I;
		}
		else if (ba_I > ab_I) {
			answer = ba_I;
		}
		else {
			answer = ab_I;
		}
		
		System.out.println(answer);

		
		
	}

}
