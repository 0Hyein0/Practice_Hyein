import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++) {
            String word = br.readLine();
            if(groupWord(word)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean groupWord(String word) {
        boolean[] check = new boolean[26];
        int prev = 0;

        for(int j=0; j<word.length(); j++) {
            int current = word.charAt(j);

            if(current != prev) {
                if(check[current-97])
                    return false;
                check[current-97] = true;
                prev = current;
            }
        }
        return true;
    }
}
