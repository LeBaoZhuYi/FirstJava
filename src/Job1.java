
public class Job1 {

	public Node head;
	
	public void reverseUseRecursion() {
		
	}
	
	public void reverseNotUseRecursion() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job1 job = new Job1();
		job.head = new Node(1);
		for(int i = 2; i < 6; i ++) {
			job.head.insertTail(new Node(i));
		}
		job.head.printAll();
	}

}