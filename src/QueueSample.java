import java.util.LinkedList;
public class QueueSample {
    public static void main(String[] args){
        LinkedList<Integer>queue=new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("Queue: " + queue);

        int front = queue.remove();
        System.out.println("Removed element: " + front);

        int front1 = queue.remove();
        System.out.println("Removed element: " + front1);

        System.out.println("Queue after removal: " + queue);


    }
}
