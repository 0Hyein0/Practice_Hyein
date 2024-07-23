import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> list = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            if(str.equals("ENTER"))
                list.clear();
            else if(!list.contains(str)) {
                list.add(str);
                count++;
            }
        }
        System.out.println(count);
    }
}