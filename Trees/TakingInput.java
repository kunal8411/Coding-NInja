package trees;

import java.util.ArrayList;

public class TreeNode<T> {
	public T data;
	public ArrayList<TreeNode<T>> chidren;

	
	public TreeNode(T data) {
		this.data=data;
		chidren=new ArrayList<>();
		
	
	}
}

+++++++++++++++++++++++++++++++++++++++++++++++++++
package trees;

import java.util.Scanner;

public class TreeUse {

	public static TreeNode<Integer> takeInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of next node");
		int n= scan.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		
		System.out.println("Enter number of childrens for"+ n);
		int childcount=scan.nextInt();
		for(int i=0;i<childcount;i++)
		{
			TreeNode<Integer>child=takeInput();
			root.chidren.add(child);
		}
		return root;
	}
	public static void print(TreeNode<Integer> root)
	{
		String s=root.data+":";
		for(int i=0;i<root.chidren.size();i++)
		{
			s=s+root.chidren.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.chidren.size();i++)
		{
			print(root.chidren.get(i));
			
		}
		
	}
	public static void main(String[] args) {
		TreeNode<Integer> root = takeInput();
		print(root);
//		TreeNode<Integer> node1= takeIntput();
//		TreeNode<Integer>node2=takeIntput();
//		TreeNode<Integer>node3= takeIntput();
//		
		
	

	}

}
