class Solution {
    
    public int solution(int slice, int n) {
      //if (slice%n == 0;){
          return n%slice == 0 ? n/slice : n/slice + 1;
      }
}
       