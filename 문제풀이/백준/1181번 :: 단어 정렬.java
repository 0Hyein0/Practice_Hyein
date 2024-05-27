import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0; i<N; i++)
			set.add(br.readLine());
		
		ArrayList<String> arr = new ArrayList<String>(set);
		
		Collections.sort(arr, new Comparator<String>()
		{
			@Override
			public int compare(String x, String y)
			{
				if(x.length() == y.length())
					return x.compareTo(y);
				else
					return x.length() - y.length();
			}
		});
		
		for(int i=0; i<arr.size(); i++)
			sb.append(arr.get(i)).append("\n");
		
		System.out.println(sb);
	}
}
