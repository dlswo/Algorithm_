package level1;
import java.util.Arrays;

public class XandN {
	
//	x만큼 간격이 있는 n개의 숫자
//	문제 설명
//	함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
	public static void main(String[] args) {
		int x = -4;
		int n = 3;
		long[] answer = new long[n];
		for(int i = 0; i < n; i++){
			answer[i] = (long) x * (i + 1);
		}
		System.out.println(Arrays.toString(answer));
	}
}
