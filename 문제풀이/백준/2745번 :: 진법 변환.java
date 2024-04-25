import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		int num = 0;		// 10진수로 바꾼 값
		int result = 0;
		
		for(int i = str.length()-1,exp = 0; i >= 0; i--,exp++)	//exp : 지수
		{
			char c = str.charAt(i);
			
			if(c >= '0' && c <= '9')
				num = c - '0';
			else
				num = c - 'A' + 10;
			
			result += num * Math.pow(n, exp);
		}
		System.out.println(result);
	}
}
