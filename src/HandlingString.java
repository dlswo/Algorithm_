import java.util.Arrays;

public class HandlingString {
	
//	문자열 다루기 기본
//	문제 설명
//	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
	public static void main(String[] args) {
		String s = "0234";
		boolean answer = true;
		char[] cstr = s.toCharArray();
		if(cstr.length != 4 && cstr.length != 6){
			answer = false;
		}
		for(int i = 0 ; i < cstr.length ; i++){
			if( cstr[i] < 48 || cstr[i] > 57){
				answer = false;
			}
		}
		System.out.println(answer);
	}

}
