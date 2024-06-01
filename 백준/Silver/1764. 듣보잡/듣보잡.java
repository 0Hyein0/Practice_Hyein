import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for(int i=0; i<N; i++)
        {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<M; i++)
        {
            String name = br.readLine();
            if(set.contains(name))
                result.add(name);
        }

        Collections.sort(result);
        int count = result.size();
        sb.append(result.size()).append("\n");
        for(String name : result)
        {
            sb.append(name).append("\n");
        }
        System.out.println(sb);

    }
}