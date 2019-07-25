package level2;

public class Nmultiple {

//	N개의 최소공배수
//	문제 설명
//	두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		// 최대공약수, 최소공배수 함수를 짠다
		// 1,2번째 최소공배수를 구한다
		int answer = lcm(arr[0], arr[1]); 
				
		// 구한수와 다음번쨰의 최소공배수를 구하는 것을 반복한다
		for(int i = 2; i < arr.length; i++){
			answer = lcm(answer, arr[i]);
		}
		
		System.out.println(answer);
	}
	
    public static int gcd(int a, int b) {//최대 공약수 구하는 함수
        while (b != 0) {
            int Temp = a % b;
            a = b;
            b = Temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b) {//최소 공배수 구하는 함수
        return (int) a * b / gcd(a,b);
    }
}
