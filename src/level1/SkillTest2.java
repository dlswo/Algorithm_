package level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkillTest2 {

	public static void main(String[] args) {
		int[] progresses = {95, 30, 55, 44};
		int[] speeds = {3, 30, 7, 50};
		int[] endDay = new int[progresses.length];
		List<Integer> list = new ArrayList<>();
		list.add(1);
		
		for(int i = 0; i < progresses.length; i++){
			int count = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
			endDay[i] = count;
		}
		for(int i = 0; i < endDay.length; i++){
			for(int j = i + 1; j < endDay.length; j++){
				if(endDay[i] > endDay[j]){
					System.out.println("호우" + i + j);
					list.set(i, list.get(i) + 1);
				}else{
					System.out.println("하이" + i + j);
					list.add(1);
					i = j;
				}
			}
		}
		System.out.println(list);

		int[] answer = list.stream().mapToInt(i -> i).toArray();
		
		System.out.println(Arrays.toString(answer));
		 
	}
}
