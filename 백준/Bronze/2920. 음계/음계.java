import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[8];

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<8; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        boolean asc = true;
        boolean desc = true;
        for(int i=0; i<input.length-1; i++) {
            if(input[i] < input[i+1])
                desc = false;
            else if(input[i] > input[i+1])
                asc = false;
        }

        if(asc)
            System.out.println("ascending");
        else if(desc)
            System.out.println("descending");
        else
            System.out.println("mixed");


    }
}