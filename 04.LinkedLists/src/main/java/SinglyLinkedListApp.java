public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList mylist = new MySinglyLinkedList();
        System.out.println(mylist.isEmpty());

        for (int i = 0; i < 10; i++) {
            mylist.add(i);
        }

        mylist.printNodes();
        System.out.println("kth item from the last : " + mylist.getKthItemFromLast(1));
        mylist.removeKthItemFromLast(1);
        mylist.printNodes();

    }

}
