import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] copy = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            copy[i] = arr[i];
        }

        Arrays.sort(copy);

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<N; i++)
        {
            if(!map.containsKey(copy[i])) {
                map.put(copy[i], count++);
            }
        }

        for(int i=0; i<N; i++)
        {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb);

    }
}