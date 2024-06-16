import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int result = A*B*C;
        String Number = String.valueOf(result);
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<Number.length(); j++){
                if(i == Number.charAt(j) - '0')
                    arr[i]++;
            }
        }

        for (int j : arr) {
            sb.append(j).append("\n");
        }

        System.out.println(sb);
    }
}