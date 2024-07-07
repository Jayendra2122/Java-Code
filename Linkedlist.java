class LL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add -first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
           lastNode = lastNode.next;

        }
        lastNode.next=newNode;
    }
        public void printList(){
            if(head==null){
                System.out.println("List is empty");
            }
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
               
    
            }
            System.out.println("null");
        }
//delete first
public void deleteFirst(){
    if(head==null){
        System.err.println("list is empty");
    }
    head.next=head;
}
public void deleteLirst(){
    if(head==null){
        System.err.println("list is empty");
    }
    Node secondLast = head;
    Node lastNode = head.next;
    while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondLast=secondLast.next;

    }
    secondLast.next=null;

}

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();

    }
}
