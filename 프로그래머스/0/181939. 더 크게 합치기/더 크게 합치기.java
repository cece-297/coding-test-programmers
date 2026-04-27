class Solution {
    public int solution(int a, int b) {
        
        
        String ab = "" + a + b;
        String ba = "" + b + a;
        
        if (ab.compareTo(ba) >= 0) {
            return Integer.parseInt(ab);
        } else {
            return Integer.parseInt(ba);
        }
        
      
    }
}