package narytree;

import bst.Node;

import java.util.*;

public class Traverse {
    public static void main(String[] args) {

    }

    /*public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> completeList = new ArrayList<>();
        if(root == null) {
            return completeList;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList= new ArrayList<>();
            while(size >0) {
                Node  temp = queue.poll();
                levelList.add(temp.val);
                for(int i =0;i<temp.children.size();i++) {
                    queue.offer(temp.children.get(i));
                }
                if(!levelList.isEmpty())
                    completeList.add(levelList);
                size--;
            }
        }
        return completeList;
    }*/
}
