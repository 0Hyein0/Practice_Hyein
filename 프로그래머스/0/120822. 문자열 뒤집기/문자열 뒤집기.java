class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer str = new StringBuffer(my_string);
        answer = str.reverse().toString();
        return answer;
    }
}