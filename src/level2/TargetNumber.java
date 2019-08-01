package level2;

public class TargetNumber {
	
	
//	타겟 넘버
//	문제 설명
//	n개의 음이 아닌 정수가 있습니다. 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다. 예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
//
//	-1+1+1+1+1 = 3
//	+1-1+1+1+1 = 3
//	+1+1-1+1+1 = 3
//	+1+1+1-1+1 = 3
//	+1+1+1+1-1 = 3
//	사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		
		System.out.println(all(numbers,target,0,0));
		// 각 번호마다 +일때, -일때를 따로 구한다음 재귀를 통해서 전체를 다 구한다.
		// target에 맞는곳만 1을 더한다.
		
		
	}
	
	public static int all(int[] numbers, int target, int index, int number){
		if(index < numbers.length){
			return all(numbers, target, index+1, number + numbers[index]) + all(numbers, target, index+1, number - numbers[index]);
		}else{
			return number == target ? 1: 0;
		}
	}

}
