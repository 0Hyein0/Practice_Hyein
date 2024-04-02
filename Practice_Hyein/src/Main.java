import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] array = new int[a];

		for(int i=0; i<a; i++)
			array[i] = sc.nextInt();
		
		int max = array[0];
		for(int i=0; i<array.length; i++)
			if(array[i] > max)
				max = array[i];
		
		int min = array[0];
		for(int i=0; i<array.length; i++)
			if(array[i] < min)
				min = array[i];
		
		System.out.println(min + " " + max);
		
		sc.close();
	}
}
