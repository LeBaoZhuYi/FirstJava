import java.util.ArrayList;

public class Job4 {

	public TreeNode root;
	
	public Job4(int v) {
		this.root = new TreeNode(v);
	}
	
	public boolean judge() {
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job4 job = new Job4(10);
		job.root.addChilds(new ArrayList<TreeNode>());
		job.root.childs.add(new TreeNode(1));
		job.root.childs.add(new TreeNode(1));
		job.root.childs.add(new TreeNode(1));
		job.root.childs.add(new TreeNode(1));
		job.root.childs.add(new TreeNode(1));
		job.root.childs.add(new TreeNode(1));
	}

}