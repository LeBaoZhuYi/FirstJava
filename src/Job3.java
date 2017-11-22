
public class Job3 {

	public Node head;
	
	// 没有环则返回null，有则返回环入口
	public Node isCircle() {
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job3 job = new Job3();
		job.head = new Node(1);
		for(int i = 2; i < 12; i ++) {
			job.head.insertTail(new Node(i));
		}
		job.head.insertTail(new Node(12, job.head.next.next.next.next.next));
		Node enter = job.isCircle();
		if(enter == null) System.out.println("no circle");
		else System.out.println("is circle, enter val is " + enter.val);
	}

}