public class SquareRoot {

//    정수 제곱근 판별
//    문제 설명
//    임의의 정수 n에 대해, n이 어떤 정수 x의 제곱인지 아닌지 판단하려 합니다.
//    n이 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
    public static void main(String[] args) {
        long n = 121;
        long answer = 0;
        double i =  Math.sqrt(n);
        if((i == Math.floor(i)) && !Double.isInfinite(i)){
        	answer =  (long)Math.pow(i + 1, 2);
        }else{
        	answer = -1;
        }
        System.out.println(answer);
    }
}
