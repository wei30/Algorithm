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
			root = stack.pop();
			System.out.println(root.data);
			if(root.right != null){
				stack.push(root.right);
			}
			if(root.left != null){
				stack.push(root.left);
			}
		}
		
	}
	public void InOrder(TreeNode root){
		InOrder(root.left);
		System.out.println(root.data);
		InOrder(root.right);
	}
	public void InOrderIterative(TreeNode root){
		Stack<TreeNode> stack  = new Stack<TreeNode>();
		if(root == null)return;
		while(true){
			if(root != null){//starting from the root, iterate to left 
				stack.push(root);
				root =root.left;
				
			}else{
				if(stack.empty()) break;//if root is null and stack is empty then you break out the loop
				//loop all the way to the left node
				//you can print if no more left node
				root = stack.pop();
				System.out.println(root.data);
				root = root.right;	
			}
		}
		
	}
	public void PostOrder(TreeNode root){
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.println(root.data);
	}
	
	public void PostOrderIterative(TreeNode root){
		//check if root is null
		if(root == null)return;
		//start looping, left right and node
	        //using two stack for this problem
		Stack<TreeNode> sk1 = new Stack<TreeNode>();
		Stack<TreeNode> sk2 = new Stack<TreeNode>();
		//push root into stack 1
		sk1.push(root);
		while(!sk1.empty()){
			root = sk1.pop();
			sk2.push(root);
			if(root.right != null){
				sk1.push(root.right);
			}
			if(root.left != null){
				sk1.push(root.left);
			}
	         while(!sk2.empty()){
			 root = sk2.pop();
			 System.out.println(root.data);
		 }
		}
	}
}
