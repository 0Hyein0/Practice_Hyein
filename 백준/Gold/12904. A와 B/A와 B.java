import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder S = new StringBuilder(br.readLine());
        StringBuilder T = new StringBuilder(br.readLine());

        while(T.length() > S.length()) {
            if(T.charAt(T.length()-1)=='A')
                T.deleteCharAt(T.length()-1);
            else {
                T.deleteCharAt(T.length()-1);
                T.reverse();
            }
        }

        if(S.toString().contentEquals(T))
            System.out.println("1");
        else
            System.out.println("0");



    }
}