import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 전공평점 = (학점x과목평점) / 학점의 총합
// result = sum / scoreSum

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        double result = 0 ;				// 전공 평점 결과값
		double sum = 0;					// 학점x과목평점
		double scoreSum = 0;			// 학점의 총합
		
		for(int i=0; i<20; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			double score = Double.parseDouble(st.nextToken());	// 입력한 학점
			String grade = st.nextToken();						// 입력한 등급
			
			if(!grade.equals("P"))	// grade가 P이면 계산에서 제외
			{
				scoreSum += score;
				switch (grade)
				{
				case "A+":
					sum += 4.5 * score;
					break;
				case "A0":
					sum += 4.0 * score;
					break;
               case "B+":
                    sum += 3.5 * score;
                    break;
                case "B0":
                    sum += 3.0 * score;
                    break;
                case "C+":
                    sum += 2.5 * score;
                    break;
                case "C0":
                    sum += 2.0 * score;
                    break;
                case "D+":
                    sum += 1.5 * score;
                    break;
                case "D0":
                    sum += score;
                    break;
                case "F":
                    sum += 0.0;
                    break;
				}
			}	
		}
		
		result = sum / scoreSum;
		System.out.println(result);	
	}
}
