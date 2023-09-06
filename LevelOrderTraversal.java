import java.util.LinkedList;
import java.util.Queue;
public class LevelOrderTraversal {
    // static node root;
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
    public void InorderTrv(node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            node curr=q.poll();
            if(curr==null)
            {
                if(q.isEmpty())
                {
                    return;
                }
                q.add(null);
                System.out.println("");
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }

    }
    
    public static void main(String args[])
    {
        LevelOrderTraversal t=new LevelOrderTraversal();
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        t.InorderTrv(root);
    }
}
