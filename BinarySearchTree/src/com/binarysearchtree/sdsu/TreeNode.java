package com.binarysearchtree.sdsu;

import java.util.*;
import java.lang.*;
import java.io.*;
// TreeNode: simple node in a binary search tree
 class TreeNode {
   public String data;  // data at each node
   public TreeNode left, right;
   public TreeNode(String d) { // construct leaf node
   try {
       if(d==null)
       throw new NullPointerException("String empty");
      data = d;
      left = right = null;
       
   }
   catch (NullPointerException e) {
            System.out.println("Caught the NullPointerException "+e.getMessage());
        }
   }
}