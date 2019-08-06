package level2;

import java.util.HashMap;
import java.util.Map;

public class FindPrimeNum {
	
//	소수 찾기
//	문제 설명
//	한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
//
//	각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
	static Map<Integer, Integer> hash = new HashMap<>(); // 중복제거를 위해 전역으로..
	
	public static void main(String[] args) {
		String numbers = "011";
		int answer = 0;
		
		// 숫자의 경우의 수를 모두 구한다
		// 검색 해보니 Permutation 알고리즘 이란걸 사용해야 됨... // 중복을 제거해야되네??...
		
		String[] arr = numbers.split("");
		int[] intArr = new int[numbers.length()];
		
		for(int i = 0; i < numbers.length(); i++){
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		for(int i = 1; i <= numbers.length(); i++){
			permutation(intArr, 0, numbers.length(), i);
		}
		
		// 소수를 확인하는 메소드를 만든다
		
		// 그 숫자가 소수면 answer +1 // hash에 추가한다
		
		//System.out.println(answer);
		System.out.println(hash.size());
		
	}
	
	public static void permutation(int[] arr, int depth, int length, int end){
		
		if(depth == end){ //depth가 마지막에 도달
			int result = 0;
			for(int i = 0; i < end; i++){
				result += arr[i] * Math.pow(10, i);
			}
			//System.out.println(result);
			//System.out.println(checkPrime(result));
			checkPrime(result);
			
			return;
		}
		
		for(int i = depth; i < length; i++){
			int temp = arr[i];
			int temp2 = arr[depth];
			arr[i] = temp2;
			arr[depth] = temp;
			permutation(arr, depth + 1, length, end);
			arr[i] = temp;
			arr[depth] = temp2;
		}
	}
	
	public static boolean checkPrime(int num){
		
		if(num == 0 || num == 1){
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++){
			if(num % i == 0){
				return false;
			}
		}
		hash.put(num, num);
		return true;
	}
}
