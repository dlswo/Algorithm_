package level2;

import java.util.Arrays;

public class MaxMin {
	
//	최댓값과 최솟값
//	코드 에디터의 단축키를 설정하는 옵션입니다. 선호하는 에디터 옵션이 없다면 sublime을 선택해 주세요.
//	문제 설명
//	문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요.
//	예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3 -4라면 -4 -1을 리턴하면 됩니다.
	public static void main(String[] args) {
		String s = "1 2 3 -4";
		String[] arr = s.split(" ");
		int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println(min + "==" + max);
	}

}
