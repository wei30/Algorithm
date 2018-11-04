public class BinaryTreeEx{
	public void PreOrder(TreeNode root){
		System.out.println(root.data);
		PreOrder(root.left);
		PreOrder(root.right);
	}
	public void InOrder(TreeNode root){
		InOrder(root.left);
		System.out.println(root.data);
		InOrder(root.right);
	}
	public void PostOrder(TreeNode root){
	}
}
