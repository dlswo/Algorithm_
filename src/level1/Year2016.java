package level1;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Year2016 {

 //
//    문제 설명
//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//    입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
//
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        String answer = "";
        int count = 0;

        Calendar cal = Calendar.getInstance();
        cal.set( 2016, 0, 1);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2016, a -1, b);
        while(!cal.after(cal2)){
            cal.add(Calendar.DATE, 1);
            count++;
        }

        switch (count % 7){
            case 5 : answer = "TUE";
                break;
            case 6 : answer = "WED";
                break;
            case 0 : answer = "THU";
                break;
            case 1 : answer = "FRI";
                break;
            case 2 : answer = "SAT";
                break;
            case 3 : answer = "SUN";
                break;
            case 4 : answer = "MON";
                break;
        }
        System.out.println(count);
        System.out.println(answer);

    }
}
