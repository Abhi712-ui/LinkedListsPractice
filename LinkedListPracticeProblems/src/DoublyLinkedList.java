import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0; //head == null;
    }

    public int length(){
        return length;
    }

    public void displayForward() {
		if(head == null) {
			return;
		}
		
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void FancyDisplayForward(){
		if(head == null) {
			return;
		}
		
		ListNode temp = head;
		TopPlusSigns();
		while(temp != null) {

			if(temp == tail){
				System.out.print("| " + temp.data + " | /");
			}
			else{
			System.out.print("| " + temp.data + " |" + "-----> ");
		}
			temp = temp.next;
		}
		System.out.println();
		TopPlusSigns();
		System.out.println("null");
	}

	private void TopPlusSigns(){
		ListNode current = head;
		if(head == null) {
			return;
		}

		while(current != null) {
			System.out.print("+---+---+   ");
			current = current.next;
		}
		System.out.println();
	}

	public void FancyDisplayBackward(){
		if(head == null) {
			return;
		}
		
		ListNode temp = tail;
		TopPlusSigns();
		while(temp != null) {

			if(temp == head){
				System.out.print("| " + temp.data + " | /");
			}
			else{
			System.out.print("| " + temp.data + " |" + "-----> ");
		}
			temp = temp.previous;
		}
		System.out.println();
		TopPlusSigns();
		System.out.println("null");
	}

    public void displayBackward() {
		if(head == null) {
			return;
		}
		
		ListNode temp = tail;
		while(temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}
    
    public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}

    public void insertEnd(int value) {
		ListNode newNode = new ListNode(value);
		if(isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		tail = newNode;
		length++;
	}

    public ListNode deleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}

		ListNode temp = head;
		if(head == tail) {
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}

    public ListNode deleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}

		ListNode temp = tail;
		if(head == tail) {
			head = null;
		} else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
		return temp;
	}

}
