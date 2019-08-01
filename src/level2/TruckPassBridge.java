package level2;

import java.util.LinkedList;
import java.util.Queue;

public class TruckPassBridge {

//	다리를 지나는 트럭
//	문제 설명
//	트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
//	※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
//
//	예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7, 4, 5, 6};
		int answer = 0;
		
		// 다리위에 트럭의 시간를 지닌 큐
		Queue<Integer> qu = new LinkedList<Integer>();
		int bridge_sum = 0; // 다리위에서 무게
		int index = 0;
		
		while(index < truck_weights.length){
			//시간은 계속 증가
			answer++;
			int curTruck = truck_weights[index];
			
			// 무게를 비교해서 트럭이 다리가 들어간다
			if(bridge_sum + curTruck <= weight){
				index++;
				bridge_sum += curTruck;
				qu.offer(0);
			}
			
			//다리에 있는 시간만큼 qu를 1씩 증가한다.
			int qLen = qu.size();
			for(int i = 0; i < qLen; i++){
				qu.offer(qu.poll() + 1);
			}
			System.out.println(qu);
			
			//시간이 다리길이만큼 되면 빠져 나간다.
			if(qu.peek() == bridge_length){
				bridge_sum -= truck_weights[index - qu.size()];
				qu.poll();
			}
			
		}
		// 마지막 트럭은 계산을 안했으므로 추가
		answer += bridge_length;
		
		System.out.println(answer);
	}
}
