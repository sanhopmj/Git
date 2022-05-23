
public class ProGr2 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int num = x;
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        
        return answer;
    }
}
