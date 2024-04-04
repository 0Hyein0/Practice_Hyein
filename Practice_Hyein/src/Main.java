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
		
		int n = Integer.parseInt(st.nextToken());
		int score[] = new int[n];
		double max = 0;
		double avg = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++)
		{
			score[i] = Integer.parseInt(st.nextToken());
			if(score[i] > max)
				max = score[i];
		}	
			
		for(int i=0; i<score.length; i++)
			avg += score[i]/max*100;
		
		System.out.println(avg/n);
			
	}
}
