public class SumDivisor {
	
//	약수의 합
//	문제 설명
//	자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
		for(int i = 1 ; i <= n ; i++){
			answer += (n % i == 0) ? i : 0;
		}
		System.out.println(answer);
	}
}
