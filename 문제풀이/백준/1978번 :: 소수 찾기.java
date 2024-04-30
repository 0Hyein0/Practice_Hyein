import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;		// 소수의 갯수를 저장할 변수
			
			if(arr[i]==1)
				continue;
			
			for(int j=2; j<arr[i]; j++)	// 소수는 1과 자기 자신만 약수로 갖는 수이기 때문에 1과 자기 자신을 제외한 수에서 나머지가 0이 되는 수가 있는지만 확인하면 됨
			{	
				if(arr[i] % j ==0)
				{	
					count++;	
				}
			}	
			if(count == 0)
				result++;
		}
		
		System.out.println(result);
		
	}
}
