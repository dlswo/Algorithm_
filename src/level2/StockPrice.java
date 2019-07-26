package level2;

import java.util.Arrays;

public class StockPrice {

//	주식가격
//	코드 에디터의 단축키를 설정하는 옵션입니다. 선호하는 에디터 옵션이 없다면 sublime을 선택해 주세요.
//	문제 설명
//	초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		int[] answer = new int[prices.length];
		
		for(int i = 0; i < prices.length; i++){
			for(int j = i + 1; j < prices.length; j++){
				// 각 Element를 비교해서 자신보다 작으면 그곳의 인덱스 - 자신의 인덱스
				if(prices[i] > prices[j]){
					System.out.println(i + " : " + j);
					answer[i] = j - i;
					break;
				// 크면 전체인덱스 - 자신의 인덱스
				}else{
					answer[i] = j - i;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
	}
}
