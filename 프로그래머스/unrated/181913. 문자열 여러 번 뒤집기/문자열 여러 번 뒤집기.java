import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for (int i =0 ; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            
            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                start += 1;
                end -= 1;
            }
        }
        answer = String.valueOf(arr);
        
        return answer;
    }
}