import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String str = my_string;
        String removed = str.replace(letter, "");
        return removed;
    }
}