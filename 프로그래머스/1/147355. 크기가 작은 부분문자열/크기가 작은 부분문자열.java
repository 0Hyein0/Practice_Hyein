class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int tLen = t.length();
        int pLen = p.length();
        
        for(int i=0; i<=tLen - pLen; i++)
        {
            Long num = Long.parseLong(t.substring(i, i+pLen));
            if(num <= Long.parseLong(p))
                answer++;
        }
        
        return answer;
    }
}