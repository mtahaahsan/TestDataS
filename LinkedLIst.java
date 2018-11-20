public class LinkedLIst {

    private Link first;

    public LinkedLIst()
    {
        first = null;
    }

    public boolean isEmpty()
    {
        return (first == null);
    }

    public void insertLink(int v, String n)
    {
        Link newLink = new Link(v, n);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteLink()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList()
    {
        System.out.println("List (first -> last): ");
        Link current  = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
    }

    public Link findLink(int key)
    {
        Link current = first;
        while(current.value != key)
        {
            if(current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }

    public Link deleteLink(int key)
    {
        Link current = first;
        Link previous = first;

        while(current.value != key)
        {
            if(current.next == null)
                return null;
            else
                previous = current;
                current = current.next;
        }

        if (current == first)
            first = first.next;
        else
            previous.next = current.next;

        return current;

    }



}
