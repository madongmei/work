import java.util.Arrays;


public class $06_ConstructBinary_Tree {
	public static void main(String[] args) {
		int[] preSort={1,2,4,7,3,5,6,8};
		int[] inSort={4,7,2,1,5,3,8,6};
		BinaryTree root=constructCore(preSort,inSort);
		System.out.println("--------------------------");
		printAfter(root);
	}

	private static BinaryTree constructCore(int[] preSort, int[] inSort) {
		if(preSort==null || inSort==null)
			return null;
		
		if(preSort.length!=inSort.length)
			throw new RuntimeException("Illegal input.");
		BinaryTree root=new BinaryTree();
		for(int i=0;i<inSort.length;i++){
			if(inSort[i]==preSort[0]){
				root.val=inSort[i];
				System.out.println(root.val);
				root.left=constructCore(Arrays.copyOfRange(preSort, 1, i+1), Arrays.copyOfRange(inSort, 0, i));
				root.right=constructCore(Arrays.copyOfRange(preSort, i+1, preSort.length), Arrays.copyOfRange(inSort, i+1, inSort.length));
			}
		}
		return root;
	}
	
	public static void printAfter(BinaryTree node){
		if(node!=null){
			if(node.left!=null) printAfter(node.left);
			if(node.right!=null) printAfter(node.right);
			System.out.println(node.val);
		}
	}
}

/*class BinaryTree{
	public int value;
	public BinaryTree left;
	public BinaryTree right;
}*/
