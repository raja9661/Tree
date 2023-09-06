class node
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
public class TotalNodeBinaryTree {
    node root;
    public int NumberOfNode(node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.left==null)
        {
            return 1;
        }
        return NumberOfNode(root.left)+NumberOfNode(root.right)+1;
    }
    public void traversal(node root)
    {
        if(root==null)
        {
            return;
        }
        traversal(root.left);
        System.out.print(root.data+"->");
        traversal(root.right);
    }
    public static void main(String args[])
    {
        TotalNodeBinaryTree t=new TotalNodeBinaryTree();
        t.root=new node(1);
        t.root.left=new node(2);
        t.root.right=new node(3);
        t.root.left.left=new node(4);
        t.root.left.right=new node(5);
        t.root.right.left=new node(6);
        t.root.right.right=new node(7);
        t.traversal(t.root);
        System.out.println("");
        System.out.print(t.NumberOfNode(t.root));
    }
}
