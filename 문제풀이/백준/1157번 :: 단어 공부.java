import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] array = new int[26];		// 알파벳 담을 배열 (아스키 코드 활용)
		
		for(int i=0; i<word.length(); i++)
		{	
			if(word.charAt(i) > 96 && word.charAt(i) < 123) // 입력된 문자가 소문자일 경우
				array[word.charAt(i) - 32 - 65]++;		// -32로 대문자 아스키 코드로 변경  -65로 a부터 배열의 0번재 방에 ++
			else
				array[word.charAt(i) - 65]++;
		}
		
		
		int max = -1;
		char result = 0;
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
				result = (char)(i+65);	// 숫자로 저장되어 있는 배열의 값을 +65해주며 대문자 알파벳으로 변경
			}
			else if (array[i] == max)	// max 와 일치하는 값이 있을 경우에는 ? 출력되도록 하는 조건문
				result = '?';
		}
		System.out.println(result);
		
		sc.close();
	}
}

	
