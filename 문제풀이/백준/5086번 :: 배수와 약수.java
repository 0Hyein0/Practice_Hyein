import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0)		// 마지막 줄에는 0이 2개 주어진다는 조건
				break;
			
			if(b % a == 0)
				System.out.println("factor");
			else if(a % b == 0)
				System.out.println("multiple");
			else
				System.out.println("neither");
			
		}
		
		
		
		
	}
}
