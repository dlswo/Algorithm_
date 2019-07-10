import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Budget {
	
//	예산
//	코드 에디터의 단축키를 설정하는 옵션입니다. 선호하는 에디터 옵션이 없다면 sublime을 선택해 주세요.
//	문제 설명
//	S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다. 그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다. 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.
//
//	물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다. 예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.
//
//	부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
	public static void main(String[] args) {
		int[] d = {2, 2, 3, 3};
		int budget = 10;
		List<Integer> list = Arrays.stream(d).boxed().collect(Collectors.toList());
		Collections.sort(list);
		int min = 0;
		int answer = 0;
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		if(sum < budget){
			System.out.println(list.size());
		}
		while(min < budget){
			min += list.get(0);
			list.remove(0);
			answer++;
		}
		
		System.out.println(answer = min == budget ? answer : answer - 1);
	}
}
