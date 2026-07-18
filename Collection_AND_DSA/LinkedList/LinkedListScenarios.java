package Collection_AND_DSA.LinkedList;

class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class Main {
    public static void main(String[] args) {
        LinkedListScenarios engine = new LinkedListScenarios();

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.print("Original List: ");
        engine.printList(head);

        engine.insertAfter(head.next, 25);
        System.out.print("After Insertion (25 after 20): ");
        engine.printList(head);

        head = engine.removeTask(head, 20);
        System.out.print("After Deletion (Removed 20): ");
        engine.printList(head);

        head = engine.reverseHistory(head);
        System.out.print("After Reversal: ");
        engine.printList(head);

        Node middle = engine.findMiddleServer(head);
        System.out.println("Middle Node Value: " + (middle != null ? middle.val : "null"));

        boolean hasLoop = engine.hasRedirectLoop(head);
        System.out.println("Has Redirect Loop: " + hasLoop);

        Node streamA = new Node(1);
        streamA.next = new Node(5);
        Node streamB = new Node(2);
        streamB.next = new Node(6);
        
        Node merged = engine.mergeLogStreams(streamA, streamB);
        System.out.print("Merged Sorted Streams: ");
        engine.printList(merged);
    }
}
public class LinkedListScenarios {

    public void insertAfter(Node current, int trackId) {
        if (current == null) return;
        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
    }

    public Node removeTask(Node head, int taskId) {
        if (head == null) return null;
        if (head.val == taskId) return head.next;
        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.val != taskId) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = curr.next;
        }
        return head;
    }

    public Node reverseHistory(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node findMiddleServer(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasRedirectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public Node mergeLogStreams(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}