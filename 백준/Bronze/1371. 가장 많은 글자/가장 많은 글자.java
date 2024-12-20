import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        int[] count = new int[26];

        while((str=br.readLine()) != null) {
            for(int i=0; i<str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    count[str.charAt(i) - 'a']++;
            }
        }

        int max = 0;
        for (int j : count)
            max = Math.max(max, j);

        for(int i=0; i<count.length; i++) {
            if (count[i] == max)
                sb.append((char) (i + 'a'));
        }

        System.out.println(sb);
    }
}