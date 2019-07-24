package level2;

import java.util.Arrays;

public class Top {
	
	public static void main(String[] args) {
		int[] heights = {3, 9, 9, 3, 5, 7, 2};
		int[] answer = new int[heights.length];
		int heiLen = heights.length;
		
		// 배열의 끝에서부터 비교를 한다.
		for(int i = heiLen - 1; i >= 0; i--){
			int target = heights[i];
			
			for(int j = i - 1; j >= 0; j--){
				System.out.println("i =" + i + ", j = " + j);
				
				//해당 수보다 크면 큰곳의 인덱스를 넣고 break
				if(heights[j] > target){
					answer[i] = j + 1;
					break;
				// 작으면 작으면 0을 넣는다. 
				}else{
					answer[i] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
		
		
	}

}
