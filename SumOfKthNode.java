import java.util.LinkedList;
import java.util.Queue;

public class SumOfKthNode {
    static class node
    {
        int data;
        node left;
        node right;

        node(int val)
        {
            data=val;
            left=null;
            right=null;
        }
    }
     public int InorderTrv(node root,int k)
    {
        if(root==null)
        {
            return 0;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int level=0;
        int sum=0;
        while(!q.isEmpty())
        {
            node curr=q.poll();
            if(curr!=null)
            {
            if(level==k)
            {
             sum+=curr.data;
            } 
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
          }
          else
          {
            if(!q.isEmpty())
            {
                q.add(null);
                level++;
            }
          }
        }  
         return sum; 
    }

    public static void main(String args[])
    {
        SumOfKthNode t=new SumOfKthNode();
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        System.out.print(t.InorderTrv(root, 0));
    }
}
