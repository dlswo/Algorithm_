
public class StringToInteger {

	/*문자열을 정수로 바꾸기
	문제 설명
	문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.*/
	public static void main(String[] args) {
		String s = "-3";
		int answer = 0;
		for(int i = 0 ; i < s.length(); i++){
			if ( s.charAt(0) == '-'){
				answer -= (s.charAt(i) - '0') ;
			}else{
				answer += (s.charAt(i) - '0') * Math.pow(10, s.length() - ( 1 + i ));
			}
			
		}
		System.out.println(s.charAt(0) - '0');
		System.out.println(answer);
	}
}
