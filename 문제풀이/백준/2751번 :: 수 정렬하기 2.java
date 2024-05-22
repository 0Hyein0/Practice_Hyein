import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++)
			arr.add(Integer.parseInt(br.readLine()));	
		
		Collections.sort(arr);
		
		for(int n : arr)
			sb.append(n).append("\n");
		
		System.out.println(sb);
	}
}
