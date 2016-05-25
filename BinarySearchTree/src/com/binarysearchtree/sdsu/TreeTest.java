package com.binarysearchtree.sdsu;

 class TreeTest {
	   public static void main(String[] argv) {
		     /*1.Implements a binary search tree with addition. You dont have to implement delete on the tree.
		     2.The nodes in the tree contain strings*/
		  
		      String[] months = {null,"d","a","e","ea","eb","eab","eba"};
		      Tree tree = new Tree();
		      try{
		      for (int i = 0; i < months.length; i++)
		         tree.insert(months[i]);
		     //Print out the elements in the tree in alphabetic order. 
		      //tree.inorderTraversal();
		     	tree.postorderTraversal();
		      System.out.println();
		      }catch(Exception e){
		          System.out.println("Excpetion "+e.getMessage());
		      }
		   }
		}
