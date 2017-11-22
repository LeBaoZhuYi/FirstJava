class Node{
	public Node next;
	public int val;
	
	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
	
	public Node(int val) {
		this(val, null);
	}
	
	public Node(Node next) {
		this(0, next);
	}
	
	public Node() {
		this(0, null);
	}
	
	public void insertTail(Node node) {
		Node temp = this;
		while(!(temp.next == null)) temp = temp.next;
		temp.next = node;
	}
	
	public void printAll() {
		Node temp = this;
		System.out.println("A List:");
		while(!(temp == null)) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("");
	}
}
