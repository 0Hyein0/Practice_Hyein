class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] check = new boolean[10];
        
        for(int i=0; i<numbers.length; i++)
            if(check[numbers[i]]==false)
                check[numbers[i]] = true;
        for(int i=0; i<check.length; i++)
            if(check[i]==false)
                answer += i;
        return answer;
    }
}