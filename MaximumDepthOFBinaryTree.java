public class MaximumDepthOFBinaryTree {
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
    int maxDepth(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int LSubTreed=maxDepth(root.left);
        int RSubTree=maxDepth(root.right);
        if(LSubTreed>RSubTree)
        {
            return (LSubTreed+1);
        }
        return (RSubTree+1);
    }
    public static void main(String args[])
    {
        MaximumDepthOFBinaryTree m=new MaximumDepthOFBinaryTree();
        root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        root.left.left.left=new node(9);
        System.out.print(m.maxDepth(root)); 
    }
}
