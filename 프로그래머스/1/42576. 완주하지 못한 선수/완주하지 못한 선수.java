import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap <String, Integer> completeMan = new HashMap<>();

        ArrayList<String> participantMan = new ArrayList<>();

        for (int i = 0; i < completion.length; i++) {
            if(completeMan.containsKey(completion[i])){
                completeMan.put(completion[i], completeMan.get(completion[i])+1);
            } else {
            completeMan.put(completion[i], 1);
            }
        }

        participantMan.addAll(Arrays.asList(participant));

        String ans = null;
        for (String person : participant) {
            if (completeMan.containsKey(person) && completeMan.get(person) > 0) {
                completeMan.put(person, completeMan.get(person) - 1);
            } else {
                ans = person;
                break;
            }
        }
        return ans;
    }
}