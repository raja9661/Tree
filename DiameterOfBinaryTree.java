public class DiameterOfBinaryTree {
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
    int calDiameter(node root)
    { 
        if(root==null)
        {
            return 0;
        }
        int Lheight=height(root.left);
        int Rheight=height(root.right);
        int Ldiam=calDiameter(root.left);
        int Rdiam=calDiameter(root.right);
        return Math.max(Lheight + Rheight+1,Math.max(Ldiam,Rdiam));
    }
    int height(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int LSubTreed=height(root.left);
        int RSubTree=height(root.right);
        if(LSubTreed>RSubTree)
        {
            return (LSubTreed+1);
        }
        return (RSubTree+1);
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
        DiameterOfBinaryTree d=new DiameterOfBinaryTree();
        root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        root.left.left.left=new node(9);
        root.right.right.left=new node(11);
        d.traversal(root);
        System.out.println("");
        System.out.print(d.calDiameter(root)); 
    }
}
