import java.util.*;
class Solution {
    public int[] solution(int n) {
        int num = 0;
        for(int i=1; i<=n; i++) {
            num=num+i;
        }

        int[] answer = new int[num];

        int[][] matrix = new int[n+1][n+1];

        int x=1; int y=0;

        int value =1;

        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++) {

                if(i%3==1){
                    y++;
                }
                else if(i%3==2){
                    x++;
                }
                else if(i%3==0){
                    x--;
                    y--;
                }

                matrix[y][x] = value;
                value++;
            }
        }

        int k = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++){
                if(matrix[i][j] == 0)
                    break;
                answer[k] = matrix[i][j];
                k++;
            }
        }

        return answer;
    }
}