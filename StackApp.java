public class StackApp {

    public static void main (String [] args)
    {
        Stack stack = new Stack(10);
        stack.push(22);
        stack.push(8);
        stack.push(14);
        stack.push(21);
        stack.push(3);
        stack.push(12);

        while(stack.isEmpty() == false)
        {
            double temp = stack.pop();
            System.out.println(temp);
        }

    }
}
