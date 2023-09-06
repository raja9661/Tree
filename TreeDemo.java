class TreeDemo
{
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
    public node insertNode(node root,int val)
    {
        node newNode=new node(val);
        if(root==null)
        {
            root=newNode;
            return root;
        }
        else if(val<root.data)
        {
          newNode=insertNode(root.left, val);
        }
        else
        {
           newNode=insertNode(root.right, val);
        }
        return newNode;
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
        TreeDemo t=new TreeDemo();
        root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        t.traversal(root);
        System.out.println("");
        root=t.insertNode(root, 11);
        root.left=t.insertNode(root, 12);
        t.traversal(root);
    }
}