package level2;

import java.util.Arrays;

public class LargestNumber {

//	가장 큰 수
//	문제 설명
//	0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
//
//	예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
//
//	0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		String answer = "";
		String[] str = new String[numbers.length];
		
		// 문자열 배열로 전환
		for(int i = 0 ; i < numbers.length; i++){
			str[i] = String.valueOf(numbers[i]);
		}
		
		// 두 String을 더해서 더큰쪽이 무선
		Arrays.sort(str, (str1, str2) -> (str2 + str1).compareTo(str1 + str2));
		System.out.println(Arrays.toString(str));
		
		for(int i = 0 ; i < numbers.length; i++){
			answer += str[i];
		}
		
		System.out.println(answer);
	}
}
