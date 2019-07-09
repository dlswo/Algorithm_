public class AddDigits {

//	자릿수 더하기
//	코드 에디터의 단축키를 설정하는 옵션입니다. 선호하는 에디터 옵션이 없다면 sublime을 선택해 주세요.
//	문제 설명
//	자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//	예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
//
//	제한사항
//	N의 범위 : 100,000,000 이하의 자연수
	public static void main(String[] args) {
		int n = 123;
		int answer = 0;
		String str = Integer.toString(n);
		for(int i = 0; i < str.length(); i++){
			answer += str.charAt(i) - 48;
		}
		System.out.println(answer);
		
	}
}
