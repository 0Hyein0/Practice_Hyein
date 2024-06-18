import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            Stack<String > stack = new Stack<>();
            String str = br.readLine();
            boolean flag = true;

            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j)=='(')
                    stack.push(String.valueOf(str.charAt(j)));
                else {
                    if(stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    else
                        stack.pop();
                }

            }

            if(flag && stack.isEmpty())
                sb.append("YES").append("\n");
            else
                sb.append("NO").append("\n");
        }

        System.out.println(sb);

    }
}