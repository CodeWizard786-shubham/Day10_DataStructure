 class Stack {
    int arr[];
    int top;
    int capacity;

    Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }
    public void push(int x){
        if(isFull()){
          System.out.println("Stack Overflow");
          System.exit(1);
        }
        System.out.println("Element inserted");
        arr[++top] = x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        System.out.println("Element popped");
        return top;
    }
    private boolean isFull(){
        return top==capacity-1;
    }
    private boolean isEmpty(){
       return top==-1;
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}
public class StackMain{
    public static void main(String []args){
        Stack s=new Stack(7);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();


    }
}