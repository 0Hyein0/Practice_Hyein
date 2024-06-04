import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int gcd = gcd(a,b);
            int lcm = (a * b) / gcd;

            sb.append(lcm).append("\n");
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b)
    {
        while(b !=0 )
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}