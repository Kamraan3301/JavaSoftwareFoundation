public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(7);
        list.insert(9);
        list.insert(13);
        list.insert(15);
        list.insert(17);
        list.insertAtStart(25);
        list.insertAtLoc(2, 993);
        list.delete(3);
        list.show();
        ;

    }
}
