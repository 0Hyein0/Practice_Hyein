
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] array = new int[a];
		int count = 0 ;
		
		for (int i = 0 ; i<a; i++)
		{
			array[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		for (int j = 0 ; j<array.length; j++)
		{
			if(b == array[j])
				count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}
