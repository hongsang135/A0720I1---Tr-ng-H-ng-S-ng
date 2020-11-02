package b11_stack_queue.bai_tap.queue;

public class Node {
        public Node link;
        public int data;

        public Node(int data) {
            this.data = data;
        }

        public Node() {
        }

        public int getData(){
            return this.data;
        }
}
