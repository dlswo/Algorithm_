package level2;

import java.util.HashMap;

public class Camouflage {
	
//	위장
//	코드 에디터의 단축키를 설정하는 옵션입니다. 선호하는 에디터 옵션이 없다면 sublime을 선택해 주세요.
//	문제 설명
//	스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
//
//	예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int answer = 1;
		
		// 종류별로 묶어야 하므로 hashmap을 선언
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// 종류별로 묶는디. 
		for(int i = 0; i < clothes.length; i++){
			// 중복이면 1씩 늘린다.
			if(hm.containsKey(clothes[i][1])){ 
				hm.replace(clothes[i][1], hm.get(clothes[i][1]) + 1);
			}else{
				hm.put(clothes[i][1], 1);
			}
		}
		System.out.println(hm);
		// 종류별 갯수 끼리 곱하고 1을 뺀다.(아무것도 안입었을 경우를 뺀다)
		for(int value : hm.values()){
			answer *= (value+1);
		}
		answer -= 1;
		
		System.out.println(answer);
	}
}
