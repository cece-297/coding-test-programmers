class Solution {
    public String solution(String my_string, int s, int e) {
        /* my_string.substring(s,e+1);
        String Front = my_string.substring (0,s);
        String Last = my_string.substring (e+1);
        String Reverse = "";
        for (int i = e; i>=s; i--) {
            Reverse += my_string.charAt(i);
        }
        return (Front + Reverse + Last);*/
        
        StringBuilder answer = new StringBuilder();
        StringBuilder flip = new StringBuilder();
        
        answer.append(my_string.substring(0,s));
        flip.append(my_string.substring(s,e+1));
        flip.reverse();
        answer.append(flip);
        answer.append(my_string.substring(e+1));
        
        return answer.toString();
        
    }
}

