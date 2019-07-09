import java.util.ArrayList;
import java.util.Arrays;

public class MockTest {
	
//	모의고사
//	코드 에디터의 단축키를 설정하는 옵션입니다. 선호하는 에디터 옵션이 없다면 sublime을 선택해 주세요.
//	문제 설명
//	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	public static void main(String[] args) {
		int[] answers = {1, 2, 3, 4, 5};
		int[] answer = {0, 0, 0};
		int[][] arr = {
				{1, 2, 3, 4, 5},
				{2, 1, 2, 3, 2, 4, 2, 5},
				{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
		};
		
		for(int i = 0; i < answers.length; i++){
			if(arr[0][i%5] == answers[i]){
				answer[0]++;
			}
			if(arr[1][i%8] == answers[i]){
				answer[1]++;
			}
			if(arr[2][i%10] == answers[i]){
				answer[2]++;
			}
		}
		
		ArrayList<Integer> answerList = new ArrayList<>();
		int max = (answer[0] > answer[1]) && (answer[0] > answer[2]) ? answer[0] : (answer[1] > answer[2] ? answer[1] : answer[2]);
		
		for(int i = 0; i < answer.length; i++){
			if(answer[i] == max){
				answerList.add(i + 1);
			}
		}
		System.out.println(Arrays.toString(answerList.stream().mapToInt(i -> i).toArray()));
		
	}

}
