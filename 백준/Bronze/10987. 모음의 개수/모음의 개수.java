import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int count = 0;

        for(int i=0; i<word.length(); i++) {
            char vowel = word.charAt(i);
            if(vowel=='a' || vowel=='e' || vowel=='i' || vowel=='o' || vowel=='u')
                count++;
            }
        System.out.println(count);

    }
}