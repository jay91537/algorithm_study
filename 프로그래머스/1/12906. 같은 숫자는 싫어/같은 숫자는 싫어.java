import java.util.*;

public class Solution {
    public Queue<Integer> solution(int []arr) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1]!=arr[i]) {
                queue.add(arr[i]);
            }
        }
        
        return queue;
    }
}