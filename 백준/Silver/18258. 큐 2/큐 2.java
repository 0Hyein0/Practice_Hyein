import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int back = 0;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            switch (order) {
                case "push":
                    int push = Integer.parseInt(st.nextToken());
                    queue.add(push);
                    back = push;
                    break;
                case "pop":
                    if(queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "front":
                    if (queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(back).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}