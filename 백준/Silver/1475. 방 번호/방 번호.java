import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int[] arr = new int[9];
        int max = 0;

        for(int i=0; i<N.length(); i++) {
            int num = N.charAt(i) - '0';
            if(num == 9)
                num = 6;
            arr[num]++;
        }

        arr[6] = arr[6] % 2 ==0 ? arr[6] / 2 : (arr[6]/2)+1;

        for (int j : arr) max = Math.max(max, j);

        System.out.println(max);




    }
}