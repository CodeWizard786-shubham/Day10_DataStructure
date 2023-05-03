import java.util.LinkedList;
public class StackSample {
    public static void main(String[] args){
        LinkedList<Integer>stack=new LinkedList<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        int top=stack.removeLast();
        System.out.println("Removed element:"+top);

        System.out.println(stack);
    }
}
