import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();
        int[] arr = new int[26];

        for(int i=0; i<word.length(); i++){
            arr[word.charAt(i)-97]++;
        }
        for (int j : arr) {
            sb.append(j).append(" ");
        }

        System.out.println(sb);

    }
}