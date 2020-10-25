package b10.danh_sach.bai_tap.linked_list;

public class MyLinkedList<E> {

    private class  Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }

    private Node head;
    private int numNodes; // so phan tu trong dang sach

    public MyLinkedList() {
    }

    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element){
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 && temp.next!= null ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index ; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size(){
        return numNodes;
    }

    public E remove(int index) throws IllegalAccessException {
        if(index<0 || index>numNodes){
            throw new IllegalAccessException("error index" + index);
        }
        Node temp = head;

        Object data;

        if(index==0){
            data = temp.data;
            head = head.next;
            numNodes--;
        }else {
            for (int i = 0; i < index-1 && temp.next!= null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) throws IllegalAccessException {
        if(head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node temp = head;
            while (temp.next!=null){
                if(temp.data.equals(element)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
            return false;
        }
    }

    public MyLinkedList<E> clone(){
        if (numNodes==0){
            throw new NullPointerException("failled");
        }
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node temp = head;
        returnLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp.next!= null){
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean contains(E element){
        Node temp = head;
        while (temp.next!= null){
            if(temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if(temp.data.equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}
