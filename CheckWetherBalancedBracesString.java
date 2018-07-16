package CricBuzz;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import linkedlist.MyLinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class CheckWetherBalancedBracesString {

    public static void main(String[] args) {
        String balancedBraceStr = "{[({})]}[]{}()";
        String unBalancedBraceStr = "{][({})]";
        System.out.println(balancedBraces(balancedBraceStr));
        System.out.println(balancedBraces(unBalancedBraceStr));
    }

    public static String balancedBraces(String str){
        Stack<Character> stack = new Stack<Character>();
        boolean isYes = true;
        for(Character ch: str.toCharArray()){
            switch (ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek()=='{'){
                        stack.pop();
                    }else{
                       isYes = false;
                    }
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek()=='['){
                       stack.pop();
                    }else{
                        isYes = false;
                    }
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    }else{
                        isYes = false;
                    }
                    break;
            }
            if(!isYes){
                break;
            }
        }
        return isYes?"YES":"NO";
    }
}
