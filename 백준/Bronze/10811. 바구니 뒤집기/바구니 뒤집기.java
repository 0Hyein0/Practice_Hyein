import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int x=0; x<N; x++) {
            arr[x] = x+1;
        }

        for(int y=0; y<M; y++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;

            for(int z=i; z<=j; z++) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;

            }
        }

        for(int num : arr)
            sb.append(num).append(" ");

        System.out.println(sb);
    }
}
