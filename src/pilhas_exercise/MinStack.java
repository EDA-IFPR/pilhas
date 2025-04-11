package pilhas_exercise;

class MinStack {
    Node top;
    int size;
    
    public void push(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    public void pop() {
        if (top != null) {
            int data = top.data;
            top = top.next;
            size--;
        }
    }
    
    public int top() {
        if (top != null) {
            return top.data;
        } else {
            return -1;
        }
    }
    
    public int getMin() {
        if (top == null) {
            return -1;
        }

        int min = top.data;
        Node current = top.next;
        while(current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

}

class Node {
    int data;
    Node next;
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
