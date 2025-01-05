import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
    

        HashMap<String, Integer> clothesNum = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            if (clothesNum.containsKey(clothes[i][1])) {
                clothesNum.put(clothes[i][1], clothesNum.get(clothes[i][1]) + 1);
            } else {
                clothesNum.put(clothes[i][1], 1);
                
            }
        }
        int answer = 1;
        Iterator<Integer> it = clothesNum.values().iterator();
        while (it.hasNext()) {
            answer *= it.next() + 1;
        }
        return answer - 1;
    }
}