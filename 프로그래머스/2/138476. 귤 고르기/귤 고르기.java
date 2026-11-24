import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0)+1);
        }
        
        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort(Collections.reverseOrder());
        
        int answer = 0;
        int sum = 0;
        for(int count : counts) {
            sum += count;
            answer++;
            if(sum>=k) {
                break;
            }
        }
        return answer;
    }
}