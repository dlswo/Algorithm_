package Level2;

public class Fibonacci {
	
//	피보나치 수
//	문제 설명
//	피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
//	2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
	public static void main(String[] args) {
		int n = 5;
		int answer = 0;
		int first = 0, second = 1;
		System.out.println(fibo(3));
	}
	public static int fibo(int n){
		if(n < 1){
			return 1;
		}
		int[] fibo = new int[n + 1];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i = 2; i < n + 1; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		return fibo[n];
	}

}
