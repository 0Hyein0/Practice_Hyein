import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][15];

        for(int i=1; i<=14; i++)
            arr[0][i] = i;

        for(int i=1; i<=14; i++)
            for(int j=1; j<=14; j++)
                arr[i][j] = arr[i][j-1] + arr[i-1][j];


        for(int i=0; i<T; i++)
        {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}