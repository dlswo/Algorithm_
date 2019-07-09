import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Training {

//    체육복
//    문제 설명
//    점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
//
//    전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1, 3, 5};
        int[] reserve = {2, 4, 5};
        int answer = 0;
        List<Object> ListLost = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Object> ListReserve = Arrays.stream(reserve).boxed().collect(Collectors.toList());

        for(Iterator<Object> iter = ListLost.iterator(); iter.hasNext(); ){
            int Lost = (int) iter.next();
            for(Iterator<Object> iter2 = ListReserve.iterator(); iter2.hasNext(); ){
                int Reserve = (int) iter2.next();
                if(Lost == Reserve){
                    iter.remove();
                    iter2.remove();
                    break;
                }
            }
        }

        for(Iterator<Object> iter = ListLost.iterator(); iter.hasNext(); ){
            int Lost = (int) iter.next();
            for(Iterator<Object> iter2 = ListReserve.iterator(); iter2.hasNext(); ){
                int Reserve = (int) iter2.next();
                    if(Lost - 1 == Reserve){
                    iter.remove();
                    iter2.remove();
                    break;
                }else if(Lost + 1 == Reserve){
                    iter.remove();
                    iter2.remove();
                    break;
                }
            }
        }
        answer = n - ListLost.size();
        System.out.println(answer);
    }
}
