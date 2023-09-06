class Demo
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
    Demo()
    {
        root=null;
    }
    public node Insertnode(node root,int key)
    {
        if(root==null)
        {
            root=new node(key);
            return root;
        }
        if(key<root.data)
        {
            root.left=Insertnode(root.left, key);
        }
        if(key>root.data)
        {
            root.right=Insertnode(root.right, key);
        }
        return root;
    }
    public void InorderTraversal(node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+"->");
        InorderTraversal(root.left);
        InorderTraversal(root.right);
    }
    public static void main(String args[])
    {
        Demo d=new Demo();
        root=new node(10);
        root.left=new node(6);
        root.right=new node(12);
        root.left.left=new node(4);
        root.left.right=new node(8);
        root.right.left=new node(11);
        root.right.right=new node(14);
        d.InorderTraversal(root);
        d.Insertnode(root,3);
        // d.Insertnode(root,15);
        System.out.println("");
        d.InorderTraversal(root);
        System.out.println("");
    
    }
}