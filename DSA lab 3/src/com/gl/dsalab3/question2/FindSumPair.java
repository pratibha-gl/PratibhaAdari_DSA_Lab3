package com.gl.dsalab3.question2;

import java.util.HashSet;
import java.util.Set;

public class FindSumPair {
	
	static class Node{
		int nodeData;
		Node leftNode, rightNode;
			
		}
	
          static Node NewNode(int nodeData) {
        	Node temp = new Node();
        	temp.nodeData = nodeData;
        	temp.leftNode = null;
        	temp.rightNode = null;
	    return temp;
         }
 public Node insert(Node root,int key) {
	 if (root == null)
		 return NewNode (key);
     if (key < root.nodeData)
    	 root.leftNode = insert(root.leftNode,key);
     else 
    	 root.rightNode = insert(root.rightNode,key);
     return root;
       
 }
  public boolean findPairUtil(Node root, int targetSum, Set<Integer> set) {
		if (root == null)
		return false;
		
		if (findPairUtil(root.leftNode, targetSum, set))
		return true;
		int diff = targetSum - root.nodeData;
		if (set.contains(diff)) {
			System.out.println("Pair is found" + "  " + (targetSum - root.nodeData) + "  " + root.nodeData );
			return true;
		}
		else 
			set.add(root.nodeData);
		return findPairUtil(root.rightNode, targetSum, set);
  }
  
  private void findPairWithGivenSum(Node root, int targetSum) {
		Set<Integer> set = new HashSet<Integer>();
		if(!findPairUtil (root, targetSum, set)) {
		System.out.println("Nodes are not found");
		}
	}

 public static void main (String args []) {
	 Node root = null;
	 FindSumPair findSP = new FindSumPair();
	 root = findSP.insert(root, 40);
	 root = findSP.insert(root, 20);
	 root = findSP.insert(root, 60);
	 root = findSP.insert(root, 10);
	 root = findSP.insert(root, 30);
	 root = findSP.insert(root, 50);
	 root = findSP.insert(root, 70);
	 int targetSum = 130;
	 findSP.findPairWithGivenSum(root,targetSum);

  }	
}
 


