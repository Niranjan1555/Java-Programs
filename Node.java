public class Node {
    
        
    
    String data;
    Node next;
    Node head;

    Node (String data) {
        this.data = data;
        this.next = null;
    }

     
     
    
    public void addFirst (String data) {
        Node newNode = new Node(data);
        
        newNode.next = head;
        head = newNode;


    }

    public void printList(){
        Node currentNode = head;
        while(currentNode !=null) {
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
    }
     
    public static void main(String[] args) {
        Node n = new Node("0");

        n.addFirst("10");
        
        n.addFirst("20");
        n.addFirst("30");

        n.printList();
    }
}