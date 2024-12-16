import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();

            if(str.equals("#"))
                break;

            str = str.toLowerCase();
            int count = 0;
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c=='a' || c=='e' || c=='o' || c=='u' || c=='i')
                    count++;
            }
            System.out.println(count);

        }



    }
}