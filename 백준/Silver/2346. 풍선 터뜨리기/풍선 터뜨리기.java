import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        for(int i=0; i<N; i++) {
            deque.add(new int[]{i+1, Integer.parseInt(st.nextToken())});
        }

        while (!deque.isEmpty()) {
            int[] current = deque.poll();
            int index = current[0];
            int move = current[1];
            sb.append(index).append(" ");

            if(deque.isEmpty())
                break;

            if(move > 0) {
                for(int i=0; i<move-1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            }
            else {
                for(int i=0; i<Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb);
    }
}