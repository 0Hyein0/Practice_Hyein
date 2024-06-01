import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[N];

        for(int i=0; i<N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++)
        {
            int inputM = Integer.parseInt(st.nextToken());
            if(map.get(inputM) == null) {
                sb.append(0).append(" ");
            }
            else {
                sb.append(map.get(inputM)).append(" ");
            }
        }

        System.out.println(sb);
    }
}