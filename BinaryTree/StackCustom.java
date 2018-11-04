public class BinaryTreeEx{
	public void PreOrder(TreeNode root){
		System.out.println(root.data);
		PreOrder(root.left);
		PreOrder(root.right);
	}
}
