import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++)
		{
			String[] array = br.readLine().split(" ");		// 공백을 기준으로 나눔
			int s = Integer.parseInt(array[0]);				// 1번 째 (0번 방)에는 각 문자를 반복할 횟수
			String word = array[1];							// 2번 째 (1번 방)에는 문자열
			
			for (int j=0; j<word.length(); j++)
				for(int k=0; k<s; k++)
					System.out.print(word.charAt(j));
			
			System.out.println();
		}
		
		
	}
}
