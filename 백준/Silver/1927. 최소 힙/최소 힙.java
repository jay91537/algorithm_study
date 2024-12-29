import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if(x>0){
                priorityQueue.add(x);
            } else if (x==0) {
                if(priorityQueue.isEmpty()) System.out.println(0);
                else {
                    System.out.println(priorityQueue.poll());
                }
            }
        }

    }

}
