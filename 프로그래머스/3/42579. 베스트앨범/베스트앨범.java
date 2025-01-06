import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();

        // <classic : 500+150+800>  <pop : 600+2500>
        HashMap<String, Integer> numByGenres = new HashMap<>();

        // <classic : <0 : 500> , <2 : 150> , <3 : 800>> , <pop : <1 : 600> , <4 : 2500>>
        HashMap<String, HashMap<Integer, Integer>>music = new HashMap<>();

        for(int i = 0; i< genres.length; i++) {
            if(numByGenres.containsKey(genres[i])){
                numByGenres.put(genres[i], numByGenres.get(genres[i])+plays[i]);
                music.get(genres[i]).put(i, plays[i]);
            } else {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                numByGenres.put(genres[i], plays[i]);
            }
        }

        List<String> keySet = new ArrayList<>(numByGenres.keySet());

        // 장르를 총 조회수에 따라 내림차순으로 정렬
        Collections.sort(keySet, (s1, s2) -> numByGenres.get(s2) - numByGenres.get(s1));

        // 정렬된 장르 리스트를 순회하며 각 장르별로 노래를 정렬 (내림차순으로!)
        for(String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genreKey = new ArrayList<>(map.keySet());

            Collections.sort(genreKey, (s1, s2) -> map.get(s2) - map.get(s1));

            answer.add(genreKey.get(0));
            if(genreKey.size()>1){
                answer.add(genreKey.get(1));
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}



