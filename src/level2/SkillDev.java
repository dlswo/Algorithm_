package level2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkillDev {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < progresses.length; i++){
			int count = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
			list.add(count);
		}
		
		int standard = list.remove(0);
		List<Integer> result = new ArrayList<>();
		int count = 1;
		
		while(!list.isEmpty()){
			int num = list.remove(0);
			if(standard >= num){
				count++;
			}else{
				result.add(count);
				count = 1;
				standard = num;
			}
		}
		result.add(count);
		
		System.out.println(result);

		int[] answer = result.stream().mapToInt(i -> i).toArray();
		
		System.out.println(Arrays.toString(answer));
		 
	}
}
