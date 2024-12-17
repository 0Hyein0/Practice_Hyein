import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String j = br.readLine();
        String d = br.readLine();

        if(j.length() < d.length())
            System.out.println("no");
        else System.out.println("go");
    }
}