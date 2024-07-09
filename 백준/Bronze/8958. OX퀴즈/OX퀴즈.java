import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            int count = 0;
            int sum = 0;
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    count++;
                    sum += count;
                }
                else
                    count = 0;
            }
            System.out.println(sum);
        }
    }
}