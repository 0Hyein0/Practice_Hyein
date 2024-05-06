import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] x = new int[n];	// x좌표 배열
		int[] y = new int[n];	// y좌표 배열
		
		for(int i=0; i<n; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		int xMax = x[0];
		int yMax = y[0];
		int xMin = x[0];
		int yMin = y[0];
		
		for(int i=0; i<x.length; i++)
		{
			if(xMax < x[i])
				xMax = x[i];
			if(yMax < y[i])
				yMax = y[i];
			if(xMin > x[i])
				xMin = x[i];
			if(yMin > y[i])
				yMin = y[i];
		}
		
		if(n==1)
			System.out.println(0);
		else
			System.out.println((xMax-xMin)*(yMax-yMin));
		
	}
}
