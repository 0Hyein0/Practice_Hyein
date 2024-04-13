import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		// BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}

		// Scanner
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine())
		{
			String str = sc.nextLine();
			System.out.println(str);
		}
		sc.close();
	}
}
