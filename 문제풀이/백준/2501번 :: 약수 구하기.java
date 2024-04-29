import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int count = 0;
		int result = 0;
		
		for(int i=1; i<=N; i++)
		{
			if(N % i == 0)
				count++;
			if(count==K)
			{	
				result = i;
				break;				// 입력한 K 번째와 count가 같아지면 더 이상 계산하지 않아도 
			}
			
		}
		System.out.println(result);
		
	}
}
