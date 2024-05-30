import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<String, String>();

        for(int i=0; i<n; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            if(map.containsKey(name))
            {
                map.remove(name);
            }
            else
            {
                map.put(name, log);
            }

        }
        ArrayList<String> arr = new ArrayList<>(map.keySet());
        arr.sort(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.size(); i++)
        {
            sb.append(arr.get(i)).append("\n");
        }

        System.out.println(sb);

    }
}