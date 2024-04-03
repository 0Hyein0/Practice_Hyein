import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] array = new int[30];
		
		for(int i=0; i<28; i++)
		{
			int n = sc.nextInt(); 
			array[n-1] = 1;
		}

		for(int i=0; i<30; i++)
			if (array[i] != 1)
				System.out.println(i+1);
		
		sc.close();
	}
}
