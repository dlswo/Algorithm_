import java.util.Arrays;
import java.util.Collections;

public class IntDesc {

//    정수 내림차순으로 배치하기
//    문제 설명
//    함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
    public static void main(String[] args) {
        long n = 1183722121;
        long answer = 0;

        String str = n + "";
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String answerStr = "";
        for(int i = 0 ; i < arr.length; i++){
            answerStr += arr[i];
        }

        answer = Long.parseLong(answerStr);
        System.out.println(answer);
    }
}
