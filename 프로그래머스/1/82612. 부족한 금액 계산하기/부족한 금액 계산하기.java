class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        
        long amount = 0;
        for(int i=1; i<=count; i++)
            amount += price*i;
        
        if(amount > money)
            answer = amount - money;
        else
            answer = 0;

        return answer;
    }
}