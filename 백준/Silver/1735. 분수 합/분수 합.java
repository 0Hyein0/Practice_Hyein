import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int A = (a*d) + (b*c);
        int B = b*d;

        int gcd = gcd(A, B);
        A /= gcd;
        B /= gcd;
        System.out.println(A + " " + B);
    }

    public static int gcd(int A, int B){
        if(A%B==0) {
            return B;
        }
        return gcd(B, A%B);
    }
}