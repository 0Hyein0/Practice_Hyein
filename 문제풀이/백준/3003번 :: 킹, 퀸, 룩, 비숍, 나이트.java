import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int[] chess = {1,1,2,2,2,8};	// 각 피스의 갯수
		
		for(int i=0; i<chess.length; i++)
			System.out.print(chess[i]-Integer.parseInt(st.nextToken()) + " ");
	}
}
