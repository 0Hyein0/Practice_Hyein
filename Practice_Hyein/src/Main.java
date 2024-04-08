import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// 11720번
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String num = sc.next();
		int result = 0;
		
		for(int i=0; i<n; i++)
			result += num.charAt(i)-'0';
		
		System.out.println(result);
		sc.close();
	}
}
