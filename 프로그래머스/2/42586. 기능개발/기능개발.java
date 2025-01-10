import java.util.*;

class Solution {
    public Queue<Integer> solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        int[] remain = new int[progresses.length];
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<remain.length; i++) {
            if((100-progresses[i])%speeds[i]==0) {
                remain[i] = (100-progresses[i])/speeds[i];
            }
            else {
                double remainNum = (double) (100 - progresses[i]) /speeds[i]+0.1;
                remain[i] = (int) Math.ceil(remainNum);
            }
        }
        
        int maxKey = remain[0];
        int count = 1;
        
        for(int j=1; j<remain.length; j++) {
        
                if(remain[j]<=maxKey) {
                    if(j==remain.length-1) {
                        queue.add(count+1);
                    } else {
                     count++;   
                    }
                }
                else {
                    if(j==remain.length-1) {
                        queue.add(count);
                        queue.add(1);
                    } else {
                    queue.add(count);
                    count = 1;
                    maxKey = remain[j];
                    }
                }
        }
        
        
        return queue;
    }
}