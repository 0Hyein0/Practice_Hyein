import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<K; i++) {

            int num = Integer.parseInt(br.readLine());
            if(num != 0)
                stack.push(num);
            else
                stack.pop();
        }

        int sum = 0;
        for(int j : stack)
            sum += j;

        System.out.print(sum);
    }
}
