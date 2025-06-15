class stack {
    private int[] stac;
    private int top;
    private int cap;
    public stack(int size) {
        stac = new int[size];
        cap = size;
        top = -1;
    }
    public void push (int value) {
        if (isFull()) {
            System.out.println("Overflow State");
        }
        stac[++top] = value;
        System.out.println(value + "Added in the stack");
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Undeflow State");
        }
    }
}