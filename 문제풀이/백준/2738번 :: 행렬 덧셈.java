import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr1 = new int[n][m];		// 첫번째 행렬
		int[][] arr2 = new int[n][m];		// 두번째 행렬
		int[][] result = new int[n][m];		// 첫번째 행렬과 두번째 행렬의 각 원소를 더한 행렬
		
		for(int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<m; j++)
				arr1[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++)
		{	
			st = new StringTokenizer(br.readLine());
		
			for(int j=0; j<m; j++)
				arr2[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				result[i][j] = arr1[i][j] + arr2[i][j];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
				System.out.print(result[i][j] + " ");
			System.out.println();	
		}
	}
}
