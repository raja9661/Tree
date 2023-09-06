public class BalanceBinaryTree {
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
    public int BalanceHight(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int Hleft=Height(root.left);
        if(BalanceHight(root.left)==-1)
        {
            return -1;
        }
        int Hright=Height(root.right);
        if(BalanceHight(root.right)==-1)
        {
            return -1;
        }
        if(Math.abs(Hleft-Hright)>1)
        {
            return -1;
        }
        return Math.max(Hleft, Hright)+1;
    }
    public int Height(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int Lheight=Height(root.left);
        int Rheight=Height(root.right);
        return Math.max(Lheight, Rheight)+1;
    }
    public static void main(String args[])
    {
        BalanceBinaryTree b=new BalanceBinaryTree();
        root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        int res=b.BalanceHight(root);
        if(res==-1)
        {
            System.out.println("Tree is not balanced");
        }
        else
        {
            System.out.println("Tree is balanced");
        }
    }
}
