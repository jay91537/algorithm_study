import java.util.Scanner;

public class Main {

    static int[][] numOfZeroAndOne = new int[41][2];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        numOfZeroAndOne[0][0] = 1; numOfZeroAndOne[0][1] = 0;
        numOfZeroAndOne[1][0] = 0; numOfZeroAndOne[1][1] = 1;

        int T = sc.nextInt();


        for (int i=0; i<T; i++) {
            int inputNum = sc.nextInt();

            for(int k =2; k<=inputNum; k++) {
                numOfZeroAndOne[k][0] = numOfZeroAndOne[k-1][0] + numOfZeroAndOne[k-2][0];
                numOfZeroAndOne[k][1] = numOfZeroAndOne[k-1][1] + numOfZeroAndOne[k-2][1];
            }


            System.out.println(numOfZeroAndOne[inputNum][0]+" "+numOfZeroAndOne[inputNum][1]);

        }

    }
}