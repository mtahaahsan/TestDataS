public class QueueApp {

    public static void main (String [] args)
    {
        Queue queue = new Queue(5);
        queue.enque(4);
        queue.enque(12);
        queue.enque(14);
        queue.enque(31);
//        queue.enque(3);
//        queue.enque(13);

        queue.deque();
        queue.deque();
        queue.deque();

        queue.enque(24);
        queue.enque(111);
        queue.enque(10);
        queue.enque(44);

        while(queue.isEpmty() == false)
        {
            double temp = queue.deque();
            System.out.println(temp);
        }
    }
}
