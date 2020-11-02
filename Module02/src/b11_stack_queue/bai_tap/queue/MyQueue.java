package b11_stack_queue.bai_tap.queue;

public class MyQueue {


    private Node front;
    private Node rear;

    public MyQueue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public MyQueue() {
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public void enQueue(int data){
        Node temp = new Node(data);
        if(front == null){
            front = rear = temp;
        }else{
            rear.link = temp;
            rear= temp;
            rear.link = front;
        }
    }

    public Node deQueue(){
        Node temp = new Node();
        if(front==null){
            return null;
        }else{
            if(front==rear){
                temp = front;
                front = rear =null;
            }else{
                temp = front;
                front = front.link;
                rear.link = front;
            }
        }
        return temp;
    }
}
