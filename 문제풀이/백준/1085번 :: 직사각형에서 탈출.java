import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int minWidth = (w-x)<x ? (w-x) : x;
		int minHeight = (h-y)<y ? (h-y) : y;
		
		if(minWidth < minHeight)
			System.out.println(minWidth);
		else
			System.out.println(minHeight);
	
			
	}
}
