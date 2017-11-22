import java.util.List;

// 注意，这整个类都是你的，并不是只能写函数，可能要考虑加一些辅助用的属性
public class Job2 {

	public List<Integer> stack;
	
	public int pop() {
		return -1;
	}
	
	public void push(int v) {
		
	}
	
	public int min() {
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job2 job = new Job2();
		System.out.println(job.min());
		job.push(2);
		System.out.println(job.min());
		job.push(1);
		job.push(3);
		job.push(1);
		System.out.println(job.min());
		job.push(2);
		job.pop();
		job.pop();
		job.pop();
		System.out.println(job.min());
		job.push(3);
		job.push(2);
		System.out.println(job.min());
		job.pop();
		job.push(2);
		job.push(4);
		System.out.println(job.min());
	}

}