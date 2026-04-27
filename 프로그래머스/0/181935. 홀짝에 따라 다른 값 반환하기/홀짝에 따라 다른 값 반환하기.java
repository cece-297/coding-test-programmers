class Solution {
    public int solution(int n) {
        int result = 0;
        
        // n이 홀/짝인지 비교->홀이면 모든 양의 정수의 합을 return 하고/짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
        
        if (n % 2 == 1) { // n이 홀일 때
            for (int i = 1; i <= n; i+=2) { // 모든 양의 정수
               result += i;
            }
        } else if (n % 2 == 0) { // n이 짝일 때
            for (int i = 2; i <= n; i+=2) { // 모든 양의 정수
               result += i*i;
            }
        }
        return result;
    }
}