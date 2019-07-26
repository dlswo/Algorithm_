package level2;

import java.util.ArrayList;

public class IronRod {
	
//	쇠막대기
//	문제 설명
//	여러 개의 쇠막대기를 레이저로 절단하려고 합니다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고, 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자릅니다. 쇠막대기와 레이저의 배치는 다음 조건을 만족합니다.
//
//	- 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있습니다.
//	- 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓습니다.
//	- 각 쇠막대기를 자르는 레이저는 적어도 하나 존재합니다.
//	- 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않습니다.
//	아래 그림은 위 조건을 만족하는 예를 보여줍니다. 수평으로 그려진 굵은 실선은 쇠막대기이고, 점은 레이저의 위치, 수직으로 그려진 점선 화살표는 레이저의 발사 방향입니다.
	public static void main(String[] args) {
		String arrangement = "()(((()())(())()))(())";
		int answer = 0;
		// 풀이 : ()를 기준으로 앞에온 (의 갯수만큼 값에 +1씩 해준다.
		
		// ()을 0으로 바꿔준다.
		String copy = arrangement.replace("()", "0");
		System.out.println(copy);
		
		// 0전에 온 (를 스택에 저장하고 )가 오면 빼주고 answer를 1 더하는 작업을 한다.
		ArrayList<Character> stack = new ArrayList<>();
		
		for(int i = 0; i< copy.length(); i++){
			if(copy.charAt(i) == '('){
				stack.add(copy.charAt(i));
			}else if(copy.charAt(i) == ')'){
				stack.remove(stack.size() - 1);
				answer += 1;
			// 0이 오면 스택의 갯수만큼 answer에 더한다.
			}else{
				answer += stack.size();
				System.out.println(answer);
			}
		}
		
		System.out.println(answer);
		
	}

}
