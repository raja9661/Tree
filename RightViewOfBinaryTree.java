import java.util.Queue;
import java.util.*;
public class RightViewOfBinaryTree {
    static node root;
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
    public void SphericalView(node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        System.out.print(root.data+" ");
        int level=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                node curr=q.poll();
                if(level%2==0)
                {
                if(curr.left!=null)
                {
                    q.add(curr.left);
                    System.out.print(curr.left.data+" ");
                }  
                if(curr.right!=null)
                {
                    q.add(curr.right);
                    System.out.print(curr.right.data+" ");
                }
                else
                {
                if(curr.right!=null)
                {
                    q.add(curr.right);
                    System.out.print(curr.right.data+" ");
                }
                if(curr.left!=null)
                {
                    q.add(curr.left);
                    System.out.print(curr.left.data+" ");
                }  
                }
                }
            }
            level++;
        }
    }
    public void MirrorView(node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int level=0;
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
                level++;
                continue;
            }
            if(level%2==0)
            {
                for(int i=0;i<q.size();i++)
                {
                    System.out.print(curr.data+" ");
                }
            }
            else
            {
                for(int i=q.size()-1;i>=0;i--)
                {
                    System.out.print(curr.data+" ");
                } 
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

    }
    public void RightView(node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                node curr=q.poll();
                if(i==n-1)
                {
                    System.out.print(curr.data+" ");
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
        }
    }
    public static void main(String args[])
    {
        RightViewOfBinaryTree rv=new RightViewOfBinaryTree();
        root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        // rv.RightView(root);
        rv.MirrorView(root);
    }
}
