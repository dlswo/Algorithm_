package Level1;
public class NumOfPrime {
	
//	소수 찾기
//	문제 설명
//	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
//	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//	(1은 소수가 아닙니다.)
	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		int[] arr = new int[n + 1];
		
//		for(int i = 2; i <= n; i++){
//			boolean isPrime = true;
//			for(int j = 2; j < i; j++){
//				System.out.println("i =" + i);
//				System.out.println("j =" + j);
//				System.out.println(i % j);
//				if(i % j == 0){
//					isPrime = false;
//					break;
//				}
//				
//			}
//			if(isPrime == true){
//				answer++;
//			}
//		}
//		System.out.println(answer);
		for(int i = 2; i <= n; i++){
			arr[i] = i;
		}
		for(int i = 2; i <= n; i++){
			if(arr[i] == 0){
				continue;
			}
			for(int j = i + i; j <= n; j+=i){
				arr[j] = 0;
			}
		}
		for(int i = 2; i <= n; i++){
			if(arr[i] != 0)
				answer++; 
		}
		System.out.println(answer);
	}

}
