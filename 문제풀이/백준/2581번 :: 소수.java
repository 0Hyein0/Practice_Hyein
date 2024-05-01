import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0;
		
		for(int i=M; i<=N; i++)
		{
			int count = 0;
			
			for(int j=2; j<i; j++)
			{
				if(i%j == 0)
					count++;
			}
			
			if(count==0 && i != 1)
				arr.add(i);
		}
		for(int num : arr)
			sum += num;
		
		if(sum != 0)
		{
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
		else
			System.out.println("-1");
		
	}
}
