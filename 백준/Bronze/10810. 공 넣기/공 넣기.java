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
        int[] arr = new int[N];         // 바구니에 들어있는 숫자 저장할 배열

        for(int x=0; x<M; x++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());   // 시작 바구니
            int j = Integer.parseInt(st.nextToken());   // 끝 바구니
            int k = Integer.parseInt(st.nextToken());   // 바구니에 넣을 번호

            for(int y=i-1; y<j; y++) {
                arr[y] = k;
            }
        }
        for(int num : arr) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
