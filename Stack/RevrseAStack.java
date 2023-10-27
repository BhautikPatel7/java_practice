package Stack;
// One Stack Is Given Revrse A Stack 

import java.util.Stack;

public class RevrseAStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Printstack(s);
        Revresestack(s);
        Printstack(s);
        

    }

    public static void Revresestack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        Revresestack(s);
        pushAtBottom(s, top);
    }

    public static void Printstack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop() );
        }
    }

    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }
}

