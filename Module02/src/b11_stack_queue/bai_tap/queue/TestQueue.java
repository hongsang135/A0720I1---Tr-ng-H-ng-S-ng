package b11_stack_queue.bai_tap.queue;

import b11_stack_queue.thuc_hanh.queue.Node;

public class TestQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.deQueue();
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        while (myQueue.getFront() != null){
            System.out.println(myQueue.deQueue().data);
        }
    }
}
