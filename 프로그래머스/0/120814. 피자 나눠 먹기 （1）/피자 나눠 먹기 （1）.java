class Solution {
    public int solution(int n) {
        // 1명~7명까지 한 판 8~14명까지 2판 
        // 피자 개수 = n/7 
        /* int answer = 0;
        
        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = ((n / 7) + 1);
        }
      
        return answer;*/
        return (n % 7 == 0) ? (n / 7) : ((n / 7) + 1);
    }
}