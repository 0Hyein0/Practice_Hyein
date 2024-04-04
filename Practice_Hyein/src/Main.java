import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		int count = 0;
		boolean flag;
		
		// 배열에 입력 받은 수를 42로 나눈 나머지 저장
		for(int i=0; i<10; i++)
			array[i] = sc.nextInt() % 42;
		
		
		for(int i = 0; i<array.length; i++)
		{
			flag = false;
			
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] == array[j])
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}
