class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 ==0)
         {
             answer = answer + s.charAt((s.length()-2)/2);
             answer = answer + s.charAt(s.length()/2);
         }
        else
            answer = answer + s.charAt((s.length()-1)/2);
            
        return answer;
    }
}