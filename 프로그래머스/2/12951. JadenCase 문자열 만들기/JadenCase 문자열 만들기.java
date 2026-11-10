import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        boolean isFirst = true;
        
        for(char c : s.toLowerCase().toCharArray()) {
            if(isFirst) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(c);
            }
            isFirst = (c == ' ');
        }
        return answer.toString();
    }
}