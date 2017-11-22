import java.util.ArrayList;
import java.util.List;

class TreeNode{
	public List<TreeNode> childs;
	public int val;
	
	public TreeNode(int val) {
		this.val = val;
		this.childs = null;
	}
	
	public void addChilds(ArrayList<TreeNode> childs) {
		this.childs = childs;
	}
}
