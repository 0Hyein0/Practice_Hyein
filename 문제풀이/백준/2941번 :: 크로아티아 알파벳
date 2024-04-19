import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		String[] array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<array.length; i++)
			if(word.contains(array[i]))
				word = word.replace(array[i], "0");
		
		System.out.println(word.length());
		
		sc.close();
		
	}
}

	
