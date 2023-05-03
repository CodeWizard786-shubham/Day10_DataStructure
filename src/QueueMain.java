import java.util.Scanner;

class Queue {
    private int queue[];
    private int front;
    private int  rear;
    private int size;

    Queue(int size) {
        this.queue = new int[size];
        this.rear = -1;
        this.size = size;
        this.front=0;
    }

    public int getSize() {
        return size;
    }

    public void enQueue(int x){
        if(isFull()){
            System.out.println("Queue is Full");
            System.exit(1);
        }
        System.out.println("Element inserted:"+x);
        queue[++rear] = x;
    }
    public int deQueue(int remove){
        if(isEmpty()){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        System.out.println("Element removed");
        int x=queue[front];
        if(front>=rear){
            front=rear=-1;
        }else
            front=front+remove;
        return x;
        }
    private boolean isFull(){
        return rear==size-1;
    }
    private boolean isEmpty(){
        return rear==-1;
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }
}
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size for Queue:");
        int size=sc.nextInt();
        Queue q = new Queue(size);
        System.out.println("Enter values for Queue");
        for (int i = 0; i < q.getSize(); i++) {
            int n=sc.nextInt();
            q.enQueue(n);
        }
        q.display();
        System.out.println("Enter number of values to remove");
        int remove=sc.nextInt();
        q.deQueue(remove);
        q.display();

    }
}