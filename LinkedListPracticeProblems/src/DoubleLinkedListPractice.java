
public class DoubleLinkedListPractice {
    public static void main(String[] args) {
       DoublyLinkedList dll = new DoublyLinkedList();
       dll.insertEnd(5);
       dll.insertEnd(67);
       dll.insertEnd(56);
       dll.insertFirst(33);
       dll.displayForward();
       dll.displayBackward();
       dll.FancyDisplayForward();
       dll.FancyDisplayBackward();
    }
}

