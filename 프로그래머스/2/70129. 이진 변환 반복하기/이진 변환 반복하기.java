class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int count = 0;
        int zero = 0;
        
        while(!s.equals("1")) {
            int originalLength = s.length();
            s = s.replace("0", "");
            int newLength = s.length();
            
            zero += (originalLength - newLength);
            s = Integer.toBinaryString((newLength));
            count++;
        }
        return new int[] {count, zero};
    }
}