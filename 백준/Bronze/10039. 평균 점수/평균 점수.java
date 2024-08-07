import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for(int i=0; i<5; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num < 40) {
                num = 40;
                sum += num;
            }
            else
                sum += num;
        }
        int avg = sum/5;
        System.out.println(avg);
    }
}