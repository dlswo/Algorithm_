package level1;
public class Hashard {

//	하샤드 수
//	코드 에디터의 단축키를 설정하는 옵션입니다. 선호하는 에디터 옵션이 없다면 sublime을 선택해 주세요.
//	문제 설명
//	양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
	public static void main(String[] args) {
		int x = 13;
		boolean answer = true;
		String str = x + "";
		int sum = 0;
		for(int i = 0; i < str.length(); i++){
		    sum += str.charAt(i) - 48;
		}
		answer = x % sum == 0;
		System.out.println(answer);
		  
	}
}
