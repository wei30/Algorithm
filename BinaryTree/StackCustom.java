public class BinaryTreeEx{
	public void PreOrder(TreeNode root){
		System.out.println(root.data);
		PreOrder(root.left);
		PreOrder(root.right);
	}
	public void PreOrderIterative(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root == null){//if tree has nothing
			return;
		}
		//if tree has some node
		while(!stack.empty()){//loop to check if the stack if is not empty
			TreeNode n = stack.pop();
			System.out.println(n.data);
			if(n.left != null){
				stack.push(n.left);
			}else{
				stack.push(n.right);
			}
		}
		
	}
	public void InOrder(TreeNode root){
		InOrder(root.left);
		System.out.println(root.data);
		InOrder(root.right);
	}
	public void PostOrder(TreeNode root){
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.println(root.data);
	}
}
