public class Stack {

    private int maxSize;
    private int top;
    private double [] stackArray;

    public Stack(int n)
    {
        maxSize = n;
        stackArray = new double[maxSize];
        top = -1;
    }

    public void push(double number)
    {

        stackArray[++top] = number;

    }

    public double pop()
    {
        return stackArray[top--];
    }

    public double peak()
    {
        return stackArray[top];
    }

    public boolean isFull()
    {
        if(top == maxSize-1)
            return true;
        else
            return false;
    }

    public boolean isEmpty()
    {
        if(top == -1)
            return true;
        else
            return false;
    }


}
