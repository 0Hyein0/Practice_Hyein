import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        int gcd = 0;

        for(int i=0; i<N-1; i++)
        {
            int distance = arr[i+1] - arr[i];
            gcd = gcd(distance, gcd);
        }
        System.out.println((arr[N-1]-arr[0])/gcd+1-N);
    }
    public static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}