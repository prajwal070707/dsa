package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {	
	static class Node{
	
	int data; 
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}	
	}	
	static class BuildbinaryTree{
		static  int idx = -1;
		public static Node buildTree(int[] nodes) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
		}
		
		
	}
	public static void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(Node root) {
		if(root == null) {
			return;
			
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	//LEVEL ORDER TRAVERSAL
	public static void levelOrder(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		//first check if the queue is not empty.
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			}else {
				System.out.print(currNode.data+" ");//this prints the removed element's data
				if(currNode.left != null) {
					q.add(currNode.left);
				}
				if(currNode.right != null) {
					q.add(currNode.right);
				}
			}
			
		}
		
	}
	//COUNT OF NODES:
	public static int countOfNodes(Node root) {
		int count = 0;
		if(root==null) {
			return 0;
		}
		int leftNodes = countOfNodes(root.left);
		int rightNodes = countOfNodes(root.right);
		return leftNodes + rightNodes +1;
		
	}
	public static int sumOfNodes(Node root) {
		if(root==null) {
			return 0;
		}
		
		
		int leftsum = sumOfNodes(root.left);
		int rightsum = sumOfNodes(root.right);
		
		
		return leftsum+rightsum+root.data;
	}
	//HEIGHT OF A TREE
	public static int height(Node root) {
		if(root==null) {
			return 0;			
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		/*
		 * if(leftHeight>rightHeight) { return leftHeight; }
		 */
		int max = (rightHeight>leftHeight)?rightHeight: leftHeight;
		return max+1;
		
	}
	//DIAMETER OF A TREE: Number of Nodes in the longest path
	//case1: Diameter through the root. case 2: Diameter not through the root
	 
	public static int diameter(Node root) {
		if(root==null) {
			return 0;
		}
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = height(root.left) + height(root.right) + 1;
		
		return Math.max(diam3,Math.max(diam2, diam1));
		
		
	}
	
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BuildbinaryTree tree = new BuildbinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.print("rootnode: "+root.data);
		System.out.println();
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		levelOrder(root);
		System.out.println("Count of Nodes: "+countOfNodes(root));
		System.out.println("Sum of Nodes: "+sumOfNodes(root));
		System.out.println("Height of Tree: "+height(root));
		System.out.println("Diameter of tree(O(N2)): " + diameter(root));
	}
}
