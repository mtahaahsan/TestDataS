public class Queue {

    private int front;
    private int rear;
    private double[] queueArray;
    private int nElems;
    private int maxSize;

    public Queue(int n)
    {
        maxSize = n;
        queueArray = new double[maxSize];
        front = 0;
        rear = -1;
        nElems = 0;
    }

    public void enque(int number)
    {
        if (rear == maxSize -1)
            rear = -1;
        queueArray[++rear] = number;
        nElems++;
    }

    public double deque()
    {
        double temp = queueArray[front++];
       if(front == maxSize)
           front = 0;
       nElems--;
       return temp;
    }

    public double peek()
    {
        return queueArray[front];
    }

    public boolean isFull()
    {
       return (nElems == maxSize);
    }

    public boolean isEpmty()
    {
        return (nElems == 0);
    }

    public int size()
    {
        return nElems;
    }


}
