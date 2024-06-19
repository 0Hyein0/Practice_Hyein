import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            if(!queue.isEmpty()) {
                int peek = queue.peek();
                queue.poll();
                queue.add(peek);
            }
        }
        for (int num : queue)
            System.out.println(num);
    }
}