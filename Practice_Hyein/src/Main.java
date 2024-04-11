import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");		// str을 공백을 기준으로 문자열로 나눔
		
		System.out.println(st.countTokens());		// st에 남아있는 토큰 갯수 반환
	}
}
