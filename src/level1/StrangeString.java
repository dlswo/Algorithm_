package level1;
import java.util.Arrays;

public class StrangeString {

//	이상한 문자 만들기
//	문제 설명
//	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	public static void main(String[] args) {
		String s = "try hello world";
		String answer = "";
		int count = 0;
		String[] arr = s.split("");
/*		for(String st : arr){
			for(int i = 0; i < st.length(); i++){
				String stIdx = st.substring(i, i+1);
				stIdx = (i + 1) % 2 == 0 ? stIdx.toLowerCase() : stIdx.toUpperCase();
				answer += stIdx;
			}
			answer += " ";
		}*/
		for(int i = 0 ; i < s.length(); i++){
			if(arr[i].equals(" ")){
				count = 0;
			}else{
				count++;
				arr[i] = (count % 2 == 0) ? arr[i].toLowerCase() : arr[i].toUpperCase();
			}
			answer += arr[i];
		}
		System.out.println(answer);
	}
}
