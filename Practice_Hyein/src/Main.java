import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int[] array = new int[26];		
		
		for(int i=0; i<26; i++)
			array[i] = -1;				
		
		for(int i=0; i<word.length(); i++)
		{
			char a = word.charAt(i);
		
			if(array[a - 'a'] == -1)	
				array[a - 'a'] = i;		
		}
		
		for (int i=0; i < 26; i++)
			System.out.print(array[i] + " ");
	}
}
