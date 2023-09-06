public class SumReplacement {
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
    public void SumRep(node root)
    {
        if(root==null)
        {
            return;
        }
        SumRep(root.left);
        SumRep(root.right);
        if(root.left!=null)
        {
            root.data+=root.left.data;
        }
        if(root.right!=null)
        {
            root.data+=root.right.data;
        }
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
        SumReplacement s=new SumReplacement();
        root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        System.out.println("Before Replacement:");
        s.traversal(root);
        System.out.println("");
        System.out.println("After Replacement:");
        s.SumRep(root);
        s.traversal(root);
    }
}
