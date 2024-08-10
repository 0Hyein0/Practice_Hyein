import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];

            for(int j=0; j<N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[0]).append(" ").append(arr[N-1]).append("\n");
        }
        System.out.println(sb);
    }
}