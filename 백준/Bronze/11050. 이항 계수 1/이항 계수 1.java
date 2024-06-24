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

        System.out.println(binomial(N, K));
    }

    public static int binomial(int N, int K) {
        return factorial(N) / (factorial(N-K) * factorial(K));
    }

    public static int factorial(int X) {
        if(X==0 || X==1)
            return 1;
        else
            return X*factorial(X-1);
    }
}