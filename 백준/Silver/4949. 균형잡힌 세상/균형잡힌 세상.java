import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            String str =  br.readLine();
            if (str.equals("."))
                break;

            Stack<Character> stack = new Stack<>();
            boolean flag = true;

            for(int i=0; i<str.length(); i++)
            {
                char temp = str.charAt(i);
                if(temp == '(' || temp == '[')
                    stack.push(temp);
                else if(temp == ')' || temp == ']')
                {
                    if(stack.isEmpty() || (stack.peek().equals('(') && temp == ']')
                                       || (stack.peek().equals('[') && temp == ')'))
                    {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(flag && stack.isEmpty())
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}