import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answerList = new ArrayList<>();

        answerList.add(numbers[0]+numbers[1]);

        for(int k=0; k< numbers.length-1; k++) {
            for (int i = k+1; i < numbers.length; i++) {

                for (int j = 0; j < answerList.size(); j++) {

                    if ((numbers[k] + numbers[i]) == answerList.get(j)) {
                        break;
                    }
                    if(j== answerList.size()-1){
                        answerList.add(numbers[k]+numbers[i]);
                    }

                }

                if (!answerList.contains(numbers[k] + numbers[i])) {
                    answerList.add(numbers[k] + numbers[i]);
                }


            }
        }

        return answerList.stream().sorted().mapToInt(i -> i).toArray();
    }
}