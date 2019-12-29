package Stacks;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackExamples {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(6);
        stack.push(9);
        stack.push(2);

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());
            //print first
        }
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(5);
        q.offer(6);
        q.offer(9);
        q.offer(2);

        for (int i = 0; i < q.size(); i++) {
            System.out.println(q.poll());
            //print first
        }


        int[] nums = new int[] {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        };

        // home work, use stack internally


//        Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
//        determine if the input string is valid.
//
//                An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//                Open brackets must be closed in the correct order.
//        Note that an empty string is also considered valid.
//
//                Example 1:

//        Input: "()"
//        Output: true
//        Example 2:
//
//        Input: "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: "(]"
//        Output: false
//        Example 4:
//
//        Input: "([)]"
//        Output: false
//        Example 5:
//
//        Input: "{{{{{ }}}}}" //true
        //1. into loop , where you have to one by one character
        //2 devide the length by 2. if the length if odd, then what, ????

//        Input: "{{ } }}" //false
//
//
//        Input: "{[]}"
//        Output: true
    }
}
