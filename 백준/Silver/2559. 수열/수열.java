import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;

        // 첫 K개의 합을 계산
        for(int i = 0; i < K; i++) {
            sum += arr[i];
        }
        max = sum;

        // 슬라이딩 윈도우 기법으로 최대 합 계산
        for(int i = K; i < N; i++) {
            sum += arr[i] - arr[i - K];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
