package level1;
public class CaesarPassword {

//    시저 암호
//    문제 설명
//    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4, result = 0;
        String answer = "";

        for(int i = 0 ; i < s.length(); i++){
            int temp = (int) s.charAt(i);
            if(temp == 32){
                result = temp;
            }else if(temp <= 90){
                result = temp + n;
                result = result > 90 ? result - 26  : result;
            }else {
                result = temp + n;
                result = result > 122 ? result - 26  : result;
            }
            answer += Character.toString((char)result);
        }
        System.out.println(answer);
    }
}
