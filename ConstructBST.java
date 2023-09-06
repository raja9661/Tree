public class ConstructBST {
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
    public static node insert(node root,int val)
    {
        if(root==null)
        {
            root=new node(val);
            return root;
        }
        if(root.data==val)
        {
            System.out.print("Sorry duplicate value is not allow in BST");
            return null;
        }
        if(val<root.data)
        {
            root.left=insert(root.left, val);
        }
        else
        {
        root.right=insert(root.right, val);
        }
        return root;
    }
    public static node ConstructTree(int val[])
    {
        node root=null;
        for(int i:val)
        {
            root=insert(root,i);
        }
        return root;
    }
    public static void InorderTraversal(node root)
    {
        if(root==null)
        {
            return;
        }
        InorderTraversal(root.left);
        System.out.print(root.data+" ");
        InorderTraversal(root.right);
    }
    public static void main(String args[])
    {
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        node root = ConstructTree(keys);
        InorderTraversal(root);
        insert(root, 1);
        System.out.println("");
        InorderTraversal(root);
    }
}
