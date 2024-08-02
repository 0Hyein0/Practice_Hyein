import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Integer> odd = new ArrayList<>();

        for(int i=0; i<7; i++){
            int num = Integer.parseInt(br.readLine());
            if(num % 2 != 0)
                odd.add(num);
        }

        
        

        if(odd.isEmpty())
            sb.append(-1);
        else {
            Collections.sort(odd);
            int sum = 0;
            for(int num : odd) {
                sum += num;
            }
            sb.append(sum).append("\n");
            sb.append(odd.get(0));
        }
            
        System.out.println(sb);


    }
}