import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int sum = 0;    // 평균을 구하기 위한 sum
        int[] num = new int[8001];  // 최빈값 구하기 위한 배열

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            num[arr[i]+4000]++;
        }

        // 산술평균 구하기
        int avg = (int) Math.round((double)sum/N);

        // 중앙값 구하기
        Arrays.sort(arr);
        int center = arr[N/2];

        // 최빈값 구하기
        int max = 0;
        int count = 0;
        boolean flag = false;

        for(int i=0; i<num.length; i++)
        {
            if(num[i] > max){
                count = i-4000;
                max = num[i];
                flag = true;
            }
            else if(num[i]==max && flag) {
                count = i-4000;
                flag = false;
            }
        }

        // 범위 구하기
        int range = arr[N-1] - arr[0];

        sb.append(avg).append("\n");
        sb.append(center).append("\n");
        sb.append(count).append("\n");
        sb.append(range);

        System.out.println(sb);

    }
}