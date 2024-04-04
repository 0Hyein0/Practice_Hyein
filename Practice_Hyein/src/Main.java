import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 과목 갯수
		int[] score = new int[n];
		double max = 0;
		double avg = 0;
		
		for(int i=0; i<n; i++)
		{
			score[i] = sc.nextInt();
			if (score[i] > max)
				max = score[i];
		}
		
		for(int i=0; i<score.length; i++)
			avg += (score[i]/max*100);
		
		System.out.println(avg/n);
	}
}
