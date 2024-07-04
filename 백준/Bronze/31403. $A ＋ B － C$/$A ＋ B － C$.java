import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int cal = A+B-C;

        String D = "";
        D += A;
        D += B;
        int E = Integer.parseInt(D);

        sb.append(cal).append("\n");
        sb.append(E-C);

        System.out.println(sb);
    }
}
