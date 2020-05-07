package Algorithm4笔记;

import java.util.Scanner;
import java.util.Stack;

public class 括号解释器 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double ans = calculate(s);
        System.out.println(ans);
    }
    public static Double calculate(String s){
        double ans = 0;

        Stack<Double> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();
        //((1+2)*3)
        //
        //
        for (int i = 0; i< s.length(); i++) {
            System.out.println(i);

            switch (s.charAt(i)) {
                case '+':
                    stack1.push('+');
                    break;
                case '-':
                    stack1.push('-');
                    break;
                case '*':
                    stack1.push('*');
                    break;
                case '/':
                    stack1.push('/');
                    break;
                case ')':
                    char x = stack1.pop();
                    ans = stack.pop();
                    System.out.println("xxxx:"+i+"--"+ans);
                    if (x == '+') {
                        ans += stack.pop();
                    } else if (x == '-') {
                        ans -= stack.pop();
                    } else if (x == '*') {
                        ans *= stack.pop();
                    } else if (x == '/') {
                        ans /= stack.pop();
                    }
                    stack.push(ans);

                    break;
                case '(':
                    break;
                default:
                    stack.push((double)s.charAt(i)-48);
                    break;
            }
        }
        return stack.pop();
    };
}
