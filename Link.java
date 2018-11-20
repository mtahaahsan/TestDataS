public class Link {

    public int value;
    public String name;
    public Link next;

    public Link (int v, String n)
    {
        value = v;
        name = n;
    }

    public void displayLink()
    {
        System.out.println("{" + name + ", " + value + "}");
    }

}
