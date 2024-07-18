import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger result = new BigInteger("1");
        int count = 0;

        for(int i=1; i<=N; i++)
            result = result.multiply(BigInteger.valueOf(i));

        String str = result.toString();
        for(int i=str.length()-1; i>=0; i--) {
            if (str.charAt(i)-'0' == 0)
                count++;
            else
                break;
        }
        System.out.println(count);
    }
}