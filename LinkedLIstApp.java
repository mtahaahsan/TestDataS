public class LinkedLIstApp {

    public static void main(String [] args)
    {
        LinkedLIst linkedLIst = new LinkedLIst();
        linkedLIst.insertLink(14, "Taha");
        linkedLIst.insertLink(21, "Omer");
        linkedLIst.insertLink(13, "Aimmun");
        linkedLIst.insertLink(44, "Happy");
        linkedLIst.insertLink(101, "Tony");

        linkedLIst.displayList();

        while(linkedLIst.isEmpty() == false)
        {
            Link aLInk = linkedLIst.deleteLink();
            System.out.print("Deleted ");
            aLInk.displayLink();
        }

        linkedLIst.displayList();
    }
}
